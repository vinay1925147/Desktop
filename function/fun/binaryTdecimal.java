import java.util.Scanner;
public class binaryTdecimal {
    public static  int BtD(int number){
        int deci=0;
        int pow =0 ;
        while (number>0){
           int  LD = number % 10;
             deci = deci +( LD *(int) Math.pow(2,pow));
             pow++;
             number = number /10;
        }
        System.out.println( "conversion of binay nm to "+ deci);
        return  deci;

    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number: ");
    int number = sc.nextInt();
    BtD(number);


    }
}
