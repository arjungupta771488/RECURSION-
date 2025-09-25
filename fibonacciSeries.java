import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 1 ;
        System.out.print( " " +  a );
        System.out.print( " " +  b );
        seriesFibonacci( a, b, 5 );
    }
    public static void seriesFibonacci ( int a , int b , int n ){
        if ( n == 0 ){
            return ;
        }
        int sum = a + b ;
        System.out.print( " " +  sum );
         a = b ;
         b = sum ;
         seriesFibonacci( a, b , n -1 );

    }
}
