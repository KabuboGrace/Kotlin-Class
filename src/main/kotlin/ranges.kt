fun main(){

    for (number in 10..15){
        println(number)
    }

    for(letters in 'c'..'f'){
        println("Letter is $letters")
    }

    for (numbers in 1..10){
        println(numbers)

        if(numbers==5){
            break
        }
    }

    for (letter in 'a'..'d'){
        if (letter=='c')
            continue
        println(letter)
    }
}