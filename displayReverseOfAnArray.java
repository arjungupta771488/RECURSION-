import java.util.*;
public class displayReverseOfAnArray {
    public static void main(String[] args) {
        int [] nums = { 1,2,3,4,5,6,7,8,9 };
        dispRevArray( nums, nums.length-1  );
    }
    public static void dispRevArray( int[] nums, int idx  ){
        if ( idx == -1 ){
            return;
        }
        System.out.print( nums[idx ] + " ");
        dispRevArray( nums, idx-1  );
    }
}
