import java.sql.SQLOutput;

public class FibonaccyNumber {

    public static void main(String[]args){
        // print fibonaaci series
        // intiliaze two integer
        int a = 0;
        int b = 1;
        int c;
        int z =10;
        System.out.print(a +" " + b);
        for ( int i =1;i<=z;i++){
            c= a+b;
            System.out.print(" " +c);
            a=b;
            b=c;
        }

    }
}
