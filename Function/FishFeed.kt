package Function
import java.util.*    // required import
import kotlin.random.Random

fun Fishfood(day : String) :String
{
    var food=""
    when(day)
    {
        "Sunday" -> food="Mutton"
        "Monday" -> food="Chicken"
        "Tuesday" -> food="Egg"
        "Wednesday" ->food="Fish"
        "Thursday" -> food="Paneer"
        "Friday" ->food="Veg"
        "Saturday"-> food="Rooti"
    }
    return food
}

fun randomday() :String{
    val week= arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return week[Random.nextInt(week.size)]
}

fun main(){
    val day= randomday()
    val food= Fishfood(day)
    println("Today is $day and I will eat $food")
    println(shouldChangeWater(day))
    println(isSunday(day))
}



fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 20 -> true             //return true if anyone of the condition true
        day == "Sunday" ->  true
        else -> false
    }

}
fun tooHot(temp: Int)=temp>30
fun isDirty(dirt:Int)=dirt>30
fun isSunday(day: String)=day=="Sunday"