package no.jpro.chatgptworkshop.oppgave1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Oppgave1Test {

    @Test
    fun sumOfMultiples() {
        // given
        val multiple1 = 3
        val multiple2 = 5
        val max = 1000

        // when
        val actual = Oppgave1().sumOfMultiples(multiple1, multiple2, max)

        // then
        assertThat(actual).isEqualTo(233168)
    }
}