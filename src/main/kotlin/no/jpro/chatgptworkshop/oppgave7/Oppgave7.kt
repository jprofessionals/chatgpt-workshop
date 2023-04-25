package no.jpro.chatgptworkshop.oppgave7

class Oppgave7 {

    fun calculateSum(numbers: List<Int>): Int {
        var sum = 0
        for (i in 0..numbers.size) {
            sum += numbers[i]
        }
        return sum
    }

}