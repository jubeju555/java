# Kotlin Crash Course Prep (BOA Global Tech)

This workspace is a lightweight Kotlin learning environment focused on syntax, compilation, and execution on the JVM.

## Quick Start

1. Create a source file:

   ```kotlin
   // src/HelloWorld.kt
   fun main() {
       println("Hello, Kotlin")
   }
   ```

2. Compile:

   ```bash
   kotlinc src/HelloWorld.kt -include-runtime -d out/HelloWorld.jar
   ```

3. Run:

   ```bash
   java -jar out/HelloWorld.jar
   ```

See `md/kotlin-basics.md` for a short command/reference guide and mini projects.

## Prerequisites

- Kotlin 1.8+ installed
- JDK 11+ installed

## Projects

- **DataTypes.kt**: Variables, nullable types, and type inference
- **Calculator.kt**: Functions and control flow
- **Collections.kt**: Lists, maps, and functional programming basics
