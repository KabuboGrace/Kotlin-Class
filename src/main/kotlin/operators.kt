// Arithmetic Operators
fun main(){
    var num:Int
    num=25

    var num2:Int
    num2=6

    println(num+num2)
    println(num-num2)
    println(num*num2)
    println(num/num2)
    println(num%num2) //Modulus

    //Assignment operator
    var x=5
    println(x)

    var y=3
    y+=7
    println(y)

    var a=78
    a-=5
    println(a)

    var b=3
    b*=5
    println(b)

    var d=35
    d/=7
    println(d)

    var e=41
    e%=8
    println(e)

    // Comparison operators
    var numb:Int=100
    println(numb<20)
    println(numb>10)
    println(numb==30)
    println(numb<=30)
    println(numb>=30)
    println(numb!=30)

    // Logical operators
    var myNumber=90
    println(myNumber<100 && myNumber==30) // And
    println(myNumber<100 || myNumber==30) // Or
    println(!(myNumber<100 || myNumber==30)) //Not

}


