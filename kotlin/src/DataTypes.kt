// Project: DataTypes
// Practice: Variables, nullable types, type inference

fun main() {
    println("=== Kotlin Data Types Demo ===")
    
    val personName = "Judah"
    val personAge = 25
    val personEmail: String? = null

    val person2name = "judah"
    val person2age = 21
    val personalemail2: String? = null
    
    println("Name: $personName")
    println("Age: $personAge")
    println("Email: ${personEmail ?: "Not provided"}")
    
    // Type inference
    var score = 88.5              // Inferred as Double
    val isActive = true           // Inferred as Boolean
    
    println("\nScore: $score")
    println("Active: $isActive")
    
    // Collections (immutable by default)
    val fruits = listOf("Apple", "Banana", "Cherry")
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    
    println("\nFruits: $fruits")
    println("Numbers: $numbers")
    
    numbers.add(6)
    println("After add: $numbers")
    
    // Map
    val person = mapOf(
        "name" to "Alice",
        "city" to "San Francisco",
        "job" to "Engineer"
    )
    
    println("\nPerson info:")
    for ((key, value) in person) {
        println("  $key: $value")
    }
    
    // Nullable types and smart casting
    val value: Int? = 42
    if (value != null) {
        println("\nValue is not null: $value")
    }
}
