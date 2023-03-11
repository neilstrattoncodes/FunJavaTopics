package JavaConcepts;

import java.util.*;



public class Main {
    public static void main(String[] args) {


        /* from vehicle class inheritance */
        System.out.println("Inheritance examples:");
        Vehicle vh1 = new Vehicle();
        Motorcycle mb1 = new Motorcycle();
        Car car1 = new Car();
        System.out.println("the motorcycle has " + mb1.wheels + " wheels "); // from Motorcycle Class
        System.out.println("the car has " + car1.wheels + " wheels"); // from Car Class
        System.out.println("the motorcycle has " + mb1.frame + " Frame"); // from Vehicle Class
        System.out.println("the car has a " + car1.radiator + " Radiator"); // from Vehicle Class


        /* from car class polymorphism in same drive method 3 different ways  */
        System.out.printf("the standard speed from vehicle class is "); vh1.drive();    // 100 standard
        System.out.printf("the motorcycle speed is ");mb1.drive();  // 200 for motorbikes overriding
        System.out.printf("the car speed is ");car1.drive(); // 150 for cars overriding

        /* Method overloading in polymorphism */
        System.out.printf("the standard horn is ");mb1.honkhorn(); // Beep Beep regular
        System.out.printf("the overloaded horn is ");mb1.honkhorn(3);  // Beep Honk x3 overloading example
        System.out.println("");


        /* abstraction example */
        System.out.println("Abstraction example:");
        Dog theDog = new Dog();
        System.out.printf("the dog says ");theDog.makeSound();
        System.out.println("");

        /* Encapsulation examples */
        System.out.println("Encapsulation Example:");
        Bicycle bicycle = new Bicycle("Mountian Bike", "Blue", 24);
        System.out.println("The Bicycle is a " + bicycle.getType() + " its color is " + bicycle.getColor() + " its a " + bicycle.getGears() + " speed.");
        System.out.println("");


        /* linked lists faster than array, used doubly linked list to store elements, can act as list and queue*/
        System.out.println("Linked List examples");
        LinkedList<String> dogs = new LinkedList<>();
        dogs.add("Bulldog");
        dogs.add("Beagle");
        dogs.add("Poodle");
        System.out.println("Linked list of dogs " + dogs );
        System.out.println("Linked list size "  + dogs.size()); // shows size of Linked list before removal
        dogs.remove("Beagle");  // remove item from Linked list
        System.out.println("Linked list with Beagle removed " + dogs);
        System.out.println("New size of Linkedlist of dogs " + dogs.size()); // sets size of Linked list after removal
        System.out.println("");

        /* Arrays */
        System.out.println("Arrays example:");
        String[] birds = {"Parrot", "Budgie", "Crow", "Blue Jay"};
        System.out.println(Arrays.toString(birds));
        int [] arr = new int[4];
        arr[ 0 ] = 1 ;
        arr[ 1 ] = 2 ;
        arr[ 2 ] = 3 ;
        arr[ 3 ] = 4 ;  // add items to the array
        System.out.println(Arrays.toString(arr));  // print out array using .toString
        System.out.println("");



        /* arraylist uses dynamic array to store elements, acts as a list*/
        System.out.println("Arraylist examples:");
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Siamese");
        cats.add("Persian");
        cats.add("Bengal");
        System.out.println("Array list of cats " + cats);
        cats.set(2, "Siberian"); // replaces position #2
        System.out.println("Array list of cats replaced value " + cats);
        System.out.println("");

        /* hashmaps ids to name don't go in order just a reference to key value pairs */
        System.out.println("HashMap examples:");
        HashMap<Integer, String> personIDs = new HashMap<>(); // specify types to match each other as key value pair.
        personIDs.put(30, "Neil");
        personIDs.put(10, "Bill");
        personIDs.put(22, "David");  // put will add values,  replace will only replace if value exists.
        System.out.println("Hash Map of Persons " + personIDs);
        System.out.println("Value of ID 10 is: " + personIDs.get(10)); // gets by key value 10, name Bill.
        System.out.println("Boolean to see if Hashmap contains id 22: " + personIDs.containsKey(22));  // will return true of key value exists.
        System.out.println("Boolean to see if Hashmap contains name Larry: " + personIDs.containsValue("Larry")); // will return false
        personIDs.put(10, "Carl"); // will replace value 10 with Carl
        System.out.println("Hashmap with Carl added to replace Bill " + personIDs.values()); // new values will have Carl in the Hash Map.
        System.out.println("");

        /* Queue examples first in first out */
        System.out.println("Queue examples:");
        Queue<String> foodOrder = new LinkedList<>();
        foodOrder.add("Lenny");
        foodOrder.add("Carl");
        foodOrder.add("Homer");
        System.out.println(foodOrder.peek() + " is next in the queue"); // to see who's next in queue.
        System.out.println(foodOrder.poll() + " was served and removed from the queue"); // to remove first in queue.
        System.out.println("The remaining people in the queue are: " + foodOrder); // to see who's next in queue.
        System.out.println("");

        /* Stack examples last in first out */
        System.out.println("Stack Example:");
        Stack<String> books = new Stack<>();
        books.add("Harry Potter");
        books.add("Lord of the Rings");
        System.out.println(books.push("The Chronicles of Narnia") + " was added to the stack"); // to push an item to the Stack
        System.out.println(books.pop() + " was removed from the Stack"); // removed last item
        System.out.println("The remaining books are : " + books);
        System.out.println("");

        /* Set examples don't allow duplicates and not in order */
        System.out.println("Set Example:");
        Set<String> movies = new HashSet<>();
        movies.add("Star Wars");
        movies.add("Star Trek");
        movies.add("Home Alone");
        movies.add("The Godfather");
        movies.add("Star Trek"); // duplicates are not allowed
        movies.remove("Home Alone"); // must use value not index because by index is random.
        for( String movie : movies){    // enhanced For loop
            System.out.println(" the movies are : " + movie);
        }
        System.out.println("");




        /* multithread examples start() to multithread.  run, will run in order. */
        Multithreads mt1 = new Multithreads(1);  // assign thread a number
        Multithreads mt2 = new Multithreads(2); // assign thread a number
        System.out.println("Multithread example:");
        mt1.start();  //  this will start a multithread.
        mt2.start(); // this is a second thread.











    }
}
