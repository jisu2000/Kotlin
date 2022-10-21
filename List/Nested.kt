package List



fun main() {
    var numbers= intArrayOf(1,2,3)
    val ocean= listOf("Atlantic","Parafic")
    val oddlist=listOf(numbers.contentToString(),ocean,"Jisu")


    println("${oddlist}")

    var array = Array (6) { it * 3 }
    array[0]=1
    println(java.util.Arrays.toString(array))


    val school=arrayOf("Jisu","Sayan","Somnath")

    for((index,element)in school.withIndex()){
        println("Item at $index is $element\n")
    }

}