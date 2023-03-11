package JavaConcepts;

/* example of abstraction any child class will need to have method from Animal*/
public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }


}
