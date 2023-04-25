package no.jpro.chatgptworkshop.oppgave8

class Counter {

    var count = 0

    fun increment() {
        val temp = count
        Thread.sleep(1)
        count = temp + 1
    }

}