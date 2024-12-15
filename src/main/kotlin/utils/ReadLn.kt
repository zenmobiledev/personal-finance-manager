package utils

object ReadLn {
    fun convertStringToInt(): Int = readlnOrNull()?.trim()?.toIntOrNull() ?: 0
    fun getInputOrNull(): String = readlnOrNull() ?: ""
}