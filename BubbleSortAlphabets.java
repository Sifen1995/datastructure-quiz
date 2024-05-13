package exam;

public class BubbleSortAlphabets {
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        char temp;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }if (!swapped) {
                break;
            }
        }
    }public static void main(String[] args) {
        char[] alphabetArray = {'d', 'a', 'f', 'b', 'c', 'e'};

        System.out.println("Original array of alphabets:");
        for (char c : alphabetArray) {
            System.out.print(c + " ");
        }
        bubbleSort(alphabetArray);

        System.out.println("\n\nSorted array of alphabets:");
        for (char c : alphabetArray) {
            System.out.print(c + " ");
        }
    }
}









