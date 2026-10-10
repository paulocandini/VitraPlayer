package com.vitra.player.data.local

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

class PreferencesManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("vitra_prefs", Context.MODE_PRIVATE)

    var deviceId: String?
        get() = prefs.getString(KEY_DEVICE_ID, null)
        set(value) = prefs.edit { putString(KEY_DEVICE_ID, value) }

    var parentalPin: String
        get() = prefs.getString(KEY_PARENTAL_PIN, "0000") ?: "0000"
        set(value) = prefs.edit { putString(KEY_PARENTAL_PIN, value) }

    var lastUpdateTimestamp: Long
        get() = prefs.getLong(KEY_LAST_UPDATE, 0L)
        set(value) = prefs.edit { putLong(KEY_LAST_UPDATE, value) }

    var listUrl: String?
        get() = prefs.getString(KEY_LIST_URL, null)
        set(value) = prefs.edit { putString(KEY_LIST_URL, value) }

    var xtreamHost: String?
        get() = prefs.getString(KEY_XTREAM_HOST, null)
        set(value) = prefs.edit { putString(KEY_XTREAM_HOST, value) }

    var xtreamUser: String?
        get() = prefs.getString(KEY_XTREAM_USER, null)
        set(value) = prefs.edit { putString(KEY_XTREAM_USER, value) }

    var xtreamPass: String?
        get() = prefs.getString(KEY_XTREAM_PASS, null)
        set(value) = prefs.edit { putString(KEY_XTREAM_PASS, value) }

    var expirationDate: Long
        get() = prefs.getLong(KEY_EXPIRATION, 0L)
        set(value) = prefs.edit { putLong(KEY_EXPIRATION, value) }

    var language: String
        get() = prefs.getString(KEY_LANGUAGE, "pt-BR") ?: "pt-BR"
        set(value) = prefs.edit { putString(KEY_LANGUAGE, value) }

    companion object {
        private const val KEY_DEVICE_ID = "device_id"
        private const val KEY_PARENTAL_PIN = "parental_pin"
        private const val KEY_LAST_UPDATE = "last_update"
        private const val KEY_LIST_URL = "list_url"
        private const val KEY_XTREAM_HOST = "xtream_host"
        private const val KEY_XTREAM_USER = "xtream_user"
        private const val KEY_XTREAM_PASS = "xtream_pass"
        private const val KEY_EXPIRATION = "expiration_date"
        private const val KEY_LANGUAGE = "language"
    }
}
