package no.jpro.chatgptworkshop.oppgave2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Oppgave2Test {

    @ParameterizedTest
    @CsvSource(
        "1, 2",
        "2, 3",
        "3, 5",
        "4, 7",
        "5, 11",
        "6, 13",
        "7, 17",
        "10001, 104743"
    )
    fun getPrimeNumberAtIndex(primeIndex: Int, expected: Int) {
        // when
        val actual = Oppgave2().getPrimeNumberAtIndex(primeIndex)

        // then
        assertThat(actual).isEqualTo(expected)
    }

}