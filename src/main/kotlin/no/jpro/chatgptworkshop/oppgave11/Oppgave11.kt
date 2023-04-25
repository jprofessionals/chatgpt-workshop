package no.jpro.chatgptworkshop.oppgave11

class Oppgave11 {

    fun mystery(mystery1: Int, mystery2: Int): Long {
        val whatIsThis = Array(mystery2 + 1) { LongArray(mystery1 + 1) }

        for (i in 0..mystery2) {
            for (j in 0..mystery1) {
                if (i == 0 || j == 0) {
                    whatIsThis[i][j] = 1
                }
            }
        }

        for (somethingWeird in 1..mystery2) {
            for (somethingVeryWeird in 1..mystery1) {
                val a = somethingWeird
                val b = somethingVeryWeird
                val c = somethingWeird - 1
                val d = somethingVeryWeird - 1
                val e = whatIsThis[c][b]
                val f = whatIsThis[a][d]
                val g = e + f
                whatIsThis[a][b] = g
            }
        }

        val whatThe1 = mystery2
        val whatThe2 = mystery1
        return whatIsThis[whatThe1][whatThe2]
    }

}