public class Car {
    String brand;
    int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }



    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        car1.displayInfo();
    }

}