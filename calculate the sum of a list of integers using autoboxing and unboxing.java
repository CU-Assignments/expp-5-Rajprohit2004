import java.util.*;

public class Sum {

    // Method to calculate the sum of a list of integers
    public static int calculateSum(List<Integer> integers) {
        int sum = 0;
        for (Integer num : integers) {
            sum += num; // Unboxing happens automatically here
        }
        return sum;
    }

    // Method to parse a list of string representations of integers into Integer objects
    public static List<Integer> parseStringsToIntegers(List<String> stringList) {
        List<Integer> integers = new ArrayList<>();
        for (String s : stringList) {
            try {
                integers.add(Integer.parseInt(s)); // Parsing string to Integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + s);
            }
        }
        return integers;
    }

    public static void main(String[] args) {
        // Example strings that represent integers
        List<String> stringList = Arrays.asList("10", "20", "30", "40", "50");

        // Parse the strings to Integer objects
        List<Integer> integers = parseStringsToIntegers(stringList);

        // Calculate the sum using autoboxing and unboxing
        int sum = calculateSum(integers);

        // Output the result
        System.out.println("The sum of the list of integers is: " + sum);
    }
}
