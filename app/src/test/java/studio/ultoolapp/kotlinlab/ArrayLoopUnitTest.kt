package studio.ultoolapp.kotlinlab

import org.junit.Assert.assertEquals
import org.junit.Test

class ArrayLoopUnitTest {
    @Test
    fun for_loop_testing() {
        for (i in 1..5) print("$i,") // 1, 2, 3, 4, 5
        println()
        // for (i in 5 until -5 step -2) println(i) // error: IllegalArgumentException: Step must be positive
        for (i in 3 until 10 step 3) print("$i,") // 3, 6, 9
        println()
        //for (i in 1.0f .. 3.0f step 0.5f) print("$i,") // Unsolved Reference: cannot use float for iterator.
        // Plz use while, or define own step: https://stackoverflow.com/questions/44315977/
        for (i in 5 downTo -5 step 3) print("$i,") // 5, 2, -1, 4
        println()
    }

    @Test
    fun for_loop_breakout_testing() {
        // run 9*9 Table, if the result can divide by 24, end this row and move on
        // label @ is applicable in loops, and be assigned to continue / break
        mark@ for (i in 1..9) {
            for (j in 1..9) {
                if (i * j % 24 == 0) {
                    println("Row $i: $i*$j is " + i * j)
                    continue@mark
                }
            }
            println("Row $i has nothing to do with 24.") // rows containing 24n won't print this: 3,4, 6, 8, 9
        }
        // check until the sum is over 24
        // label is reusable / one-time using in every loop nest.
        mark@ for (i in 1..100) {
            var sum = 0
            for (j in 1..i) {
                sum += j
                if (sum >= 24) {
                    println("Reached 24 from 1 to $j")
                    break@mark
                }
            }
            println("Not reach 24 yet from 1 to $i")
        }

    }

    @Test
    fun array_summing() {
        val arr = intArrayOf(30, 6, 5, 7, -2)
        var sum = 0
        for (i in arr) {
            sum += i
        }
        assertEquals(30 + 6 + 5 + 7 - 2, sum)

        val arr2 = arrayOf("Anna", "Bonnie", "Cynthia")
        var greetings = "Greetings, "
        for (i in arr2.indices) {
            greetings += arr2[i]
            if (i != arr2.lastIndex) greetings += ", "
        }
        assertEquals("Greetings, Anna, Bonnie, Cynthia", greetings)
    }

    @Test
    fun array_loop_calculation() {
        val names = arrayOf(
            arrayOf("Anna", "Bonnie", "Cynthia"),
            arrayOf("Darcy", "Edison"),
            arrayOf("Frank", "George")
        )
        // search for Edison
        search@ for (i in names.indices) {
            for (j in names[i].indices) {
                if (names[i][j] == "Edison") {
                    println("Found Edison in row $i, col $j.")
                    break@search
                }
            }
            println("Edison is not in row $i")
        }
        fun all_minus_ten(vararg scores: Int): IntArray {
            val result = IntArray(scores.size)
            for (i in scores.indices) {
                result[i] = scores[i] - 10
            }
            return result
        }
        println("Modified points are: ${all_minus_ten(30, 60, 50, 0)}")
    }
}