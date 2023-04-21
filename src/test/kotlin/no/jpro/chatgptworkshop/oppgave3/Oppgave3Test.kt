package no.jpro.chatgptworkshop.oppgave3

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Oppgave3Test {

    @Test
    fun fargerIEventyr() {
        // given
        val expected = setOf("gul", "rød", "oransje", "blå")

        // when
        val actual = Oppgave3().fargerIEventyr()

        // then
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected)
    }

}