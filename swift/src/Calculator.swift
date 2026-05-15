import Foundation

// Project: Calculator
// Practice: Functions, control flow, optional return types

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
    case "%":
        return b != 0 ? a.truncatingRemainder(dividingBy: b) : nil
    default:
        return nil
    }
}

func printMenu() {
    print("""
    === Swift Calculator ===
    Select operation:
    + : Addition
    - : Subtraction
    * : Multiplication
    / : Division
    % : Modulus
    """)
}

print("=== Swift Calculator Demo ===\n")

// Demo calculations
let num1 = 15.0
let num2 = 3.0

let operations = ["+", "-", "*", "/", "%"]

for op in operations {
    if let result = calculate(a: num1, b: num2, operation: op) {
        print("\(num1) \(op) \(num2) = \(result)")
    }
}

// Division by zero handling
print("\nDivision by zero test:")
if let result = calculate(a: 10, b: 0, operation: "/") {
    print("Result: \(result)")
} else {
    print("Error: Cannot divide by zero")
}

// Interactive mode (uncommented for manual testing)
/*
print("\nEnter interactive mode? (Type: yes/no)")
if let response = readLine()?.lowercased(), response == "yes" {
    printMenu()
    
    print("Enter first number: ", terminator: "")
    guard let aStr = readLine(), let a = Double(aStr) else {
        print("Invalid input")
        exit(1)
    }
    
    print("Enter operation: ", terminator: "")
    guard let op = readLine() else {
        print("Invalid input")
        exit(1)
    }
    
    print("Enter second number: ", terminator: "")
    guard let bStr = readLine(), let b = Double(bStr) else {
        print("Invalid input")
        exit(1)
    }
    
    if let result = calculate(a: a, b: b, operation: op) {
        print("\nResult: \(result)")
    } else {
        print("\nInvalid operation or error in calculation")
    }
}
*/
