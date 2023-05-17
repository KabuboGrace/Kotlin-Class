import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter your name:")
    var name= readln()
    println("My name is $name")

    println("Enter an Integer:")
    var num= read.nextInt()
    println("Entered $num")

    println("Enter your Float:")
    var number= read.nextFloat()
    println("Entered $number")

    println("Enter your length:")
    var leng= read.nextInt()
    println(leng)

    println("Enter your width:")
    var wid= read.nextInt()
    println(wid)

    var area = leng*wid

    println(area)

    println("Enter your radius:")
    var rad= read.nextInt()
    println(rad)

    val pi=3.142

    var area2 = pi*rad*rad

    println(area2)

    println("Length:")
    var leng2 =read.nextInt()
    println(leng2)

    println("Width:")
    var wid2= read.nextInt()
    println(wid2)

    var perimeter = (leng2+wid2)*2

    println(perimeter)

    println("Length:")
    var leng3 =read.nextInt()
    println(leng3)

    println("Width:")
    var wid3= read.nextInt()
    println(wid3)

    println("Height:")
    var hei= read.nextInt()
    println(hei)



    var volume= (leng3*wid3*hei)

    println(volume)

    println("Diameter:")
    var diam =read.nextInt()
    println(diam)


    var circ= pi*diam
     println(circ)


}