package studio.ultoolapp.kotlinlab

import org.junit.Test

class ListSetMapTest {
    @Test
    fun list_test() {
        val list = mutableListOf<Int>()
        list.add(350)
        list[0] += 30
        println(list[0])
    }

    @Test
    fun set_test() {
        val girls = setOf("Bonnie", "Anna", "Cynthia")
        for (name in girls) {
            println("We have $name here")
        }

        val boys = setOf("Dan", "Edison")
        for ((i, v) in boys.withIndex()) {
            println("No.${i + 1} is $v")
        }
    }

    @Test
    fun map_test() {
        val grades = mutableMapOf("Daisy" to 65, "Sam" to 85)
        grades["X Æ A-12"] = 100
        grades["Daisy"] = grades["Daisy"]!! + 10
        // grades["Ellon"] = grades["Ellon"]!! + 10 // NPE
        for ((n, g) in grades) {
            println("$n's grade is $g")
        }
        println()
        println("We have another test.")
        println()
        for (entry in grades) {
            println("${entry.key}'s grade is ${entry.value}")
        }
    }

}