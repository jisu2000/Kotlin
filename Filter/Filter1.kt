package Filter

fun main() {
    val fruits= listOf<String>("Apple","Guava","Banana","pineapple","Almond")

//    println(fruits.filter { it[0]=='A'})

    // Added to a new list//
    val res=fruits.filter{it[0]=='A'}
    val lazyMap=fruits.asSequence().map {
        println("access: $it ")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    println("After Filter the List is $res")
}