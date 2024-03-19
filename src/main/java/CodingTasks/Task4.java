package CodingTasks;

public class Task4 {
    public static void main(String[] args) {
//Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers
// for that array
        int[][] numbers = {
                {10,33,23},
                {47,57,26},
                {74,48,39}
        };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2== 0) {
                    even += numbers[i][j];
                } else {
                    odd += numbers[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }
}