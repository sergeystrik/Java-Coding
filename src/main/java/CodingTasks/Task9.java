package CodingTasks;

public class Task9 {
    public static void main(String[] args) {
//Write a java program to find the second largest number in the array?
        int [] main = {5, 10, 33, 78, 83, 100, 169, 210};

        int a = 0;
        int b = 0;

        for (int i = 0; i < main.length; i++) {
            if (main[i] > a) {
                b = a;
                a = main[i];
            } else if (a > main[i] && main[i] > b) {
                b = main[i];
            }
        }
        System.out.println("The Second Largest Number in This Array is " + b);
    }
}
