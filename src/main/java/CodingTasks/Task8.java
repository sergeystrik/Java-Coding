package CodingTasks;

public class Task8 {
    public static void main(String[] args) {
//Maximum and minimum number in the array?
        int[] array = {10, 5, 8, 2, 15, 3}; // Example array

        // Initialize max and min to the first element of the array
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
