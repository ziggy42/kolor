package com.andreapivetta.kolor

/**
 * Colors
 * @author Andrea Pivetta
 */
enum class Color {
    BLACK {
        override fun ANSI() = "\u001B[30m"

        override fun ANSIBackground() = "\u001B[40m"
    },
    RED {
        override fun ANSI() = "\u001B[31m"

        override fun ANSIBackground() = "\u001B[41m"
    },
    GREEN {
        override fun ANSI() = "\u001B[32m"

        override fun ANSIBackground() = "\u001B[42m"
    },
    YELLOW {
        override fun ANSI() = "\u001B[33m"

        override fun ANSIBackground() = "\u001B[43m"
    },
    BLUE {
        override fun ANSI() = "\u001B[34m"

        override fun ANSIBackground() = "\u001B[44m"
    },
    MAGENTA {
        override fun ANSI() = "\u001B[35m"

        override fun ANSIBackground() = "\u001B[45m"
    },
    CYAN {
        override fun ANSI() = "\u001B[36m"

        override fun ANSIBackground() = "\u001B[46m"
    },
    LIGHT_GRAY {
        override fun ANSI() = "\u001B[37m"

        override fun ANSIBackground() = "\u001B[47m"
    },
    DARK_GRAY {
        override fun ANSI() = "\u001B[90m"

        override fun ANSIBackground() = "\u001B[100m"
    },
    LIGHT_RED {
        override fun ANSI() = "\u001B[91m"

        override fun ANSIBackground() = "\u001B[101m"
    },
    LIGHT_GREEN {
        override fun ANSI() = "\u001B[92m"

        override fun ANSIBackground() = "\u001B[102m"
    },
    LIGHT_YELLOW {
        override fun ANSI() = "\u001B[93m"

        override fun ANSIBackground() = "\u001B[103m"
    },
    LIGHT_BLUE {
        override fun ANSI() = "\u001B[94m"

        override fun ANSIBackground() = "\u001B[104m"
    },
    LIGHT_MAGENTA {
        override fun ANSI() = "\u001B[95m"

        override fun ANSIBackground() = "\u001B[105m"
    },
    LIGHT_CYAN {
        override fun ANSI() = "\u001B[96m"

        override fun ANSIBackground() = "\u001B[106m"
    },
    WHITE {
        override fun ANSI() = "\u001B[97m"

        override fun ANSIBackground() = "\u001B[107m"
    };

    /**
     * Get the ANSI foreground code
     * @return The ANSI foreground code
     */
    abstract fun ANSI(): String

    /**
     * Get the ANSI background code
     * @return The ANSI foreground code
     */
    abstract fun ANSIBackground(): String
}