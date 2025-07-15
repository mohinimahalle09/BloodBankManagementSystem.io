import java.util.Scanner;

public class TenThousand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mohini Mahalle");
        System.out.print("Enter an integer: ");      // Input
        int number = scanner.nextInt();

        number = Math.abs(number);                   // Convert to positive to handle negative numbers


        int tensPlace = (number / 10) % 10;          // Extract ten's place (2nd digit from right)

        
        int thousandsPlace = (number / 1000) % 10;   // Extract thousand's place (4th digit from right)

    
        int sum = tensPlace + thousandsPlace;        // Calculate sum

    
        System.out.println("Ten's place digit: " + tensPlace);        // Output
        System.out.println("Thousand's place digit: " + thousandsPlace);
        System.out.println("Sum of ten's and thousand's place digits: " + sum);

        scanner.close();
    }
}