
data class Event(
    val title: String,
    val description: String?,
    val daypart: String,
    val durationInMinutes: Int
)

fun main() {
    val event = Event(
        title = "Estudiar Kotlin",
        description = "Comprometerse a estudiar Kotlin al menos 15 minutos al día.",
        daypart = "Noche",
        durationInMinutes = 15
    )
    println(event)
}
