import java.util.Scanner

fun main(){

    var read=Scanner(System.`in`)

    println("Enter a number:")
    var num= read.nextInt()
    println(num)


    if (num>0){
        println("$num is positive")
    }
    else if(num<0){
        println("$num is negative")
    }
    else{
        println("$num is zero")
    }
}