public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Camry", "Toyota", 60.0, true);
        Car car2 = new Car("C002", "Civic", "Honda", 50.0, true);
        Car car3 = new Car("C003", "Thar", "Mahindra", 80.0, true);
        Car car4 = new Car("C004", "Model 3", "Tesla", 120.0, true);

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);
        rentalSystem.addCar(car4);

        rentalSystem.menu();
    }
}