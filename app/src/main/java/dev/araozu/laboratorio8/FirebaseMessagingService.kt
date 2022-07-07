package dev.araozu.laboratorio8

import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        val handlerThread = HandlerThread("MyHandlerThread")
        handlerThread.start()
        val looper = handlerThread.looper
        val handler = Handler(looper)
        handler.post {
            val m = message.notification
            Log.d("FIRE", "Title: ${m?.title} - Body: ${m?.body} -")
            Toast.makeText(this, message.notification?.title, Toast.LENGTH_SHORT).show()
            // handlerThread.quit()
        }
    }

    override fun onNewToken(token: String) {
        Log.d("FIRE", "Token: $token")
    }
}
