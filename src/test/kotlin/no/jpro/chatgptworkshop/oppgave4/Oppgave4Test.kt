package no.jpro.chatgptworkshop.oppgave4

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Oppgave4Test {

    @ParameterizedTest
    @CsvSource(
        "I, 1",
        "II, 2",
        "III, 3",
        "IV, 4",
        "V, 5",
        "VI, 6",
        "IX, 9",
        "X, 10",
        "XL, 40",
        "L, 50",
        "XC, 90",
        "C, 100",
        "CD, 400",
        "D, 500",
        "CM, 900",
        "M, 1000",
        "MCMXCVI, 1996",
        "MMXXI, 2021"
    )
    fun romanToDecimal(roman: String, expected: Int) {
        // when
        val actual = Oppgave4().romanToDecimal(roman)

        // then
        assertThat(actual).isEqualTo(expected)
    }

}