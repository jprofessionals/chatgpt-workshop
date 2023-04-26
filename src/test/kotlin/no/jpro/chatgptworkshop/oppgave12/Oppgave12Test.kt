package no.jpro.chatgptworkshop.oppgave12

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
class Oppgave12Test @Autowired constructor(
    private val oppgave12: Oppgave12
) {

    @ParameterizedTest
    @ArgumentsSource(TestDataProvider::class)
    fun getCountryInfo(country: String, expected: CountryInfoDTO) {
        // when
        val actual = oppgave12.getCountryInfo(country)

        // then
        assertThat(actual.name).isEqualTo(expected.name)
        assertThat(actual.capitals).containsExactlyInAnyOrderElementsOf(expected.capitals)
        assertThat(actual.borders).containsExactlyInAnyOrderElementsOf(expected.borders)
        assertThat(actual.currencies).containsExactlyInAnyOrderElementsOf(expected.currencies)
        assertThat(actual.officialLanguages).containsExactlyInAnyOrderElementsOf(expected.officialLanguages)
    }

    class TestDataProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext): Stream<out Arguments> {
            val norwayDTO = CountryInfoDTO(
                name = "Norway",
                capitals = listOf("Oslo"),
                borders = listOf("Sweden", "Finland", "Russia"),
                currencies = listOf("NOK"),
                officialLanguages = listOf("Norwegian", "Sami")
            )

            val switzerlandDTO = CountryInfoDTO(
                name = "Switzerland",
                capitals = listOf("Bern"),
                borders = listOf("France", "Germany", "Italy", "Austria", "Liechtenstein"),
                currencies = listOf("CHF"),
                officialLanguages = listOf("German", "French", "Italian", "Romansh")
            )

            val brazilDTO = CountryInfoDTO(
                name = "Brazil",
                capitals = listOf("Brasília"),
                borders = listOf("Argentina", "Bolivia", "Colombia", "French Guiana", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"),
                currencies = listOf("BRL"),
                officialLanguages = listOf("Portuguese")
            )

            val southAfricaDTO = CountryInfoDTO(
                name = "South Africa",
                capitals = listOf("Pretoria", "Bloemfontein", "Cape Town"),
                borders = listOf("Botswana", "Lesotho", "Namibia", "Mozambique", "Eswatini", "Zimbabwe"),
                currencies = listOf("ZAR"),
                officialLanguages = listOf("Zulu", "Xhosa", "Afrikaans", "English", "Sepedi", "Swazi", "Sesotho", "Setswana", "Xitsonga", "Tshivenda", "Ndebele")
            )

            return listOf(
                Arguments.of("Norway", norwayDTO),
                Arguments.of("Switzerland", switzerlandDTO),
                Arguments.of("Brazil", brazilDTO),
                Arguments.of("South Africa", southAfricaDTO)
            ).stream()
        }
    }

}