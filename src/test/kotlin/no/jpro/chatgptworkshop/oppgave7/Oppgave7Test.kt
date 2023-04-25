package no.jpro.chatgptworkshop.oppgave7

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Oppgave7Test {

    @Test
    fun calculateSum() {
        // given
        val input = listOf(1, 2, 3)
        val expected = 6

        // when
        val actual = Oppgave7().calculateSum(input)

        // then
        assertThat(actual).isEqualTo(expected)
    }

}