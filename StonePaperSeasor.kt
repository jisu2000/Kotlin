import java.util.Scanner
import kotlin.random.Random

fun main()
{

    println("Welcome to the Game")
    val reader=Scanner(System.`in`)

    println("How many round You want to Play")

    val round:Int=reader.nextInt()

    println("OK !! The Round has been set to $round times")
    println("All the best")
    println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    println("Choose 1 for Stone")
    println("Choose 2 for Paper")
    println("Choose 3 for Seasor")
    println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++")



    var user:Int=0
    var comp:Int=0

    var i:Int=0
    var r=1
    while(i<round)
    {

        println("This is Round $r")

        r++
        println("Your Turn")
        println("Choose Any of the Mentioned Above")
        var u=reader.nextInt()
        if(u!=1 && u!=2 && u!=3)
        {
            error()
            break
        }
        println("You Choice ${turnname(u)}")
        println("PC's Turn")
        var c=(1..3).random()
        println("Computer's Choice ${turnname(c)}")

        if(u==2 && c==1 || u==1 && c==3 || u==3 && c==2)
        {
            println("You Won This round")
            user++
        }

        else if(u==c)
        {
            println("This round is Tied")
        }

        else{
            println("Computer Won")
            comp++
        }

        i++

    }

    if(user>comp){
        println("You Won the game")
        println("Congratulations!!!")
    }

    else if(user==comp){
        println("The game is tied")
    }

    else {
        println("Computer defeated you")
        println("Better luck next time !!!")
    }




}

fun turnname(i:Int): String {

    if(i==1){
        return "STONE"
    }
    if(i==2)
    {
        return "PAPER"
    }
    return "SEASOR"

}
fun error(){
    println("Read the game Rules Carefully")
}


