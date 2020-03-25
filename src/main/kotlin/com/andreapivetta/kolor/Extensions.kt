package com.andreapivetta.kolor

import com.andreapivetta.kolor.Color.*

/**
 * Extension functions to get colored strings
 * @author Andrea Pivetta
 */

fun String.color(color: Color) = Kolor.foreground(this, color)
fun String.backgroundColor(color: Color) = Kolor.background(this, color)

fun String.black() = this.color(BLACK)

fun String.red() = this.color(RED)

fun String.green() = this.color(GREEN)

fun String.yellow() = this.color(YELLOW)

fun String.blue() = this.color(BLUE)

fun String.magenta() = this.color(MAGENTA)

fun String.cyan() = this.color(CYAN)

fun String.lightGray() = this.color(LIGHT_GRAY)

fun String.lightRed() = this.color(LIGHT_RED)

fun String.lightGreen() = this.color(LIGHT_GREEN)

fun String.lightYellow() = this.color(LIGHT_YELLOW)

fun String.lightBlue() = this.color(LIGHT_BLUE)

fun String.lightMagenta() = this.color(LIGHT_MAGENTA)

fun String.lightCyan() = this.color(LIGHT_CYAN)

fun String.lightWhite() = this.color(WHITE)

fun String.blackBackground() = this.backgroundColor(BLACK)

fun String.redBackground() = this.backgroundColor(RED)

fun String.greenBackground() = this.backgroundColor(GREEN)

fun String.yellowBackground() = this.backgroundColor(YELLOW)

fun String.blueBackground() = this.backgroundColor(BLUE)

fun String.magentaBackground() = this.backgroundColor(MAGENTA)

fun String.cyanBackground() = this.backgroundColor(CYAN)

fun String.lightGrayBackground() = this.backgroundColor(LIGHT_GRAY)

fun String.lightRedBackground() = this.backgroundColor(LIGHT_RED)

fun String.lightGreenBackground() = this.backgroundColor(LIGHT_GREEN)

fun String.lightYellowBackground() = this.backgroundColor(LIGHT_YELLOW)

fun String.lightBlueBackground() = this.backgroundColor(LIGHT_BLUE)

fun String.lightMagentaBackground() = this.backgroundColor(LIGHT_MAGENTA)

fun String.lightCyanBackground() = this.backgroundColor(LIGHT_CYAN)

fun String.lightWhiteBackground() = this.backgroundColor(WHITE)
