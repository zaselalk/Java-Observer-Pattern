# Java Observer Pattern

## Purpose

The purpose of this repository is to demonstrate the implementation of the Observer design pattern in Java. The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Functionality

This repository contains a simple example of the Observer pattern. It includes the following classes and interfaces:

- `Observer`: An interface that defines the `update` method, which is called when the subject's state changes.
- `Subject`: An interface that defines methods for registering, removing, and notifying observers.
- `LMSAdmin`: A class that implements the `Subject` interface. It maintains a list of observers and notifies them when its state changes.
- `Student`: A class that implements the `Observer` interface. It receives updates from the `LMSAdmin` class.
- `Main`: A class that contains the `main` method to run the example.

## Usage Instructions

1. Clone the repository:
   ```sh
   git clone https://github.com/zaselalk/Java-Observer-Pattern.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Java-Observer-Pattern
   ```
3. Compile the Java files:
   ```sh
   javac src/*.java
   ```
4. Run the `Main` class:
   ```sh
   java src/Main
   ```

## Example

The following example demonstrates how to use the classes and interfaces in this repository:

```java
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        LMSAdmin lmsAdmin = new LMSAdmin();
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
        }

        // Add all students as observers
        for (int i = 0; i < 10; i++) {
            lmsAdmin.registerObserver(students[i]);
        }

        // Send update
        lmsAdmin.notifyObservers("Hello World");
    }
}
```

## Observer Pattern

The Observer pattern is used when there is a one-to-many relationship between objects, such as when an object needs to notify multiple objects about changes in its state. In this example, the `LMSAdmin` class is the subject, and the `Student` class is the observer. When the state of the `LMSAdmin` class changes, it notifies all registered observers (students) by calling their `update` method.

The Observer pattern is useful in scenarios where an object needs to notify multiple objects about changes in its state without being tightly coupled to them. This allows for a more flexible and maintainable design.
