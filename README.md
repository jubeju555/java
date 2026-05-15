# BOA Global Tech - Language Prep Workspace

A comprehensive, structured learning environment for mastering **Java**, **Swift**, and **Kotlin** — three critical languages for modern backend and iOS development.

## 📁 Workspace Structure

```
boa-prep/
├── java/               # Java fundamentals & mini projects
│   ├── README.md
│   ├── md/
│   │   └── java-basics.md       (Crash course + compile commands)
│   ├── src/
│   │   ├── CalculatorProject.java
│   │   ├── GradeAnalyzerProject.java
│   │   ├── ExpenseTrackerProject.java
│   │   └── ...
│   └── .vscode/
│       └── extensions.json
│
├── swift/              # Swift fundamentals & mini projects
│   ├── README.md
│   ├── md/
│   │   └── swift-basics.md      (Crash course + compile commands)
│   ├── src/
│   │   ├── DataTypes.swift
│   │   ├── Calculator.swift
│   │   └── StringManipulation.swift
│   └── .vscode/
│       └── extensions.json
│
└── kotlin/             # Kotlin fundamentals & mini projects
    ├── README.md
    ├── md/
    │   └── kotlin-basics.md     (Crash course + compile commands)
    ├── src/
    │   ├── DataTypes.kt
    │   ├── Calculator.kt
    │   └── Collections.kt
    └── .vscode/
        └── extensions.json
```

## 🚀 Quick Start by Language

### Java
```bash
cd java
javac -d out src/*.java
java -cp out CalculatorProject
```

### Swift
```bash
cd swift
swiftc -o out/app src/DataTypes.swift
./out/app
```

### Kotlin
```bash
cd kotlin
kotlinc src/DataTypes.kt -include-runtime -d out/DataTypes.jar
java -jar out/DataTypes.jar
```

## 📚 Learning Path

Each language folder contains:

1. **README.md** - Overview, setup instructions, prerequisites
2. **md/[language]-basics.md** - Comprehensive crash course with:
   - Core syntax rules
   - Compile & run workflows
   - Code examples
   - Mini project guides
   - Compile commands cheat sheet
   - Key differences from Java

3. **src/** - Runnable sample projects:
   - **DataTypes**: Variables, type inference, collections
   - **Calculator**: Functions, control flow, error handling
   - **Advanced Projects**: Language-specific features (Swift: Strings, Kotlin: Functional programming)

## 🎯 Learning Objectives

### Java
- ✅ Compile and run Java programs
- ✅ Master variables, loops, conditionals
- ✅ Build functions and simple OOP
- ✅ Handle collections (arrays, lists)
- ✅ Projects: Calculator, Grade Analyzer, Expense Tracker

### Swift
- ✅ Understand optionals and nil-coalescing
- ✅ Function basics and type inference
- ✅ Immutability vs mutability
- ✅ String manipulation and collections
- ✅ Difference from Java/Kotlin mindset
- ✅ Projects: DataTypes, Calculator, String Operations

### Kotlin
- ✅ JVM-based syntax with modern features
- ✅ Nullable types and smart casting
- ✅ Functional programming (map, filter, reduce)
- ✅ Data classes and extension functions
- ✅ Java interoperability
- ✅ Projects: DataTypes, Calculator, Collections

## 💡 Key Differences at a Glance

| Feature | Java | Swift | Kotlin |
|---------|------|-------|--------|
| **Null Handling** | Exceptions | Optionals (`?`) | Nullable types (`?`) |
| **Type Inference** | Limited | Strong | Strong |
| **Compilation** | Bytecode (.class) | Native (macOS/Linux) | Bytecode (.jar) |
| **Entry Point** | `main` method | File-level function | File-level `main()` |
| **Functional** | Streams (Java 8+) | First-class | First-class, powerful |
| **Interop** | N/A | Limited | Full Java compatibility |
| **Memory** | Garbage collected | ARC | Garbage collected |
| **Syntax** | Verbose | Modern, concise | Modern, concise |

## 📖 How to Use This Workspace

1. **Pick a language** - Start with any folder (Java, Swift, or Kotlin)
2. **Read the markdown** - Study `md/[language]-basics.md` for fundamentals
3. **Run examples** - Execute the sample projects in `src/`
4. **Modify & experiment** - Add your own code to the projects
5. **Use compile commands** - Reference the cheat sheets for compilation
6. **Compare patterns** - Note differences between languages

## 🛠️ VS Code Extensions

Each language folder includes recommended extensions in `.vscode/extensions.json`. Install them for:
- **Java**: Language support, debugging, Maven integration
- **Swift**: Swift language server, syntax highlighting
- **Kotlin**: Kotlin language support, debugging

## 📝 Compile Commands Cheatsheet

### Java
```bash
javac -d out src/*.java          # Compile all
java -cp out ClassName            # Run class with main method
```

### Swift
```bash
swiftc -o out/app src/*.swift     # Compile to executable
./out/app                          # Run executable
swiftc -parse src/file.swift      # Check syntax
```

### Kotlin
```bash
kotlinc src/*.kt -include-runtime -d out/app.jar  # Compile to JAR
java -jar out/app.jar                              # Run JAR
kotlinc src/*.kt -d out/                          # Compile to classfiles
```

## ✅ Best Practices for BOA Tech Interview Prep

- **Run every example** - Don't just read; execute and modify code
- **Understand error messages** - They teach you how each language thinks
- **Compare implementations** - Build the same project in all 3 languages
- **Time yourself** - Build each project in <30 minutes after first read
- **Know the compile workflow** - Interviewers often ask "How would you run this?"
- **Master edge cases** - Null handling, type mismatches, operator precedence
- **Focus on fundamentals** - Don't jump to advanced patterns; master basics first

## 🎓 Next Steps After Basics

1. **Build a CLI tool** - Same app in all 3 languages (e.g., To-Do list)
2. **Learn data structures** - Lists, maps, sets in each language
3. **Study OOP** - Classes, inheritance, interfaces (Java/Kotlin focus)
4. **Async & Concurrency** - Threading, async-await basics
5. **Web frameworks** - Spring (Java), Vapor (Swift), Ktor (Kotlin)

## 📚 Additional Resources

- **Java**: Oracle Java Tutorials, Java SE Documentation
- **Swift**: Swift.org, Apple Developer Docs
- **Kotlin**: Kotlin.org, JetBrains Academy

---

**Created for BOA Global Tech Interview Prep** | Last Updated: May 13, 2026