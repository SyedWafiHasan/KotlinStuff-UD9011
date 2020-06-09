import java.util.Random;

fun main(a: Array<String>)
{
    val b = "KT"
    println("Hello ${a[0]}")
    feedTheFish()
}

fun feedTheFish()
{
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and fish eat $food")
}

fun randomDay() : String
{
    val week = listOf ("Sunday", "Monday", "Tuesday",
        "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}