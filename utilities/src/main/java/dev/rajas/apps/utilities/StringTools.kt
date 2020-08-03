package dev.rajas.apps.utilities


fun String?.valueOrDefault(default: String = ""): String = if(this !== null) this else default
