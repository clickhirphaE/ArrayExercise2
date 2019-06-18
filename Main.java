import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int array_1[] = new int[5];
       /* array[0]=2;
        array[1]=3;
        array[2]=4;
        array[3]=5;
        array[4]=6;*/
        int i;
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        for (i = 0; i < array_1.length; i++) {
            array_1[i] = cc.nextInt();

        }
        System.out.println("The Array you input is:");
        for (int j = 0; j < array_1.length; j++) {
            System.out.println(array_1[j]);
        }
    }
}