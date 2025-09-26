import java.util.*;

public class TowerOfHanoi {
    public static int reversedNum = 0 ;;
    public static int first = -1 ;
    public static int last = -1 ;
    public static void main(String[] args) {
        towerOfHanoi( 3 , " s ", " h ", " d ");
    }

    public static void  towerOfHanoi (  int n , String source , String helper , String destination ){
        if ( n == 1){
            System.out.println( " move disk " + n + " from " + source + " to " + destination );
            return;
        }
        towerOfHanoi( n-1 , source , destination , helper );

        System.out.println(" move disk " + n + " from " + source + " to " + destination );
        towerOfHanoi( n-1 ,helper  ,  source , destination );

    }
}
