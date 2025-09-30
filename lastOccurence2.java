import java.util.*;

public class lastOccurence2 {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,3,4,1,2,3,4,1,2,4,3,5,9};
        System.out.println( lastOcc( nums , 0 , 0));
    }
    public static int lastOcc( int[] nums , int idx , int x ){
        if ( idx == nums.length ){
            return -1 ;
        }
        int last = lastOcc( nums , idx +1  ,x );
        if (  -1 == last ){
            if( nums[idx ]== x ){
                return idx;
            }else {
                return -1 ;
            }
        }else {
            return last;
        }
    }
}
