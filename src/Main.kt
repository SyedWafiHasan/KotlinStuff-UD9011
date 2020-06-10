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
    if (shouldChangeWater(day))
        println("Change water")
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

fun hardwareReading() = 20

fun shouldChangeWater(day: String, temperature : Int = 22, dirtiness : Int = hardwareReading()) : Boolean
{
    var isHot = temperature > 30
    var isDirty = dirtiness > 50
    var isSunday = day == "Sunday"

    return when
    {
        isHot -> true
        isDirty -> true
        isSunday -> true
        else -> false
    }
}