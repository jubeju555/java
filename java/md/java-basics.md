# Java Basics + Mini Projects

This file is a hands-on starter guide. You will learn core Java syntax and build small projects that are more practical than Hello World.

## 1) Core Java Rules

- Java source files end in `.java`.
- Public class name must match the file name exactly (case-sensitive).
- Every runnable app has:

```java
public static void main(String[] args)
```

## 2) Compile and Run Flow

In this repo:

- Source files live in `src/`
- Compiled files should go in `out/`

Compile all:

```bash
javac -d out src/*.java
```

Run any class with a `main` method:

```bash
java -cp out ClassName
```

Examples:

```bash
java -cp out CalculatorProject
java -cp out GradeAnalyzerProject
java -cp out ExpenseTrackerProject
```

## 3) Java Basics You Need First

### Variables and Types

```java
int age = 22;
double score = 88.5;
boolean active = true;
String name = "Judah";
```

### Conditionals

```java
if (score >= 90) {
    System.out.println("A");
} else {
    System.out.println("Not A");
}
```

### Loops

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Methods

```java
public static int add(int a, int b) {
    return a + b;
}
```

## 4) Project 1: CalculatorProject

What you practice:

- `Scanner` input
- `switch` statements
- basic arithmetic
- input validation

Try:

1. Add modulus (`%`) support.
2. Add a loop so the user can run another calculation.

## 5) Project 2: GradeAnalyzerProject

What you practice:

- arrays
- loops
- min/max/average logic
- simple letter grade function

Try:

1. Show class rank for each score.
2. Count how many A, B, C, D, F grades.

## 6) Project 3: ExpenseTrackerProject

What you practice:

- `ArrayList`
- menu-driven loop
- custom methods
- formatting totals

Try:

1. Add category support (food, transport, etc.).
2. Add a monthly budget warning when total exceeds a limit.

## 7) Common Mistakes

- `java cp out Main` is wrong; use `java -cp out Main`.
- Class name case matters (`Main` is not `main`).
- A class without `main` compiles but is not directly runnable.
- If you add `package` declarations later, your run command changes.

## 8) Suggested Learning Order

1. Read this file once.
2. Run all three projects.
3. Modify each project with one feature.
4. Create your own fourth project using the same structure.