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
    val food = fishFood(day)
    println("Today is $day and fish eat $food")
}

fun randomDay() : String
{
    val week = listOf ("Sunday", "Monday", "Tuesday",
        "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String
{
    var food = "fasting"
    return when (day)
    {
        "Sunday" -> "Daal Chawal"
        "Monday" -> "Rajma Chawal"
        "Tuesday" -> "Chhola Chawal"
        "Wednesday" -> "Basil Leaves"
        "Thursday" -> "Stuff"
        "Friday" -> "More Food"
        "Saturday" -> "Less Food"
        else -> "Nothing"
    }
}