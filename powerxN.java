import java.util.*;

public class powerxN {
    public static void main(String[] args) {
        System.out.println(filterNegativePow( -2 , 2 ));
    }
public static double filterNegativePow( int n , int x ){
        if ( n < 0 ){
            return 1/ powFnc( n, x );
        }else {
            return powFnc( n, x );
        }

}
    public static double powFnc ( int n , int x ){
        if ( n == 0 ){
            return 1 ;
        }
        if ( x == 0 ){
            return 0 ;
        }
        if ( n % 2== 0  ){
            return powFnc( n /2 , x )* powFnc( n/2 , x );
        }else {
            return powFnc( n /2 , x )* powFnc( n/2 , x ) * x ;
        }
    }
}
