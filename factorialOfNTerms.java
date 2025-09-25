import java.util.*;

public class factorialOfNTerms {

    public static void main(String[] args) {
        System.out.println(  recursiveFnc3 (  6 ,1  ));
    }
    public static int recursiveFnc3 ( int n ,int result ) {
        if ( n == 1 || n == 0   ){
            return 1 ;
        }
        result = n * recursiveFnc3( n-1 , result  ) ;
        return result ;
    }
}