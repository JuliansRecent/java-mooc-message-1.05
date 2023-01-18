
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print "Write a message"
        System.out.println("Write a message:");
        // Read the string written by the user, and assign it to program memory as the variable "message"
        String message = scanner.nextLine();
        // Print the message written by the user
        System.out.println(message);


    }
}
