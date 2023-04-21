package no.jpro.chatgptworkshop.oppgave5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.stream.Stream

/**
 * Test cases for Oppgave5.
 */
@SpringBootTest
class Oppgave5Test @Autowired constructor(
    private val oppgave5: Oppgave5
) {

    /**
     * Test method to verify if `findLanguage()` returns the expected language for each input sentence.
     */
    @ParameterizedTest
    @ArgumentsSource(SentencesProvider::class)
    fun findLanguage(sentence: String, expected: String) {
        // when
        val actual = oppgave5.findLanguage(sentence)

        // then
        assertThat(actual).isEqualTo(expected)
    }

    /**
     * A provider of test input arguments.
     */
    class SentencesProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext): Stream<out Arguments> {
            return listOf(
                Arguments.of("Ibsens ripsbærbusker og andre buskevekster", "Norwegian"),
                Arguments.of("Es ist neblig heute.", "German"),
                Arguments.of("Il y a du brouillard aujourd'hui.", "French"),
                Arguments.of("写作“今天有雾", "Chinese")
            ).stream()
        }
    }
}