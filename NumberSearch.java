package exam;
import java.util.Scanner;
public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers into the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(target + " is present in the array.");
            System.out.println(target + " appears " + count + " time(s) in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }

        scanner.close();
    }
}