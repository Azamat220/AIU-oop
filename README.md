The objective of this assignment is to reinforce your understanding of inheritance in Java by creating a base class and three derived classes to model different types of devices. You will also practice generating random instances of these devices, calculating total prices, and managing class hierarchies.

1. Base Class - Device:

   - Create a base class named "Device".

   - Include the following attributes:

     - "type" (String) - Represents the type of the device (e.g., "Smartphone," "Laptop," "Tablet," etc.).

     - "price" (double) - Represents the price of the device in USD.

     - "weight" (double) - Represents the weight of the device in grams.

   - Implement a parameterized constructor to initialize these attributes.

   - Implement getters and setters for all attributes.

2. Derived Classes:

   - Create three derived classes, each representing a specific type of device (e.g., "Smartphone", "Laptop", "Tablet").

   - Each derived class should inherit from the "Device" class and have additional attributes and methods that are specific to that type of device. For example, a "Smartphone" class may have attributes like "screenSize" and "cameraResolution".

3. Main Program:

   - In the main program, ask the user to input the number of devices they want to create (a number between 1 and 20).

   - Generate random instances of the derived classes with different types and prices for the specified number of devices.

   - Calculate and display the following information:

     - The number of distinct device types created.

     - The total price of all devices.

     - The total weight of all devices.



Additional Tips:

- Use the "Random" class in Java to generate random values for prices, weights, and any other attributes you choose to add to the derived classes.

- Ensure proper encapsulation by using access modifiers (e.g., "private", "protected", "public") for class attributes.

- Organize your code into packages for better structure and readability.

- Include meaningful comments and documentation for your classes and methods.



Grading Criteria:

Your assignment will be graded based on the following criteria:

- Correct implementation of the base class and derived classes.

- Proper usage of inheritance, constructors, and getters/setters.

- Accurate calculation of the total price and total weight.

- Proper code organization, naming conventions, and documentation.

- Successful submission of the GitHub repository link.
