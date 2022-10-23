package Lambdas

fun main(){

    val waterfilter:(Int)->(Int)={ dirty -> dirty / 2 }

    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    println(updateDirty(30, waterfilter))
}



