package no.jpro.chatgptworkshop.oppgave6

import java.util.*

class Oppgave6 {

    fun concatenateStrings(optionalStringList: Optional<List<String>>): String {
        if (!optionalStringList.isPresent) {
            throw RuntimeException("Kan ikke konkatenere fordi Optional ikke har noen verdier")
        }

        val stringList = optionalStringList.get()

        var currentString = ""

        for (string in stringList) {
            currentString += string
        }

        return currentString
    }

}