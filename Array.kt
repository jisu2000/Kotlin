

    fun main(){

        val number= arrayOf(1,2,3,4,5)

        // print(number.contentToString())


//        for(i in number)
//        {
//            print(" ${i+2}")
//        }

        val fruit= arrayOf(Fruit("Apple",20),Fruit("Grape",30))

//        print(fruit.contentToString())

        for(f in fruit){
            print("${f.name} ")
        }
    }

   

    data class Fruit(val name: String, val value: Int)
