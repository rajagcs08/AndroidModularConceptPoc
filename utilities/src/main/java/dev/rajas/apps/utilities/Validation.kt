package dev.rajas.apps.utilities

import android.util.Patterns
import android.webkit.URLUtil
import android.widget.EditText

fun EditText.showError(msg: String): Boolean {
    error = msg
    requestFocus()
    return false
}

fun EditText.isEmpty(): Boolean = text.isEmpty()

fun EditText.isNotEmpty(): Boolean = text.isNotEmpty()

fun isValidUrl(url: String): Boolean = URLUtil.isValidUrl(url) && Patterns.WEB_URL.matcher(url).matches()
