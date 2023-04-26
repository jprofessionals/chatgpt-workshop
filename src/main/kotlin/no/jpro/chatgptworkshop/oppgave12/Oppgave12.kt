package no.jpro.chatgptworkshop.oppgave12

import no.jpro.chatgptworkshop.utils.ChatGPTClient
import org.springframework.stereotype.Service

@Service
class Oppgave12(
    private val chatGPTClient: ChatGPTClient
) {

    fun getCountryInfo(country: String): CountryInfoDTO {
        // TODO: implement this method
        return CountryInfoDTO(
            name = "bla",
            capitals = listOf("bla"),
            borders = listOf("bla"),
            currencies = listOf("bla"),
            officialLanguages = listOf("bla")
        )
    }

}