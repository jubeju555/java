# Swift Basics + Mini Projects

This file is a hands-on starter guide for learning Swift fundamentals with practical mini projects.

## 1) Core Swift Rules

- Swift source files end in `.swift`.
- No requirement for public/private class declarations for executable files.
- Every executable app has a `main` entry point (implicit at file level or explicit function).
- Swift uses type inference but also supports explicit type annotations.

## 2) Compile and Run Flow

In this repo:

- Source files live in `src/`
- Compiled executables go in `out/`

Compile a single file:

```bash
swiftc -o out/FileName src/FileName.swift
```

Compile all files:

```bash
swiftc -o out/app src/*.swift
```

Run:

```bash
./out/FileName
```

## 3) Swift Basics You Need First

### Variables and Constants

```swift
var age = 22                    // mutable variable
let name = "Judah"             // immutable constant
var score: Double = 88.5       // explicit type
var active: Bool = true
```

### Optionals (Unique to Swift)

```swift
var nickname: String? = nil    // optional, can be nil
if let unwrapped = nickname {
    print(unwrapped)
} else {
    print("No nickname")
}

// Nil-coalescing operator
let displayName = nickname ?? "Unknown"
```

### Conditionals

```swift
if score >= 90 {
    print("A")
} else if score >= 80 {
    print("B")
} else {
    print("Not A or B")
}
```

### Loops

```swift
for i in 0..<5 {
    print(i)
}

var count = 0
while count < 5 {
    print(count)
    count += 1
}
```

### Functions

```swift
func add(a: Int, b: Int) -> Int {
    return a + b
}

// Without explicit return (implicit return for single-line)
func multiply(a: Int, b: Int) -> Int {
    a * b
}
```

### Arrays and Collections

```swift
var numbers = [1, 2, 3, 4, 5]
var grades: [String] = []

numbers.append(6)
for number in numbers {
    print(number)
}

// Dictionary
var person = ["name": "Judah", "age": "22"]
```

## 4) Project 1: DataTypes.swift

What you practice:

- Variables vs constants
- Type inference and explicit types
- Optionals and nil-coalescing
- String interpolation

Try:

1. Create a person struct with name, age, and email (optional).
2. Print details with nil-coalescing for optional fields.
3. Use string interpolation: `"Name: \(name), Age: \(age)"`

Example:

```swift
let personName = "Alice"
let personAge = 25
let personEmail: String? = nil

print("Name: \(personName)")
print("Age: \(personAge)")
print("Email: \(personEmail ?? "Not provided")")
```

## 5) Project 2: Calculator.swift

What you practice:

- Functions with return types
- Control flow (switch, if-else)
- Input handling with `readLine()`
- Basic arithmetic

Example structure:

```swift
func calculate(a: Double, b: Double, operation: String) -> Double? {
    switch operation {
    case "+":
        return a + b
    case "-":
        return a - b
    case "*":
        return a * b
    case "/":
        return b != 0 ? a / b : nil
    default:
        return nil
    }
}

if let result = calculate(a: 10, b: 5, operation: "+") {
    print("Result: \(result)")
}
```

## 6) Project 3: StringManipulation.swift

What you practice:

- String methods (uppercased, lowercased, contains, split)
- Character iteration
- String interpolation
- Collections with map/filter

Example:

```swift
let sentence = "Hello Swift World"

// Basic operations
print(sentence.uppercased())
print(sentence.lowercased())
print(sentence.contains("Swift"))

// Split and map
let words = sentence.split(separator: " ")
let wordLengths = words.map { $0.count }
print(wordLengths)

// Filter
let longWords = words.filter { $0.count > 4 }
print(longWords)
```

## 7) Key Differences from Java

| Aspect | Java | Swift |
|--------|------|-------|
| Null Handling | NullPointerException | Optionals (`?`) |
| Memory | Garbage Collected | Automatic Reference Counting (ARC) |
| Type Inference | Limited | Strong |
| String Immutability | Yes | Yes |
| Functional | Streams (Java 8+) | First-class functions |
| Entry Point | `main` method | File-level or `main` function |

## Compile Commands Cheat Sheet

| Task | Command |
|------|---------|
| Compile single file | `swiftc -o out/name src/file.swift` |
| Compile multiple | `swiftc -o out/app src/*.swift` |
| Run executable | `./out/app` |
| Check syntax | `swiftc -parse src/file.swift` |
| Debug build | `swiftc -g -o out/app src/*.swift` |

## Next Steps

1. Build the three sample projects above.
2. Experiment with array functions: `map`, `filter`, `reduce`.
3. Create a simple CLI app that takes user input with `readLine()`.
4. Learn about structs and classes (Object-Oriented vs Value types).
