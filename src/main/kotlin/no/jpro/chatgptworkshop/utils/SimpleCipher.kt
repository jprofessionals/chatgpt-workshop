package no.jpro.chatgptworkshop.utils

object  SimpleCipher {
    val chars = ('A'..'Z') + ('a'..'z') + ('0'..'9')

    fun encrypt(input: String, key: String): String {
        val shift = key.sumOf { it.code } % chars.size
        return input.map {
            shiftChar(it, shift)
        }.joinToString("")
    }

    fun decrypt(input: String, key: String): String {
        val shift = key.sumOf { it.code } % chars.size
        return input.map {
            shiftChar(it, -shift)
        }.joinToString("")
    }

    private fun shiftChar(c: Char, shift: Int): Char {
        val index = chars.indexOf(c)
        return if (index != -1) {
            chars[(index + shift + chars.size) % chars.size]
        } else c
    }
}