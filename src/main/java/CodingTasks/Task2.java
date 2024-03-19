package CodingTasks;

public class Task2 {
    public static void main(String[] args) {
//2.Create an array of integer values. After the array is created, calculate the sum of all stored elements
// in that array.
        int [] elements=new int[]{25,46,75,23,45};
        int sum=0;
        for (int num : elements){
            sum+=num;
        }
        System.out.println("Sum is:"+sum);
        }

    }
