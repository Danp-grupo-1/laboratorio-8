package dev.araozu.laboratorio8

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.graphics.drawable.toBitmap
import coil.imageLoader
import coil.request.ImageRequest
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import dev.araozu.laboratorio8.model.Distrito
import dev.araozu.laboratorio8.model.Partido
import kotlinx.coroutines.runBlocking

class FirebaseMessagingService : FirebaseMessagingService() {
    private suspend fun notification(title: String, content: String, imgUrl: String) {
        val ctx: Context = this

        val imgRequest = ImageRequest.Builder(this)
            .data(imgUrl)
            .build()
        val drawable = this.imageLoader.execute(imgRequest).drawable !!

        // Intent to open the app
        val intent = Intent(ctx, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(ctx, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        /* First notification action: Distrito */
        val distritoIntent = Intent(ctx, MainActivity::class.java).apply {
            // action = ACTION_SNOOZ
            putExtra("Distrito", Distrito.CHIGUATA.toString())
        }
        val distritoPendingIntent = PendingIntent.getBroadcast(ctx, 0, distritoIntent, 0)

        /* Second notification action: Partido */
        val partidoIntent = Intent(ctx, MainActivity::class.java).apply {
            putExtra("Partido", Partido.partidos[0].nombre)
        }
        val partidoPendingIntent = PendingIntent.getBroadcast(ctx, 0, partidoIntent, 0)

        val builder = NotificationCompat.Builder(ctx, CHANNEL_ID)
            .setSmallIcon(R.drawable.loading)
            .setLargeIcon(drawable.toBitmap())
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
            val m = message.notification
            Log.d("FIRE", "Title: ${m?.title} - Body: ${m?.body} - URL: ${m?.imageUrl}")

            runBlocking {
                notification(
                    title   = m?.title ?: "Titulo",
                    content = m?.body ?: "Contenido",
                    imgUrl  = m?.imageUrl.toString(),
                )
            }
        }
    }

    override fun onNewToken(token: String) {
        Log.d("FIRE", "Token: $token")
    }
}
