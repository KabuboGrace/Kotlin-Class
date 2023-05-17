import java.util.Scanner

fun main(){
    var read= Scanner(System.`in`)


    println("Enter a letter:")
    var lett= read.next().single()
    println(lett)



    if(lett=='a'|| lett=='e'|| lett=='i'||lett=='o'||lett=='u'){
        println("$lett is a vowel")
    }
    else{
        println("$lett is a consonant")
    }

}