package CodingTasks;

public class Task6 {
    public static void main(String[] args) {
//Write a java program to check whether a given number is prime or not?
        int number = 29; // Change this number to test different cases

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}