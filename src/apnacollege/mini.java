package apnacollege;

import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
        // mini project
        int myNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
        int userNumber = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Guess my number:");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO...CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large.");
            } else {
                System.out.println("Your number is too small.");
            }
        } while (userNumber >= 0);

        System.out.println("My number was: " + myNumber);
        sc.close();
    }
}


