package CodingTasks;

public class Task3 {
    public static void main(String[] args) {
//3.Create a 2D array of integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.
        int[][] array={
                {10,20,25,33},
                {22,34,64,67},
                {45,56,76,32}
        };
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                if (array[i][j]%2==0){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
