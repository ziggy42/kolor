package com.andreapivetta.kolor

import com.andreapivetta.kolor.Kolor.RESET
import org.junit.Assert.assertEquals
import org.junit.Test

class KolorTest {

    @Test
    fun `should create a string that starts with an ANSI code and ends with the reset code`() {
        Color.values().forEach { color ->
            assertEquals("${color.foreground}foo$RESET", Kolor.foreground("foo", color))
            assertEquals("${color.background}foo$RESET", Kolor.background("foo", color))
        }
    }
}
