/**
 * Created by CECE on 6/29/16.
 */

import java.util.Scanner;
public class cece1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //scanner

        String s = "flsdja";
        int r = 8;

        System.out.println("Hi, I am Tom5000. What is your name?");

        s = input.nextLine(); //gets result

        System.out.println("That's an awful name, " + s + ". What is your favorite color?");

        s = input.nextLine(); //gets result

        if (s.equals("red")) {

            System.out.println("That is my favorite color too!");
        } else {
            System.out.println("oh. mine is red.");
        }

        System.out.println("Do you like animal crackers? If you do, type 1. if you don't, type 2, if you think animal crackers are awful, type 3.");

        r = input.nextInt();

        input.nextLine();

        if (r == 1) {
            System.out.println("They are so good. I'm glad you like them.");
        } else if (r == 2) {
            System.out.println("That's upsetting. give them another try.");
        } else if (r == 3) {
            System.out.println("well, you need to rethink a lot about your life.");
        } else {
            System.out.println("Clearly you don't know how to follow rules.");
        }

        System.out.println("Anyways, where do you live?");

        s = input.nextLine(); //gets result

        System.out.println("Do you like it there? If you do, type 1. if you don't, type 2.");

        r = input.nextInt();

        if (r == 1) {
            System.out.println("That's awesome! I'm happy you're happy.");
        } else if (r == 2) {
            System.out.println("I'm sorry. Don't worry, you'll be able to leave soon!");
        } else {
            System.out.println("Clearly you don't know how to follow rules.");
        }

        System.out.println("I am only a program, so I live wherever I am used. However, I was initially created in El Segundo, California.");

        System.out.println("GoOdByE!");
    }
}

