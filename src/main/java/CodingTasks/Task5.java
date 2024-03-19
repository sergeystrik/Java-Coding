package CodingTasks;

public class Task5 {
    public static void main(String[] args) {
//Write a program to swap 2 numbers without a temporary variable?
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
