package no.jpro.chatgptworkshop.oppgave8

import kotlin.concurrent.thread

class Oppgave8 {

    fun increaseTo1000(): Int {
        val counter = Counter()

        val threads = mutableListOf<Thread>()

        for (i in 1..1000) {
            threads += thread {
                counter.increment()
            }
        }

        threads.forEach { it.join() }

        return counter.count
    }

}