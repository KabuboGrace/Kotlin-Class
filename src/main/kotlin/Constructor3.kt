class Dog1(var breed:String,var size:String, var age:Int,var color:String){
    fun Eat(action: String){
    }
    fun Sleep(action:String){
    }
    fun Sit(action: String){
    }
    fun Run(action: String){
    }

}
fun main(){
    var puppy1=Dog1("Neupolitan Mustiff","Large", 5,"Black" )
    println(puppy1.breed)

    var puppy2=Dog1("Maltese","Small", 2,"White" )
    println(puppy2.breed)

    var puppy3=Dog1("Chow Chow","Medium", 3,"Browm" )
    println(puppy3.breed)

    Dog1.Eat("")


}