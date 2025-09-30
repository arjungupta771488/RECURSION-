import java.util.*;

public class LastOCccurenceOfElement {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,1,2,3,4,1,2,4,3,5,9};
        System.out.println( lastOcc( nums , nums.length-1 ,1  ));
    }
    public static int lastOcc( int[] nums , int idx , int x ){
        if (idx == -1  ){
            return 0 ;
        }
        if ( nums[idx ]== x ){
            return idx ;
        }
        else {
            int last =lastOcc(nums , idx-1 , x );
            return last;
        }
    }
}
