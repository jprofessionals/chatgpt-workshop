package no.jpro.chatgptworkshop.utils

import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.chat.ChatCompletion
import com.aallam.openai.api.chat.ChatCompletionRequest
import com.aallam.openai.api.chat.ChatMessage
import com.aallam.openai.api.chat.ChatRole
import com.aallam.openai.api.model.ModelId
import com.aallam.openai.client.OpenAI
import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class ChatGPTClient(
    @Value("\${apikey}") private val apiDecryptionKey: String
) {
    private val apikey = "sk-"+SimpleCipher.decrypt("bz7iCFTRBAmPnRuOI221uUcC2BgkX5lcsTcPGrZ1sVEwsBK1", apiDecryptionKey)
    private val openAI: OpenAI = OpenAI(apikey)

    @OptIn(BetaOpenAI::class)
    fun chat(message: String): String? {
        return runBlocking {
            val chatComRequest = ChatCompletionRequest(
                model = ModelId("gpt-3.5-turbo-0301"),
                messages = listOf(
                    ChatMessage(
                        role = ChatRole.User,
                        content = message
                    )
                )
            )
            val completion: ChatCompletion = openAI.chatCompletion(chatComRequest)

            completion.choices.first().message?.content
        }
    }
}