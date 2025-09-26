import java.util.*;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int [] nums = { 1, 2, 3, 4, 5,6 , 73, 73 };
        int n = nums.length - 1 ;

        IfArrayIsSorted( nums, n ) ;
        //A strictly sorted array means an array where the next element is always greater than the
        // previous element .
    }
    public static void IfArrayIsSorted( int [] nums, int n ){
        if (n == 0) {
            System.out.println( " Strictly sorted ");
            return ;
        }
        if ( nums [ n ] <= nums [ n  - 1 ]){
            System.out.println( " not Strictly sorted ");
            return ;
        }
        IfArrayIsSorted( nums, n - 1 );
    }
}
