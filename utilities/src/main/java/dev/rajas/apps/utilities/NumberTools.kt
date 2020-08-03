package dev.rajas.apps.utilities

import android.content.res.Resources
import java.math.RoundingMode

fun Int?.valueOrDefault(default: Int = 0): Int = if (this !== null) this else default

fun Float?.valueOrDefault(default: Float = 0f): Float = if (this !== null) this else default

fun Double?.valueOrDefault(default: Double = 0.0): Double = if (this !== null) this else default

fun Boolean?.valueOrDefault(default: Boolean = false): Boolean = if (this !== null) this else default

fun Long?.valueOrDefault(default: Long = 0): Long = if (this !== null) this else default

fun Int.toPixel(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()

fun Int.toDp(): Int = (this / Resources.getSystem().displayMetrics.density).toInt()

fun Int?.secToMillis(): Long = if (this != null) (this * 1000).toLong() else 0

fun Double.round(decimal: Int = 2) = toBigDecimal().setScale(2, RoundingMode.HALF_EVEN)