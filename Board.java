/*
*
* The Microwave program lets the user enter the food they want to heat up and how
* many of the items they want, then gives them the time they need to heat the items up.
*
* @author Jakob
* @version 1.0
* @since 2020-11-26
*
*/

import java.util.Scanner;

/**
* Boardfoot.
*/

final class Board {

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Board() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting function.
    *
    * @param args No args will be used
    *
    */

    public static void main(final String[] args) {

        try {

            final Scanner scanner = new Scanner(System.in);
            System.out.println("This program figures out the length of a wooden board"
                + " that is 1 board foot in dimension."
                + " (1 board foot is 144 inches³ of wood).");

            System.out.println("Enter the width(inch): ");
            final double widthInput;
            widthInput = scanner.nextDouble();

            System.out.println("Enter the height(inch): ");
            final double heightInput;
            heightInput = scanner.nextDouble();

    final double calculate = boardfoot(heightInput, widthInput);
    System.out.println("The wood should be " + calculate + " inch(es) long.");

        }
        catch (java.util.InputMismatchException errorCode) {
            // Invalid Input.
            System.out.println("This is not a number.");
        }
        System.out.println("\nDone.");
    }

    /**
    * The boardfoot Function.
    *
    * @param width
    *
    * @param height
    *
    * @return return
    */
    public static double boardfoot(double width, double height) {

        final double equation = width * height;
        final double finalEquation = 144 / equation;

        return finalEquation;

    }
}
