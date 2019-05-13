fun main(andrew: Array<String>) {
    println(addNumbers(5, 2))
    var myDog = Dog("Kushol", 3, 1, 15)
    println(myDog.name)
    myDog.bark()
}

fun addNumbers(number1:Int, number2:Int):Int{
    return number1 + number2
}