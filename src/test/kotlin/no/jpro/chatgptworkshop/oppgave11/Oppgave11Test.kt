package no.jpro.chatgptworkshop.oppgave11

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Oppgave11Test {

    @ParameterizedTest
    @CsvSource(
        "2, 2, 6",
        "20, 20, 137846528820"
    )
    fun mystery(arg1: Int, arg2: Int, expected: Long) {
        // when
        val actual = Oppgave11().mystery(arg1, arg2)

        // then
        assertThat(actual).isEqualTo(expected)
    }

}