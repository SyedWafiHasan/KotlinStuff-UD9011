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
    when (day)
    {
        "Sunday" -> food = "Daal Chawal"
        "Monday" -> food = "Rajma Chawal"
        "Tuesday" -> food = "Chhola Chawal"
        "Wednesday" -> food = "Basil Leaves"
        "Thursday" -> food = "Stuff"
        "Friday" -> food = "More Food"
        "Saturday" -> food = "Less Food"
    }
    return food
}