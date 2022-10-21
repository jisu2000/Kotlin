
fun main(){
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("$mylist")
    val list1= listOf<Int>(1,2,3)
    val list2= listOf<Int>(4,5)

    val list3=list1+list2

    val d2= listOf(1,2,3)
    val d3= listOf(4,5)

    val d4= listOf(d2,d3)

    println(d4)

    println(list3)

    //Transform all the list to one list
    println("Flat: ${mylist.flatten()}")
}