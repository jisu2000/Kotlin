package Classes_Objects

class Aquarium(var length:Int ,var width:Int, var height: Int) {

    init {
        println("Aquarium Initializing")
    }

    init {
        println("Volume : ${(width * length * height) / 1000} liters")
    }

    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
    }
    constructor(numberofFish: Int) : this() {
        val tank=numberofFish*2000*1.1
        height=(tank/(length*width)).toInt()
        
    }
}


