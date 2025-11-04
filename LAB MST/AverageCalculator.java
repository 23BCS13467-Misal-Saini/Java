// Question 3: Exception Handling
// Write a Java program that reads a list of integers from the user into an 
// ArrayList. Calculate the average of the numbers. Handle the following exceptions:
// 1. ArithmeticException if the list is empty (to avoid division by zero).
// 2. Use a try-catch block to manage these exceptions and provide meaningful error
// messages. Give easy java code.

import java.util.*;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        try {
            if (numbers.isEmpty()) {
                throw new ArithmeticException("List is empty, cannot calculate average.");
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            double avg = (double) sum / numbers.size();
            System.out.println("Average = " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
