package JavaConcepts;

public class Motorcycle extends Vehicle {

    int wheels = 2;
    int headlights = 1;


    public void drive() {  // example of polymorphism
        System.out.println("200 KM Per hour");

    }

    public void honkhorn(int numberOfBeeps) {
        for (int i = 0; i < numberOfBeeps; i++)
        System.out.println("Beep Honk");
    }


}
