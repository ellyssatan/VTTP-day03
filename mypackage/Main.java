package mypackage; 

public class Main {
    public static void main(String[] args) {
        // Instantiate a car
        Car carOne = new Car();
        carOne.setColor("red");
        /*
        myCar.getColor = "red";
        myCar.make = "Mazda";
        myCar.engineCapacity = 2000;
        */
        carOne.start();
        System.out.printf("The color of my car is %s\n", carOne.getColor());

        carOne.setColor("pink");
        System.out.printf("I changed color of my car to %s\n", carOne.getColor());


        // Instantiate another car
        Car otherCar = new Car(2500);
        otherCar.setColor("white");
        otherCar.setMake("Nissan");
        otherCar.setEngineCapacity(2010);
        otherCar.stop();
        System.out.printf("The color of my car is %s\n", carOne.getColor());
        System.out.printf("The engine capacity of my car is %d\n", otherCar.getEngineCapacity());

        Car myThirdCar = new Car("blue", "Subaru");
        myThirdCar.make = "subaru";
        //System.out.printf("myThirdCar is a %s\n", myThirdCar);


        // Honda
        Honda civic = new Honda();
        System.out.printf("Make of car: %s\n", civic.getMake());
        civic.accelerate();
        civic.stop(10);
    }
}
