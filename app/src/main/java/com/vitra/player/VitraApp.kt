package com.vitra.player

import android.app.Application
import android.content.Context
import android.provider.Settings
import com.vitra.player.data.local.AppDatabase
import com.vitra.player.data.local.PreferencesManager
import java.util.UUID

class VitraApp : Application() {

    lateinit var database: AppDatabase
        private set

    lateinit var preferences: PreferencesManager
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = AppDatabase.getInstance(this)
        preferences = PreferencesManager(this)
        ensureDeviceId()
    }

    private fun ensureDeviceId() {
        var deviceId = preferences.deviceId
        if (deviceId.isNullOrBlank()) {
            val androidId = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
            deviceId = if (!androidId.isNullOrBlank() && androidId != "9774d56d682e549c") {
                androidId
            } else {
                UUID.randomUUID().toString().replace("-", "").take(16)
            }
            preferences.deviceId = deviceId
        }
    }

    companion object {
        lateinit var instance: VitraApp
            private set

        fun getDeviceId(context: Context): String {
            return (context.applicationContext as VitraApp).preferences.deviceId ?: "unknown"
        }
    }
}
