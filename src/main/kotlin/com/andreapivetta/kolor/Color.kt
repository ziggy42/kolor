package com.andreapivetta.kolor

import com.andreapivetta.kolor.Kolor.ESCAPE

/**
 * The amount of codes required in order to jump from a foreground code to a background code. Equal to 10. For example,
 * the foreground code for blue is "[33m", its respective background code is "[43m"
 */
private const val BG_JUMP = 10

/**
 * An enumeration of colors supported by most terminals. Can be applied to both foreground and background.
 */
enum class Color(baseCode: Int) {
    BLACK(30),
    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(34),
    MAGENTA(35),
    CYAN(36),
    LIGHT_GRAY(37),

    DARK_GRAY(90),
    LIGHT_RED(91),
    LIGHT_GREEN(92),
    LIGHT_YELLOW(93),
    LIGHT_BLUE(94),
    LIGHT_MAGENTA(95),
    LIGHT_CYAN(96),
    WHITE(97);

    /** ANSI modifier string to apply the color to the text itself */
    val foreground: String = "$ESCAPE[${baseCode}m"

    /** ANSI modifier string to apply the color the text's background */
    val background: String = "$ESCAPE[${baseCode + BG_JUMP}m"
}