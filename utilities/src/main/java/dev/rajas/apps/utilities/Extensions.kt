package dev.rajas.apps.utilities

import android.content.Intent
import android.content.SharedPreferences
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun SharedPreferences.edit(block: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    block(editor)
    editor.apply()
}


fun <K, V> Map<K, V>.last() = get(keys.last())

fun Handler.postDelayed(delay: Long, runnable: Runnable) {
    postDelayed(runnable, delay)
}

fun ViewGroup.inflate(@LayoutRes id: Int): View = LayoutInflater.from(this.context).inflate(id, this, false)

inline infix fun Exception?.exception(exception: (Exception) -> Unit) {
    if (this !== null) exception(this)
}

inline fun <T> T?.ifNotNull(block: (T) -> Unit): Boolean {
    return if (this !== null) {
        block(this)
        true
    } else false
}

inline fun <T> T?.ifNull(block: () -> Unit): Boolean {
    return if (this === null) {
        block()
        true
    } else false
}

fun <T> Collection<T>?.isNotEmpty(): Boolean = this !== null && size > 0

fun <T> Collection<T>?.toJoinAsString():String?{
    var result:String ?= null
    if(this?.size.valueOrDefault()>0) this?.forEach { it ->
        result = if (result != null) "$result,$it" else "$it"
    }
    return result
}

fun <T> T?.isNotNull() = this !== null

fun Intent.addClearTaskFlag(): Intent = addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)

fun Intent.addClearTopFlag(): Intent = addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)

fun Intent.addSingleTopFlag(): Intent = addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)

val Any.TAG: String
    get() = this.javaClass.simpleName

inline infix fun Boolean.otherwise(block: () -> Unit) {
    if (this.not()) {
        block.invoke()
    }
}


