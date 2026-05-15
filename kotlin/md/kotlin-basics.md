# Kotlin Basics + Mini Projects

This file is a hands-on starter guide for learning Kotlin fundamentals with practical mini projects.

## 1) Core Kotlin Rules

- Kotlin source files end in `.kt`.
- Kotlin compiles to JVM bytecode (interoperable with Java).
- No need for semicolons (optional).
- Implicit entry point: `main()` function at file level.
- Strong type inference but supports explicit types.

## 2) Compile and Run Flow

In this repo:

- Source files live in `src/`
- Compiled JARs go in `out/`

Compile a single file into JAR:

```bash
kotlinc src/FileName.kt -include-runtime -d out/FileName.jar
```

Compile all files:

```bash
kotlinc src/*.kt -include-runtime -d out/app.jar
```

Run:

```bash
java -jar out/FileName.jar
```

Or compile to class files (needs classpath):

```bash
kotlinc src/*.kt -d out/
java -cp out/ FileName_classKt
```

## 3) Kotlin Basics You Need First

### Variables and Constants

```kotlin
var age = 22                    // mutable variable
val name = "Judah"             // immutable value
var score: Double = 88.5       // explicit type
val active: Boolean = true
```

### Nullable Types (Similar to Optionals)

```kotlin
var nickname: String? = null   // nullable, can be null
if (nickname != null) {
    println(nickname)
} else {
    println("No nickname")
}

// Safe call operator
println(nickname?.length ?: 0)

// Elvis operator
val displayName = nickname ?: "Unknown"
```

### Conditionals

```kotlin
if (score >= 90) {
    println("A")
} else if (score >= 80) {
    println("B")
} else {
    println("Not A or B")
}

// When expression (like switch, but more powerful)
when (score.toInt() / 10) {
    9, 10 -> println("A")
    8 -> println("B")
    7 -> println("C")
    else -> println("Lower")
}
```

### Loops

```kotlin
for (i in 0 until 5) {          // 0, 1, 2, 3, 4
    println(i)
}

for (i in 5 downTo 1) {         // 5, 4, 3, 2, 1
    println(i)
}

var count = 0
while (count < 5) {
    println(count)
    count++
}
```

### Functions

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}

// Single-expression function
fun multiply(a: Int, b: Int) = a * b

// No return type needed for Unit
fun greet(name: String) {
    println("Hello, $name")
}
```

### Collections

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)        // immutable list
val mutableNums = mutableListOf(1, 2, 3)

mutableNums.add(4)
for (num in numbers) {
    println(num)
}

// Map
val person = mapOf("name" to "Judah", "age" to "22")
println(person["name"])

// Set
val unique = setOf(1, 2, 3, 3, 2)  // {1, 2, 3}
```

### String Interpolation

```kotlin
val name = "Alice"
val age = 25
println("Name: $name, Age: $age")
println("Next year: ${age + 1}")
```

## 4) Project 1: DataTypes.kt

What you practice:

- Variables, val vs var
- Type inference and explicit types
- Nullable types
- String interpolation

Example:

```kotlin
fun main() {
    val personName = "Alice"
    val personAge = 25
    val personEmail: String? = null

    println("Name: $personName")
    println("Age: $personAge")
    println("Email: ${personEmail ?: "Not provided"}")
    
    // Exploring types
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Numbers: $numbers")
}
```

Try:

1. Create variables for a person (name, age, email).
2. Use the Elvis operator to provide defaults for nullable fields.
3. Experiment with different collection types.

## 5) Project 2: Calculator.kt

What you practice:

- Functions with return types
- When expressions (control flow)
- Input handling with `readLine()`
- Null safety

Example structure:

```kotlin
fun calculate(a: Double, b: Double, operation: String): Double? {
    return when (operation) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else null
        else -> null
    }
}

fun main() {
    print("Enter first number: ")
    val aStr = readLine() ?: "0"
    val a = aStr.toDoubleOrNull() ?: 0.0

    print("Enter operation (+, -, *, /): ")
    val op = readLine() ?: "+"

    print("Enter second number: ")
    val bStr = readLine() ?: "0"
    val b = bStr.toDoubleOrNull() ?: 0.0

    val result = calculate(a, b, op)
    if (result != null) {
        println("Result: $result")
    } else {
        println("Invalid operation or division by zero")
    }
}
```

## 6) Project 3: Collections.kt

What you practice:

- Lists, maps, and sets
- Functional operations (map, filter, reduce)
- Iteration
- Destructuring

Example:

```kotlin
fun main() {
    // Lists
    val scores = listOf(85, 92, 78, 95, 88)
    
    // Filter and map
    val highScores = scores.filter { it > 80 }
    val doubled = scores.map { it * 2 }
    
    println("All scores: $scores")
    println("High scores (>80): $highScores")
    println("Doubled: $doubled")
    
    // Reduce
    val sum = scores.reduce { acc, value -> acc + value }
    val avg = sum.toDouble() / scores.size
    println("Average: $avg")
    
    // Maps
    val gradeMap = mapOf(
        "Alice" to 95,
        "Bob" to 87,
        "Charlie" to 92
    )
    
    gradeMap.forEach { (name, grade) ->
        println("$name: $grade")
    }
}
```

## 7) Key Differences from Java

| Aspect | Java | Kotlin |
|--------|------|--------|
| Null Handling | NullPointerException | Nullable types (`?`) |
| Type Inference | Limited | Strong |
| Boilerplate | High | Low |
| String Immutability | Yes | Yes |
| Functional | Streams | First-class, powerful |
| Data Classes | Verbose | `data class` keyword |
| Extension Functions | No | Yes |
| Entry Point | `main` method | File-level `main()` |
| Interoperability | N/A | Full Java interop |

## Compile Commands Cheat Sheet

| Task | Command |
|------|---------|
| Compile to JAR | `kotlinc src/file.kt -include-runtime -d out/file.jar` |
| Compile multiple | `kotlinc src/*.kt -include-runtime -d out/app.jar` |
| Run JAR | `java -jar out/app.jar` |
| Compile to classfiles | `kotlinc src/*.kt -d out/` |
| Run classfiles | `java -cp out/ File_nameKt` |
| REPL (interactive) | `kotlinc -J-Xms128m -J-Xmx512m` |

## Next Steps

1. Build the three sample projects above.
2. Learn about data classes: `data class Person(val name: String, val age: Int)`.
3. Explore extension functions to add methods to existing types.
4. Create a CLI app that reads user input and performs operations.
5. Try interoperability: call Java code from Kotlin.
