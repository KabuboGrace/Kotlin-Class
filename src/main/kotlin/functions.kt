fun main() {
//Predefined Functions
    println("Kotlin")


    var squareroot = Math.sqrt(81.0)
    println(squareroot)

    var round = Math.ceil(3.45)
    println(round)

    var round1=Math.round(3.45)
    println(round1)

    myFun()
    add()
    myDetails()
    myDetails2("Grace", 18)
    myDetails2("Daniel", 16)
    add2(56,73)
}

// User-defined Functions
fun myFun(){
    println("Today is Friday")
}

fun add(){
    var num1=56
    var num2=12
    println(num1+num2)
}

fun add2(num1:Int,num2:Int){
    println(num1+num2)
}

fun myDetails(){
    var name="Glory"
    var age=18
    println("$name is $age years old")
}

fun myDetails2(name:String,age:Int){
    println("$name is $age years old")
}

