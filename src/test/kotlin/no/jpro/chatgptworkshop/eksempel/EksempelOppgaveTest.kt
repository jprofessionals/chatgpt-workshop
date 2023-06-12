package no.jpro.chatgptworkshop.eksempel

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class EksempelOppgaveTest {

    @Test
    fun halloVerden() {
        val oppgave = EksempelOppgave()
        assertEquals("Hallo verden!", oppgave.halloVerden())
    }
}