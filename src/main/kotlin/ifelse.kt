import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)

    println("Enter temparature:")
    var temperature = read.nextInt()
    println(temperature)

    if (temperature < 37) {
        println("It is too cold")
    } else if (temperature > 37) {
        println("It is too hot")
    } else {
        println("Normal temperature")
    }

    println("Enter the three numbers:")

    println("Number 1:")
    var a=read.nextInt()
    println(a)

    println("Number 2:")
    var b = read.nextInt()
    println(b)

    println("Number 3:")
    var c =read.nextInt()
    println(c)

    if(a>b && a>c){
        println("$a is greatest")
    }
    else if (b>a && b>c){
        println("$b is greatest")
    }
    else if (c>a && c>b){
        println("$c is greatest")
    }
    else{
        println("All are equal")
    }




}



