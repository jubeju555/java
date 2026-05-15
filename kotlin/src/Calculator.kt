// Project: Calculator
// Practice: Functions, when expressions, null safety

fun calculate(a: Double, b: Double, operation: String): Double? {
    return when (operation) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else null
        "%" -> if (b != 0.0) a % b else null
        else -> null
    }
}

fun printMenu() {
    println("""
        === Kotlin Calculator ===
        Select operation:
        + : Addition
        - : Subtraction
        * : Multiplication
        / : Division
        % : Modulus
    """.trimIndent())
}

fun main() {
    println("=== Kotlin Calculator Demo ===\n")
    
    // Demo calculations
    val num1 = 15.0
    val num2 = 3.0
    
    val operations = listOf("+", "-", "*", "/", "%")
    
    for (op in operations) {
        val result = calculate(num1, num2, op)
        if (result != null) {
            println("$num1 $op $num2 = $result")
        }
    }
    
    // Division by zero handling
    println("\nDivision by zero test:")
    val result = calculate(10.0, 0.0, "/")
    if (result != null) {
        println("Result: $result")
    } else {
        println("Error: Cannot divide by zero")
    }
    
    // Functional approach
    println("\nBatch calculations:")
    val pairs = listOf(
        Triple(20.0, 4.0, "+"),
        Triple(100.0, 10.0, "-"),
        Triple(7.0, 6.0, "*")
    )
    
    pairs.forEach { (a, b, op) ->
        val res = calculate(a, b, op)
        println("$a $op $b = ${res ?: "Error"}")
    }
}
