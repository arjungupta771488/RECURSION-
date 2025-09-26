import java.util.*;

public class PrintAStringInReverse {
    public static void main(String[] args) {
        String str = " abcdefgh";
        int n = str.length() -1 ;
        printAStringInReverse( str ,  n );

    }
    public static void printAStringInReverse( String str , int n ){
        if ( n == 0 ){
            return ;
        }
        System.out.print( str.charAt( n ));
        printAStringInReverse( str ,  n -1 );
    }
}
