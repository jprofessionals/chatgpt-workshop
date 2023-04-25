package no.jpro.chatgptworkshop.oppgave8

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Oppgave8Test {

    @Test
    fun increaseTo1000() {
        // given
        val expected = 1000

        // then
        for (i in 1..10) {
            val actual = Oppgave8().increaseTo1000()
            assertThat(actual).isEqualTo(expected)
        }
    }

}