package apnacollege;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // How to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Age:");
        int age = sc.nextInt(); // nextInt() used for taking integer input
        sc.nextLine(); // Consume the newline character left after nextInt()

        System.out.println(age);

        System.out.println("Input your Name:");
        String name = sc.next(); // next() used for taking a single word input
        System.out.println(name);

        sc.nextLine(); // Consume the newline character left after next()

        System.out.println("Input your ID:");
        String id = sc.nextLine(); // nextLine() used for taking the whole line input
        System.out.println(id);

        sc.close(); // Close the scanner to free the resources
    }
}
