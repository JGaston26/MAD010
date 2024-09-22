fun main() {
   val myList = listOf("Mobile","Application","Development","Class")
    val mappedList = myList.map { if(it.length > 6)"long" else "short" }
    println(myList)
    println(mappedList)
    var myLambda: (String) -> Unit = { thing ->
        String
        println(thing)
    }
    test("android",myLambda)
    test("pixel"){
        if(it.length > 8)println("long") else println("short")
    }
    test("developer"){
        if(it.length > 8)println("long") else println("short")
    }
    plop { i, i2 -> Int
        i * i2
    }
    println(appleDetector {if(it.equals("apple")) true else false })

}
fun test(x: String, function: (String) -> Unit) {
    function(x)
}
fun plop(function: (Int, Int) -> Int) {
    val x = function(5, 10)
    println(x)
}
fun appleDetector(func: (String) -> Boolean): Int {
    return if (func("apple")) 1 else 0
}
