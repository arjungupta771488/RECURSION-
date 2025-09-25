import java.util.*;
public class printNumberNto1 {
    public static void main(String[] args) {
        recursiveFnc( 5 );
    }
    public static void recursiveFnc( int n ){

        if ( n == 0 ){
            return;
        }
        System.out.print(" "+ n  );
        recursiveFnc( n - 1 );
    }

}
