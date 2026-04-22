# Java Basics Quick Guide

This file is a beginner-friendly cheat sheet for compiling and running Java.

## 1) Core Rules

- Java files end in `.java`.
- Public class name must match the file name exactly (including case).
- Program starts at:
    `public static void main(String[] args)`

Example:

```java
public class Main {
        public static void main(String[] args) {
                System.out.println("Hello, Java");
        }
}
```

## 2) Your Project Flow (src -> out)

In this repo:

- Source code is in `src/`
- Compiled `.class` files go to `out/`

Use this every time:

```bash
javac -d out src/*.java
java -cp out Main
```

If your main class is lowercase `main`, run:

```bash
java -cp out main
```

## 3) Command Reference

### Check your Java tools

```bash
java -version
javac -version
```

### Compile

Compile one file in current folder:

```bash
javac Main.java
```

Compile one file from `src` to `out`:

```bash
javac -d out src/Main.java
```

Compile all files from `src` to `out`:

```bash
javac -d out src/*.java
```

### Run

Run class from current folder:

```bash
java Main
```

Run class from `out` using classpath:

```bash
java -cp out Main
```

## 4) Common Mistakes

- Wrong command:
    `java cp out Main`

    Correct:
    `java -cp out Main`

- Wrong class name case:
    `Main` and `main` are different.

- No `main` method:
    class compiles, but cannot run as a program.

- Compiling from wrong folder:
    if source is in `src/`, include `src/` path in the command.

## 5) Packages (when you add them)

If your file starts with:

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

## 6) Build Tools (Later)

Use these when your project grows:

```bash
mvn clean package
gradle build
```