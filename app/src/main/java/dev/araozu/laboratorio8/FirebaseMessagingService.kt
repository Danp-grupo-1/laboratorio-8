package dev.araozu.laboratorio8

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.graphics.drawable.toBitmap
import coil.imageLoader
import coil.request.ImageRequest
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import kotlinx.coroutines.runBlocking

class FirebaseMessagingService : FirebaseMessagingService() {
    private suspend fun createNotification(
        title: String,
        content: String,
        imgUrl: String,
        partido: String,
        distrito: String,
    ) {
        val ctx: Context = this

        val imgRequest = ImageRequest.Builder(this)
            .data(imgUrl)
            .build()
        val drawable = this.imageLoader.execute(imgRequest).drawable!!
        val image = drawable.toBitmap()

        // Intent to open the app
        val intent = Intent(ctx, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(
            ctx,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE
        )


        /* First notification action: Distrito */
        val distritoIntent = Intent(ctx, MainActivity::class.java).apply {
            putExtra("Distrito", distrito)
            putExtra("Partido", partido)
            putExtra("Accion", "Distrito")
        }
        val distritoPendingIntent = PendingIntent.getActivity(
            ctx,
            0,
            distritoIntent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )


        /* Second notification action: Partido */
        val partidoIntent = Intent(ctx, MainActivity::class.java).apply {
            putExtra("Distrito", distrito)
            putExtra("Partido", partido)
            putExtra("Accion", "Partido")
        }
        val partidoPendingIntent = PendingIntent.getActivity(
            ctx,
            0,
            partidoIntent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )

        /* Custom layout */
        val smallLayout = RemoteViews(ctx.packageName, R.layout.notification_small)
        smallLayout.setTextViewText(R.id.notification_title, title)
        smallLayout.setTextViewText(R.id.notification_body, content)
        smallLayout.setImageViewBitmap(R.id.notification_image, image)

        val expandedLayout = RemoteViews(ctx.packageName, R.layout.notification_expanded)
        expandedLayout.setTextViewText(R.id.notification_title, title)
        expandedLayout.setTextViewText(R.id.notification_body, content)
        expandedLayout.setImageViewBitmap(R.id.notification_image, image)
        expandedLayout.setOnClickPendingIntent(R.id.notification_action1, distritoPendingIntent)
        expandedLayout.setOnClickPendingIntent(R.id.notification_action2, partidoPendingIntent)

        val builder = NotificationCompat.Builder(ctx, CHANNEL_ID)
            .setCustomContentView(smallLayout)
            .setCustomBigContentView(expandedLayout)
            .setSmallIcon(R.drawable.loading)
            .setLargeIcon(image)
            .setContentTitle(title)
            .setContentText(content)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .addAction(R.drawable.loading, "Distrito", distritoPendingIntent)
            .addAction(R.drawable.loading, "Partido", partidoPendingIntent)
            .setAutoCancel(true)

        with(NotificationManagerCompat.from(ctx)) {
            notify(0, builder.build())
        }
    }

    override fun onMessageReceived(message: RemoteMessage) {
        val handlerThread = HandlerThread("MyHandlerThread")
        handlerThread.start()
        val looper = handlerThread.looper
        val handler = Handler(looper)
        handler.post {
            val notification = message.notification
            val data = message.data

            val titulo = notification?.title
            val cuerpo = notification?.body
            val urlImg = notification?.imageUrl?.toString()
            val partido = data["Partido"]
            val distrito = data["Distrito"]

            Log.d(
                "FIRE", """
                Title: $titulo - 
                Body: $cuerpo - 
                URL: $urlImg -
                Partido: $partido -
                Distrito: $distrito
                """.trimIndent()
            )

            if (
                titulo == null || cuerpo == null || urlImg == null
                || partido == null || distrito == null
            ) {
                Log.d("FIRE", "There is a null value")
                return@post
            }

            runBlocking {
                createNotification(
                    title = titulo,
                    content = cuerpo,
                    imgUrl = urlImg,
                    distrito = distrito,
                    partido = partido,
                )
            }
        }
    }
// c0M4wkXJRuuhwRW0YcHRIv:APA91bHJqgz5oWLclmwLf0fDyi_SqK_V_vSvMUcZT7S5L8VbnEMQCdLykbCcz-8h2z3idxaow_m4dqzmygX2DlmOIgVRjwLIIL7hhFJVRMU3I84gTFA8s8HFcl3qiDdGlc5Rdco8rzx6
    override fun onNewToken(token: String) {
        Log.d("FIRE", "Token: $token")
        FirebaseMessaging.getInstance().subscribeToTopic("Lab8")
    }
}
