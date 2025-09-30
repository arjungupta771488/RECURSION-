import java.util.*;
public class displayAnArray {
    public static void main(String[] args) {
        int [] nums = { 1,2,3,4,5,6,7,8,9 };
        dispArray( nums, 0 );
    }
    public static void dispArray( int [] nums , int idx ){
        if ( idx == nums.length ){
            return;
        }
        System.out.print( nums[idx]+ " ");
        dispArray( nums , idx +1 );
    }
}
