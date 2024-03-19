package CodingTasks;

public class Task7 {
    public static void main(String[] args) {
//Write a Java Program to print the first 10 numbers of Fibonacci series
        int n = 10;
        int a = 0, b = 1;
        System.out.println("First " + n + " numbers of Fibonacci series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
