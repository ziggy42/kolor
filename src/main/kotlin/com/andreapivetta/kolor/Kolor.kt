package com.andreapivetta.kolor

import kotlin.math.floor
import kotlin.math.log

/**
 * Object to add color information to strings
 * @author Andrea Pivetta
 */
object Kolor {
    internal const val ESCAPE = '\u001B'
    internal const val RESET = "$ESCAPE[0m"

    /**
     * Create a string that will be printed with the specified color as foreground
     * @param string The string to color
     * @param color The color to use
     * @return The colored string
     */
    fun foreground(string: String, color: Color) = color(string, color.foreground)

    /**
     * Create a string that will be printed with the specified color as foreground.
     * The passed hex must be in the RRGGBB form. Eg: 0xFF8000, 0x404040,...
     * @param string The string to color
     * @param hex The hex code of the color to use.
     * @return The coloured string.
     */
    fun foreground(string: String, hex: Long): String {
        val (red, green, blue) = parseLongToHex(hex)
        return color(string, "$ESCAPE[38;2;$red;$green;${blue}m")
    }

    /**
     * Create a string that will be printed with the specified color as background.
     * The passed hex must be in the RRGGBB form. Eg: 0xFF8000, 0x404040,...
     * @param string The string to color
     * @param hex The hex code of the color to use.
     * @return The colored string
     */
    fun background(string: String, hex: Long): String {
        val (red, green, blue) = parseLongToHex(hex)
        return color(string, "$ESCAPE[48;2;$red;$green;${blue}m")
    }

    /**
     * Create a string that will be printed with the specified color as background
     * @param string The string to color
     * @param color The color to use
     * @return The colored string
     */
    fun background(string: String, color: Color) = color(string, color.background)

    private fun color(string: String, ansiString: String) = "$ansiString$string$RESET"

    private fun parseLongToHex(hex: Long): List<Long> {
        if (floor(log(hex.toDouble(), 16.0)) + 1 != 6.0)
            throw IllegalArgumentException("Hex must be 6 digits RRGGBB. Received hex ${hex.toString(16)}")

        var hexCode = hex
        val hexs = mutableListOf<Long>()
        while (hexCode != 0L) {
            hexs.add(hexCode % 0x100)
            hexCode /= 0x100
        }
        return hexs.reversed()
    }
}