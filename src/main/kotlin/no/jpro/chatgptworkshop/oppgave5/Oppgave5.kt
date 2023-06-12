package no.jpro.chatgptworkshop.oppgave5

import no.jpro.chatgptworkshop.utils.ChatGPTClient
import org.springframework.stereotype.Service

@Service
class Oppgave5(
    private val chatGPTClient: ChatGPTClient
) {

    fun findLanguage(text: String): String? {
        // TODO: Implement this method
        return "tullball"
    }

}