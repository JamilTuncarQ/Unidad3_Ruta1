
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
    val events: MutableList<Event> = mutableListOf()

    events.add(Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0))
    events.add(Event(title = "Eat breakfast", description = null, daypart = Daypart.MORNING, durationInMinutes = 15))
    events.add(Event(title = "Morning run", description = null, daypart = Daypart.MORNING, durationInMinutes = 30))
    events.add(Event(title = "Learn about Kotlin", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 30))
    events.add(Event(title = "Practice Compose", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 60))
    events.add(Event(title = "Watch latest DevBytes video", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 10))
    events.add(Event(title = "Check out latest Android Jetpack library", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 45))
    events.add(Event(title = "Dinner with family", description = null, daypart = Daypart.EVENING, durationInMinutes = 60))
    events.add(Event(title = "Watch a movie", description = null, daypart = Daypart.EVENING, durationInMinutes = 120))

    println("Last event of the day: ${events.last().title}")
}

