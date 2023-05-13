fun main() {
    //This is a single line comment
    /**
    This is a multiple line comment
     */

    /** println vs print()*/
//    println("Hello World")
//    print("Hello World!")

    /** val  - Value (immutable)
        var - variable (mutable) */
    val x = 4   // Doesn't change
    var y = 2   // Can change
    y = 4

    /** Operators */
    val a = 1
    val b = 7
    val sum = a + b
    println("Data type of a is ${a::class.java.typeName}")
    println("The sum is $sum")

    /** The data is stored in higher memory location (Double)*/
    val r:Float = 3.5f
    val t:Double = 1.2
    val w = r*t
    println("W is ${w::class.java.typeName}")

    /** To declare a nullable */
    var tea:String ?= null
    //readLine()
//    println("Enter a number")
//    val firstNumber = readln()
//    tea = firstNumber
    val answer = 2 + (tea?:"5").toInt()
    print("Answer is $answer")


    /** if statement */
    println("Enter the value of d")
    val d = readlnOrNull()
    if(d==null){
        println("D is Null")
    } else if(d=="Yes") {
        println("D is Yes")
    } else {
        println(d)
    }


    /** when statement and expression */
    val rain  = "ABCDEF"
    println("Enter input")
    val input = readln()
//    val reader = Scanner(System.`in`)
//    println("Enter a number")
//    var numberOne = reader.nextInt()

    val exp = when(input) {
        "Tree"-> "Entered Tree"
        "Boy"-> "Boy"
        rain-> "Correct answer"
        else-> "Un Available"
    }

    println("Exp is $exp")
}