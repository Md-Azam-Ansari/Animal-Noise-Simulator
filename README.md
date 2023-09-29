# Animal-Noise-Simulator
The "Animal Noise Simulator" is a Java-based project designed to demonstrate core principles of object-oriented programming (OOP) such as inheritance, method overriding, and polymorphism. It creates a hierarchy of animal classes, each representing a specific animal (Cat, Dog, Snake) with its unique noise.

--------------------------**CODE EXPLANATION**-----------------------------------------

This Java code defines a simple hierarchy of animal classes and a simulator to make noise using different animal objects. Here's a breakdown of the code:

1. `Animal` Class:
   - Represents a generic animal with a method `noise()` that prints "Animal Noise."

2. `Cat`, `Dog`, and `Snake` Classes:
   - Subclasses of `Animal` that override the `noise()` method with specific noise messages for each type of animal.

3. `Animal_Simulator` Class:
   - Contains a method `make_noise(Animal arg)` that takes an `Animal` object as an argument and calls the `noise()` method on it. This class simulates making noise with different animals.

4. `MainClass`:
   - In the `main` method, it creates instances of `Cat`, `Dog`, and `Snake`.
   - It also creates an `Animal_Simulator` object.
   - Calls the `make_noise` method of the `Animal_Simulator` object with instances of different animals as arguments to demonstrate the polymorphic behavior of method invocation.

  ----------------------------------------------**Concepts Covered**--------------------------------------------------------

1. **Inheritance:** The `Cat`, `Dog`, and `Snake` classes inherit from the `Animal` class, demonstrating the concept of inheritance in object-oriented programming.

2. **Method Overriding:** Each subclass (`Cat`, `Dog`, and `Snake`) overrides the `noise()` method from the parent `Animal` class. This demonstrates method overriding, which allows subclasses to provide their own implementation of a method.

3. **Polymorphism:** The `Animal_Simulator` class uses polymorphism by accepting `Animal` objects as arguments to the `make_noise` method. This allows it to call the appropriate `noise()` method for each specific animal at runtime.

4. **Object Creation:** The code demonstrates how to create instances of classes (`Cat`, `Dog`, `Snake`, and `Animal_Simulator`) in Java.

5. **Method Invocation:** It shows how to invoke methods on objects, including method overriding and dynamic method dispatch (polymorphic method invocation).

In summary, this code showcases the concepts of inheritance, method overriding, polymorphism, object creation, and method invocation in object-oriented programming using a simple example of animal noises.

---------------------------------------------**PROJECT DESCRIPTION**---------------------------------------------------------------

The "Animal Noise Simulator" is a Java project that simulates the noises made by different types of animals. It utilizes object-oriented programming concepts such as inheritance, method overriding, and polymorphism to create a hierarchy of animal classes. Each animal class provides its own implementation of the `noise()` method to produce a specific noise characteristic of that animal.

The project includes the following key components:

- `Animal` Class: The base class representing a generic animal with a default "Animal Noise."
- Subclasses (`Cat`, `Dog`, and `Snake`): These classes inherit from `Animal` and override the `noise()` method to produce specific animal noises.
- `Animal_Simulator` Class: This class contains a method that takes an `Animal` object as input and calls the `noise()` method on it, demonstrating polymorphic behavior.
- `MainClass`: The entry point of the program, where instances of different animal objects are created and their noises are simulated using the `Animal_Simulator` class.

The project illustrates fundamental concepts of object-oriented programming, making it a valuable educational example for understanding inheritance, method overriding, and polymorphism. It allows users to interact with and observe how objects of different classes can exhibit varying behaviors while sharing a common interface.
