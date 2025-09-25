import java.util.*;

public class sumOfNNaturalNums {

    public static void main(String[] args) {
        System.out.println(  recursiveFnc2 (  7 ,0  ));
    }
    public static int recursiveFnc2 ( int n ,int result ) {
        if ( n == 0 ){
            return result ;
        }
         result = n + recursiveFnc2( n-1 , result  ) ;
        return result ;
    }
}
