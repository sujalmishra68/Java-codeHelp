class CarDetails {

    String brand;
    String model;
    String color;
    int price;
    int year;
    String fuelType;

    CarDetails(String brand, String model, String color,
               int price, int year, String fuelType) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.fuelType = fuelType;
    }

    void details() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Year : " + year);
        System.out.println("Fuel Type : " + fuelType);
    }
}

public class constructor {

    public static void main(String[] args) {

        CarDetails c1 = new CarDetails(
                "BMW",
                "Sedan",
                "Black",
                1000000,
                2024,
                "Petrol"
        );

        CarDetails c2 = new CarDetails(
                "Audi",
                "SUV",
                "White",
                7000000,
                2025,
                "Diesel"
        );

        c1.details();

        System.out.println();

        c2.details();
    }
}