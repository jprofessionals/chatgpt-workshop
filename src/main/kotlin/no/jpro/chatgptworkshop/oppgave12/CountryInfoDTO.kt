package no.jpro.chatgptworkshop.oppgave12

data class CountryInfoDTO (
    val name: String,
    val capitals: List<String>,
    val borders: List<String>,
    val currencies: List<String>,
    val officialLanguages: List<String>
)