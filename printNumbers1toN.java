import java.util.*;

public class printNumbers1toN {
    public static int num = 0 ;
    public static void main(String[] args) {
        recursiveFnc1( 5 , 1 );

    }
    public static void recursiveFnc1( int n , int iterator ){
        if ( iterator == n ){
            System.out.print( " " + iterator );
            return;
        }
        System.out.print( " " + iterator );
    recursiveFnc1( n , iterator + 1  );
    }
}
