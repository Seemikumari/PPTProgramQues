
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class AvgCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<Integer> num= new ArrayList<>();

        int sum = 0;
        int count=0;
        int number;
                System.out.println("Enter the list of numbers");
                do{
                    number = sc.nextInt();
                    if(number!= -1){
                        num.add(number);
                        count++;

                    }
                }
                while(number!=-1);
                if(count>0){
                    double avg= (double) sum/count;
                    System.out.println("Average"+ avg);
                }
                else{
                    System.out.println("no numbers entered");
                }
    }
}
