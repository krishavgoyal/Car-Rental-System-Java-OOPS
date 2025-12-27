# Car-Rental-System-Java-OOPS
A robust, interactive Car Rental System built in Java. This project demonstrates complex relationships between objects, managing real-world workflows like inventory tracking, customer registration, and transaction processing using the ArrayList collection.

*Key Features*
Live Inventory Tracking: Real-time updates on car availability (Rent/Return status).
Automated Billing: Dynamic price calculation based on the specific car's base rate and the number of rental days.
Transaction Management: Uses a dedicated Rental class to link specific customers to specific cars.
Input Validation: Built-in checks to ensure cars cannot be double-rented and valid IDs are used for returns.

*OOP Concepts Applied*
This project serves as a practical example of how multiple objects work together:
Composition: The Rental class "has-a" Car and a Customer, showing how objects can be composed of other objects.
Encapsulation: All sensitive data (Car IDs, prices, availability) are kept private and accessed via professional getter and setter methods.
Logic Separation: The system is divided into logical entities (Car, Customer, Rental) and a controller class (CarRentalSystem).
Looping & Collections: Efficient use of while loops and ArrayLists to manage a growing list of rentals and customers.

*System Architecture*
Car Class: Stores vehicle details (ID, Model, Brand) and manages its own availability state.
Customer Class: Represents the user renting the vehicle with a unique ID.
Rental Class: The "bridge" class that stores the connection between a Car, a Customer, and the time period.
CarRentalSystem: The main engine that handles the logic for renting, returning, and displaying the menu.
Main: The entry point that pre-loads the system with initial car data.
