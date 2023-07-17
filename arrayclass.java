import java.util.Arrays;

public class arrayclass {
    public static void main(String[] args) {

        // int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int index = Arrays.binarySearch(numbers, 4);

        // System.out.println("the index of element 4 in the array: " + index);

        Integer[] numbers = { 10, 40, 30, 50, 100, 90, 80, 70 };
        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
