import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)


    println("Enter first number:")
    var num1 =read.nextFloat()
    println(num1)

    println("Enter second number:")
    var num2 = read.nextFloat()
    println(num2)

    print("Enter an operator(+,-,*,/):")
    var operator = readLine()


    var answer = when(operator){
        "+"-> num1+num2
        "-"-> num1-num2
        "*"-> num1*num2
        "/"-> num1/num2
        else-> "Error!"
    }

    println("Answer is $answer")
}