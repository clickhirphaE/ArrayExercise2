/*Prompt the user to input 10 values and store them into an array.
 Output the total number of odd and even values in the array.*/
import java.util.*;
public class CountTotalNumbers_of_OddandEven {
    public static void main(String args[]){
        int Ten_Arrays[]=new int[10];
        int y=0,z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ten Numbers into an Array:");
        for(int i=0;i<Ten_Arrays.length;i++){
            Ten_Arrays[i]=sc.nextInt();
            if((Ten_Arrays[i])%2==0){
                y++;
            }
            else if((Ten_Arrays[i]%2)!=0){
                z++;
            }}
            System.out.println(" There are "+y+" number of evens in your input");
            System.out.println(" There are "+z+" number of odds in your input ");
        }
    }

