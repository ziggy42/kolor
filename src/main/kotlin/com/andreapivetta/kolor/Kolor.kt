package com.andreapivetta.kolor

/**
 * Object to add color information to strings
 * @author Andrea Pivetta
 */
object Kolor {
    private const val RESET = "\u001B[0m"

    /**
     * Create a string that will be printed with the specified color as foreground
     * @param string The string to color
     * @param color The color to use
     * @return The colored string
     */
    fun foreground(string: String, color: Color) = Kolor.color(string, color.ANSI())

    /**
     * Create a string that will be printed with the specified color as background
     * @param string The string to color
     * @param color The color to use
     * @return The colored string
     */
    fun background(string: String, color: Color) = Kolor.color(string, color.ANSIBackground())

    private fun color(string: String, ansiString: String) = "$ansiString$string$RESET"
}