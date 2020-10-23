package studio.ultoolapp.kotlinlab

import org.junit.Test

class VarFunctionTest {
    @Test
    fun var_and_val() {
        var rank = 3
        val value = 10
        println("Rank is $rank, Value is $value")
        rank = 6
        println("Rank is $rank, Value is $value")
        // value = 4 // Error: Value cannot be assigned
        // println("Rank is $rank, Value is $value")
    }

    @Test
    fun npe_prevent() {
        fun String.last2Char() = arrayOf(get(length - 2), get(length - 1))

        var s: String? = "Vincent"
        println(s?.last2Char()?.joinToString(",")) // 印出：n,t

        s = null
        println(s?.last2Char()?.joinToString(",")) // 印出：null
    }

    @Test
    fun nullable_deal() {
        var s1: String? = "10.25"
        println(s1!!.toDouble()) // 10.25

        var s2: String = s1
        println(s2.toDouble()) // 10.25

        s1 = null // No Exception: s1 is nullable String
        println(s1) // Print null
        // println(s1!!.toDouble()) // NullPointerException

        fun greetings(name: String?) = "Hello, $name"

        println(greetings(s2)) // Hello, 10.25
        println(greetings(s1)) // Hello, null

        s2.toUpperCase()
        // s1.toUpperCase() // unacceptable: not for nullable String

        // s2 = s1!! // NullPointerException
    }

    @Test
    fun print_fun() {
        fun addTwo(a: Int, b: Int) = a + b
        println("1 + 2 is ${addTwo(1, 2)}")
    }

}