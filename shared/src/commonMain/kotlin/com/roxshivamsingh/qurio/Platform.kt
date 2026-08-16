package com.roxshivamsingh.qurio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform