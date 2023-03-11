
import java.util.Scanner;

public class FunJavaTopics {
    public static void main(String[] args) {

        Scanner message = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your message");

        String myMessage = message.nextLine(); // Puts input into variable

        System.out.println("Your message is: " + myMessage);  // Outputs user input

    }
}
