package utils

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object DateUtils {
    private val formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss")
    fun getDateTime(): String {
        val currentDateTime = LocalDateTime.now()
        return currentDateTime.format(formatter)
    }
}