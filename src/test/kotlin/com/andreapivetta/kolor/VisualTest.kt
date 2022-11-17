package com.andreapivetta.kolor

import org.junit.Test

/**
* This test doesn't make any assertions, but rather lets the tester visually verify that everything is working as
* expected
*/
class VisualTest {

    @Test
    fun `should print out a string for every color`() {
        for (c in Color.values()) {
            println(Kolor.foreground("${c.name} in foreground", c))
            println(Kolor.background("${c.name} in background", c))
        }
    }

    @Test
    fun `should print out a custom foreground color`() {
        println(Kolor.foreground("Orange in foreground", 0xFF8000))
        println(Kolor.background("Orange in background", 0xFF8000))
    }
}
