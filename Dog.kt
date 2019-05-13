class Dog() {
    //Variable Declaration
    var legs:Int = 0
    var tails:Int = 0
    var length:Int = 0
    var name:String = ""
    //Initialization
    init{
        legs = 3
        tails = 1
        length = 15
        name = "Pupper"
    }
    //Secondary Constructor
    constructor(nameDoggo:String, legNumber:Int, tailNumber:Int, lengthNumber:Int):this(){
        legs = legNumber
        tails = tailNumber
        length = lengthNumber
        name = nameDoggo
    }
    //Functions for Dog
    fun bark(){
        println("Bark Bark")
    }
    fun stretch(){
        length += 2
    }
}