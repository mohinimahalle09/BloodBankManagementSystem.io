import java.util.Scanner;

public class UnitHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mohini Mahalle");  
        System.out.print("Enter an integer: ");                        // Input
        int number = scanner.nextInt();

        int unitPlace = Math.abs(number) % 10;                         // Extract unit place (1s digit)

        int hundredPlace = (Math.abs(number) / 100) % 10;              // Extract hundred place (100s digit)

        int sum = unitPlace + hundredPlace;                            // Calculate sum

        System.out.println("Unit place digit: " + unitPlace);          // Output
        System.out.println("Hundred place digit: " + hundredPlace);
        System.out.println("Sum of unit and hundred place digits: " + sum);

        //scanner.close();
    }
}