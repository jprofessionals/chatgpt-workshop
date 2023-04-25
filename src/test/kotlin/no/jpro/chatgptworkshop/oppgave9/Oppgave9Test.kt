package no.jpro.chatgptworkshop.oppgave9

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.stream.Stream

@SpringBootTest
class Oppgave9Test @Autowired constructor(
    private val oppgave9: Oppgave9
) {

    @ParameterizedTest
    @ArgumentsSource(TestDataProvider::class)
    fun isPositiveTone(text: String, expected: Boolean) {
        // when
        val actual = oppgave9.isPositiveTone(text)

        // then
        assertThat(actual).isEqualTo(expected)
    }

    class TestDataProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext): Stream<out Arguments> {
            return listOf(
                Arguments.of("Denne oppgaven var bra!", true),
                Arguments.of("Denne oppgaven var dårlig...", false),
                Arguments.of("Jeg lærte masse av denne oppgaven, men det hjelper ikke, jeg kommer sikkert til å glemme det i morgen uansett.", false),
                Arguments.of("Masse nyttig info i dag", true)
            ).stream()
        }
    }

}