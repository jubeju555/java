# Java Basics (Crash Course)

## File Basics

- Java source files end with `.java`.
- Class name should match the file name for public classes.
- Example: class `Main` should be in `Main.java`.

## Minimal Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java");
    }
}
```

## Compile Commands

Compile one file:

```bash
javac Main.java
```

Compile and place class files in output directory:

```bash
javac -d out src/Main.java
```

Compile multiple files:

```bash
javac -d out src/*.java
```

## Run Commands

Run compiled class from current directory:

```bash
java Main
```

Run with classpath:

```bash
java -cp out Main
```

## Package Example

If file starts with:

```java
package com.example;
```

Compile:

```bash
javac -d out src/com/example/Main.java
```

Run:

```bash
java -cp out com.example.Main
```

## Common Tool Commands

Check Java versions:

```bash
java -version
javac -version
```

Initialize a simple Maven project (optional):

```bash
mvn archetype:generate
```

Run Maven build (inside Maven project):

```bash
mvn clean package
```

Run Gradle build (inside Gradle project):

```bash
gradle build
```