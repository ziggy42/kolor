package com.github.ziggy42

import com.github.ziggy42.Kolor.RESET
import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object KolorTest : Spek({
    describe("foreground/background") {
        it("should create a string that starts with an ANSI code and ends with the reset code") {
            Color.values().forEach { color ->
                Kolor.foreground("foo", color).should.equal("${color.foreground}foo$RESET")
                Kolor.background("foo", color).should.equal("${color.background}foo$RESET")
            }
        }
    }
})
