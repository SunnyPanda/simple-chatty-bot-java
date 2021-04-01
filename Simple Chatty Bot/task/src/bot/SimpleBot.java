package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Olivia.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        final int rem3 = scanner.nextInt();
        final int rem5 = scanner.nextInt();
        final int rem7 = scanner.nextInt();

        final int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.printf("Your age is %s; that's a good time to start programming!", age);
    }
}