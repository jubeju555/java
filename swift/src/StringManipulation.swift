import Foundation

// Project: StringManipulation
// Practice: String methods, map/filter, character iteration

let sentence = "Hello Swift World"

print("=== Swift String Manipulation Demo ===\n")

// Basic string operations
print("Original: \(sentence)")
print("Uppercase: \(sentence.uppercased())")
print("Lowercase: \(sentence.lowercased())")
print("Contains 'Swift': \(sentence.contains("Swift"))")

// Split and process
let words = sentence.split(separator: " ")
print("\nWords: \(words)")

// Map: transform each element
let wordLengths = words.map { $0.count }
print("Word lengths: \(wordLengths)")

// Filter: select elements matching a condition
let longWords = words.filter { $0.count > 4 }
print("Words longer than 4 chars: \(longWords)")

// Count specific characters
let vowels = "aeiouAEIOU"
let vowelCount = sentence.filter { vowels.contains($0) }.count
print("\nVowel count: \(vowelCount)")

// String interpolation examples
let name = "Developer"
let version = 1.0
print("\nInterpolation demo: Hello \(name), version \(version)")

// Character iteration
print("\nCharacters in 'Swift':")
for char in "Swift" {
    print("  \(char)")
}

// Prefix and suffix
print("\nFirst word: \(words.first ?? "none")")
print("Last word: \(words.last ?? "none")")

// Range and substring
let greeting = "Hello World"
let helloRange = greeting.startIndex..<greeting.index(greeting.startIndex, offsetBy: 5)
let hello = String(greeting[helloRange])
print("\nFirst 5 chars of '\(greeting)': \(hello)")

// Replace
let replaced = sentence.replacingOccurrences(of: "Swift", with: "Kotlin")
print("After replacement: \(replaced)")
