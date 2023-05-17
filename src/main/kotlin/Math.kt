import java.util.Scanner

fun main(){
    println("Maths")

    var read= Scanner(System.`in`)

    println("Enter first number:")
    var num1= read.nextInt()

    println("Enter second number:")
    var num2= read.nextInt()



    add(15,3)
    subtract(15,3)
    multiply(15,3)
    divide(15,3)
}

fun add(num1:Int, num2:Int){
    println(num1+num2)
}

fun subtract(num1: Int, num2: Int){
    println(num1-num2)
}

fun multiply(num1: Int, num2: Int){
    println(num1*num2)
}

fun divide(num1: Int, num2: Int){
    println(num1/num2)
}