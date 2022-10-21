fun main(){
    val numbers = listOf(1,2,3,4,5)
    val s=numbers.size

    println("List:"+numbers)
    println("Size: ${numbers.size}")
     var j=0
    for(item in numbers)
    {
     println("${item} "+"is in ${j} position")

        j+= 1
    }


}

