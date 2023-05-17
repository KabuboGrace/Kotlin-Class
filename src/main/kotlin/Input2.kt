import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter a:")
    var a=read.nextInt()
    println(a)

    println("Enter b:")
    var b=read.nextInt()
    println(b)

    println("Enter height:")
    var hei =read.nextInt()
    println(hei)

    var add= a+b

    var area=(0.5*add)*hei

    println(area)

}