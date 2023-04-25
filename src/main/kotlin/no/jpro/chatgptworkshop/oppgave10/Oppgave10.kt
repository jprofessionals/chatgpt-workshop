package no.jpro.chatgptworkshop.oppgave10

class Oppgave10 {

    fun isAbove100(number: Int?): Boolean {
        number ?: throw IllegalArgumentException("Kan ikke sjekke om et tall er over 100 hvis det er null")

        return number > 100
    }

}
