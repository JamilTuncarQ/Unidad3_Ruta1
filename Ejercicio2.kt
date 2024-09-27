
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String?,
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {
    val event = Event(
        title = "Estudiar Kotlin",
        description = "Comprometerse a estudiar Kotlin al menos 15 minutos al día.",
        daypart = Daypart.EVENING,  
        durationInMinutes = 15
    )   
    println(event)
}
