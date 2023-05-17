class Person{
    var name:String="Grace"
    var age:Int=18
    var location:String="Nairobi"
    var yearofbirth:Int=1980


    //Methods/Functions
    fun eat(){
        println("Eating")
    }
    fun sleep(){
        println("Sleeping")
    }
}

fun main(){
    var Teacher=Person()
    println(Teacher.location)

    Teacher.eat()



    var Driver=Car()
    println(Driver.make+" "+Driver.model+" "+Driver.color+" "+Driver.drivingSpeed)

    Driver.stop()
}





class Car{
    var make:String="Honda"
    var model:String="Stream"
    var color:String="Silver"
    var drivingSpeed:Int=180

    fun drive(){
        println("Driving")
    }
    fun turn(){
        println("Turning")
    }
    fun stop(){
        println("Stoping")
    }
}

