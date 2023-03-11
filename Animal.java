package JavaConcepts;

/* abstract example class you cannot instantiate but can make subclasses,
and cannot create objects of animal class.  Interface vs Abstract differences are
you can impliment as many interfaces as you want vs extend once of abstract and feilds
in interfaces must be "static" and "final".  Any extended classes must have a makesSound method.
*/

public abstract class Animal {


    public abstract void makeSound();  // method abstract don't specify body for method

    }


