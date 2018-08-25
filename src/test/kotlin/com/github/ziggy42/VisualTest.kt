package com.github.ziggy42

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it

object VisualTest : Spek({
    // This test doesn't make any assertions, but rather lets the tester visually verify that everything is working as
    // expected
    it("should print out a string for every color") {
        for (c in Color.values()) {
            println(Kolor.foreground("${c.name} in foreground", c))
            println(Kolor.background("${c.name} in background", c))
        }
    }
})
