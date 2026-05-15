# Java Crash Course Prep (BOA Global Tech)

This workspace is a lightweight Java learning environment focused on core syntax, compilation, and execution.

## Quick Start

1. Create a source file:

   ```java
   // src/Main.java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Hello, Java");
       }
   }
   ```

2. Compile:

   ```bash
   javac -d out src/Main.java
   ```

3. Run:

   ```bash
   java -cp out Main
   ```

See `md/java-basics.md` for a comprehensive command reference guide and mini projects.

## Prerequisites

- JDK 11+ installed
- Java compiler (javac) available in PATH

## Projects

- **CalculatorProject**: Basic calculator with switch statements and input handling
- **GradeAnalyzerProject**: Arrays, loops, and min/max/average logic
- **ExpenseTrackerProject**: Collections and data management
