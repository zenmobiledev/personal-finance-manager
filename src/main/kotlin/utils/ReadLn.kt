package utils

object ReadLn {
    fun convertStringToInt(): Int = readlnOrNull()?.toIntOrNull() ?: 0
    fun getInputOrNull(): String = readlnOrNull() ?: ""
}