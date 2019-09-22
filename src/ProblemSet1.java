/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double LENGTH = 8.5;
         final double WIDTH  = 11;
         final double CONVERSION_TO_MM = 25.4;
         double lengthInMillimeters = LENGTH * CONVERSION_TO_MM;
         double widthInMillimeters = WIDTH * CONVERSION_TO_MM;
         double area = lengthInMillimeters * widthInMillimeters;
         System.out.println ("\n" + String.format("%,.2f", area) + " square millimeters.");


        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double CONVERSION_TO_CM = 2.54;
         double lengthInCentimeters = LENGTH * CONVERSION_TO_CM;
         double widthInCentimeters = WIDTH * CONVERSION_TO_CM;
         double perimeter = (lengthInCentimeters * 2) + (widthInCentimeters * 2);
         System.out.println ("\n" + String.format("%.2f", perimeter) + " centimeters.");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double a = LENGTH;
         double b = WIDTH;
         double c = (a * a) + (b * b);
         c = Math.sqrt(c);
         System.out.println ("\n" + String.format("%.2f", c) + " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;


        double homeworkAvg = (homework1 + homework2 + homework3) / 3.00;
        double homeworkTotal = homeworkAvg * 0.15;
        double quizAvg = (quiz1 + quiz2 + quiz3) / 3.00;
        double quizTotal = quizAvg * 0.35;
        double testAvg = (test1 + test2 + test3) / 3.00;
        double testTotal = testAvg * 0.50;
        double finalGrade = homeworkTotal + quizTotal + testTotal;
        System.out.println ("\n" + String.format("%.2f", finalGrade) + "%");



        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */



         /*
            Monday, 7.5 hours
            Tuesday, 8 hours
            Wednesday, 10.5 hours
            Thursday, 9.5 hours
            Friday, 6 hours
            Saturday, 11.5 hours
            Sunday, 0 hours
        */
            final double HOURLY_WAGE = 12.5;
            double amountOfHours = 7.5 + 8 + 10.5 + 9.5 + 6 + 11.5; // 53
            double money = HOURLY_WAGE * amountOfHours;
            System.out.println ("\n" + String.format("$%.2f", money) + ".");



        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */



        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
