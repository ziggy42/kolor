package com.andreapivetta.kolor

object Kolor {
    private const val RESET = "\u001B[0m"

    fun foreground(string: String, color: Color) = Kolor.color(string, color.ANSI())

    fun background(string: String, color: Color) = Kolor.color(string, color.ANSIBackground())

    private fun color(string: String, ansiString: String) = "$ansiString$string$RESET"
}