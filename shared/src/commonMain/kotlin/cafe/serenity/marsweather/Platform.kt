package cafe.serenity.marsweather

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform