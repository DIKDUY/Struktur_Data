import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Part 1: Calculate age
        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
        
        // Part 2: Calculate PPN (10% VAT)
        System.out.print("Enter total purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double ppn = purchaseAmount * 0.10;
        System.out.println("The PPN (10% VAT) is: " + ppn);
        
        input.close();
    }
}