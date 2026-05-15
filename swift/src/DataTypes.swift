import Foundation

// Project: DataTypes
// Practice: Variables, optionals, type inference

let personName = "Judah"
let personAge = 25
let personEmail: String? = nil

print("=== Swift Data Types Demo ===")
print("Name: \(personName)")
print("Age: \(personAge)")
print("Email: \(personEmail ?? "Not provided")")

// Type inference
var score = 88.5                  // Inferred as Double
let isActive = true              // Inferred as Bool

print("\nScore: \(score)")
print("Active: \(isActive)")

// Collections
let fruits = ["Apple", "Banana", "Cherry"]
var numbers = [1, 2, 3, 4, 5]

print("\nFruits: \(fruits)")
print("Numbers: \(numbers)")

numbers.append(6)
print("After append: \(numbers)")

// Dictionary
let person = ["name": "Alice", "city": "San Francisco", "job": "Engineer"]
print("\nPerson info:")
for (key, value) in person {
    print("  \(key): \(value)")
}
