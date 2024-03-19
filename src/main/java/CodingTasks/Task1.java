package CodingTasks;

public class Task1 {
    public static void main(String[] args) {
        //1.Create a program that uses an array to store a list of temperatures for
        // a week, and then uses a loop to find the highest and lowest temperature for the week.
        double [] temp=new double[]{64.0,65.3,57.0,67.2,59.5,60.5,66.0};
        double high=temp[0];
        double low=temp[0];
        for (int i=1;i< temp.length;i++){
            if (temp[i]>high){
                high=temp[i];
            }
            if (temp[i]<low){
                low=temp[i];
            }
        }
        System.out.println("Highest temp is "+high);
        System.out.println("Lowest temp is "+low);
    }
}
