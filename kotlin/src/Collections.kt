// Project: Collections
// Practice: Lists, maps, functional operations (map, filter, reduce)

fun main() {
    println("=== Kotlin Collections Demo ===\n")
    
    // Lists
    val scores = listOf(85, 92, 78, 95, 88)
    
    println("All scores: $scores")
    
    // Filter
    val highScores = scores.filter { it > 80 }
    println("High scores (>80): $highScores")
    
    // Map
    val doubled = scores.map { it * 2 }
    println("Doubled: $doubled")
    
    // Reduce
    val sum = scores.reduce { acc, value -> acc + value }
    val avg = sum.toDouble() / scores.size
    println("Sum: $sum, Average: $avg")
    
    // Maps with grades
    println("\n=== Grade Mapping ===")
    val gradeMap = mapOf(
        "Alice" to 95,
        "Bob" to 87,
        "Charlie" to 92,
        "Diana" to 78
    )
    
    gradeMap.forEach { (name, grade) ->
        val letterGrade = when {
            grade >= 90 -> "A"
            grade >= 80 -> "B"
            grade >= 70 -> "C"
            else -> "F"
        }
        println("$name: $grade ($letterGrade)")
    }
    
    // Sets (unique values)
    println("\n=== Sets ===")
    val tags = setOf("kotlin", "java", "programming", "kotlin", "java")
    println("Original list with duplicates would have 5 items")
    println("Set (unique): $tags")
    println("Set size: ${tags.size}")
    
    // Chain operations
    println("\n=== Chained Operations ===")
    val result = scores
        .filter { it > 80 }
        .map { it * 1.1 }  // Add 10%
        .sorted()
    println("Scores > 80, boosted by 10%, sorted: $result")
    
    // Grouping
    println("\n=== Grouping ===")
    val grouped = scores.groupBy { if (it > 85) "High" else "Low" }
    println("Grouped by performance: $grouped")
}
