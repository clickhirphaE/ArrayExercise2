/*Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
Expected output:
(6,7)
(9,4)*/


public class SumOfTwo_Array {

public static void main(String args[]){
    int array1[]={1,7,6,5,9};
    int array2[]={2,7,6,3,4};
    for(int i=0;i<array1.length;i++){
        {
            for(int j=array2.length-1;j>=0;j--){
                if(array1[i]+array2[j]==13){
                    System.out.println("("+array1[i]+","+array2[j]+")");
                }
            }
        }
    }

}}
