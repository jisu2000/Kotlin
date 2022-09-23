fun main()
{
    var a =2.3
    var b= 5.5
    var result=add(a,b)

    println("The average of $a and $b is $result ")
}

fun add(a: Double, b: Double) : Double{
    return (a+b)/2
}