package no.jpro.chatgptworkshop.utils

class ChatGPTClient {
    val apiKey: String
    val openAI: OpenAI
    init {
        val properties = Properties()
        this::class.java.getResourceAsStream("/secret.properties").use { inputStream ->
            properties.load(inputStream)
        }
        apiKey = properties.getProperty("apiKey")
        openAI = OpenAI(apiKey)
    }

    @OptIn(BetaOpenAI::class)
    suspend fun chatGpt() {
        // val models = openAI.models()
        val chatComRequest = ChatCompletionRequest(
            model = ModelId("gpt-3.5-turbo-0301"),
            messages = listOf(
                ChatMessage(
                    role = ChatRole.User,
                    content = "Hello, are you a cool chatbot?"
                )
            )
        )
        val completion: ChatCompletion = openAI.chatCompletion(chatComRequest)

        println("**************************** Important message follows ****************************")
        println()
        println(completion.choices.first().message?.content)

        println()
        println("**************************** Important message has concluded ****************************")
    }
}