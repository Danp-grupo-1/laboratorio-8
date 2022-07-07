package dev.araozu.laboratorio8

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

/* Single token: fe_oD-1aTRuBHNJ747qN72:APA91bGvv0Y_MZ0dlvUNIBUiC21uyF0vNBnKlu-jpHZy52v8Lcvx93jndwVoGChlZbyC2yxsOrB96FlDUqfZzMQ8jTIkBLEFtoSb1KWlnkckX7EiPJJrRQ1DOxkvjW-GPkwefKprvaO- */
class FirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        Log.d("FIRE", "Token: $token")
    }
}
