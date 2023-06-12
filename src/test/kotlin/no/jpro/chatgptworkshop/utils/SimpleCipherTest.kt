package no.jpro.chatgptworkshop.utils

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SimpleCipherTest{

    @Test
    fun cipherTest(){
        val input ="Hi2YouM8ThisIsTheTestInputForTheCipher1234567890"

        val key = "encryptionKey"
        val encrypted = SimpleCipher.encrypt(input, key)
        val decrypted = SimpleCipher.decrypt(encrypted, key)

        assertEquals(input, decrypted)
    }
}
