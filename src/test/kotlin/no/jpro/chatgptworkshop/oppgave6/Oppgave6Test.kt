package no.jpro.chatgptworkshop.oppgave6

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.util.*

class Oppgave6Test {

    @Test
    fun concatenateStrings() {
        // given
        val input = Optional.of(listOf("Dette ", "er ", "en ", "kreativ ", "setning." ))
        val expected = "Dette er en kreativ setning."

        // when
        val actual = Oppgave6().concatenateStrings(input)

        // then
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun concatenateStringsThrowsException() {
        // given
        val input = Optional.empty<List<String>>()
        val expectedExceptionMessage = "Kan ikke konkatenere fordi Optional ikke har noen verdier"

        // then
        val exception = assertThrows<RuntimeException> {
            Oppgave6().concatenateStrings(input)
        }

        assertThat(exception.message).isEqualTo(expectedExceptionMessage)
    }

}