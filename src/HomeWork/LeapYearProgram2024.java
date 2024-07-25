package HomeWork;

import java.util.Scanner;

public class LeapYearProgram2024 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = s.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The given year is Leap Year");
        }
        else {
            System.out.println("Provided year is not Leap year");
        }
    }
}
