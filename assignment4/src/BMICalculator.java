import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter height and weight
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weightKg = scanner.nextDouble();

        // Convert height from centimeters to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weightKg / (heightM * heightM);

        // Determine the BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        // Display the result
        System.out.printf("Your BMI is %.2f (%s)%n", bmi, category);

        // Close the scanner
        scanner.close();
    }
}
