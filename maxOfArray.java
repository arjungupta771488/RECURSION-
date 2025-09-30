import java.util.*;

public class maxOfArray {
    public static int max =0 ;
    public static void main(String[] args) {
        int [] nums = { 1,2,3,9,4,5,6,7,8 };
        System.out.println( maxInArray( nums , 0 ));
    }
    public static int maxInArray ( int [] nums , int idx ){
        if ( idx== nums.length ){
            return max ;
        }
        int max = maxInArray( nums , idx +1 );
        if ( max > nums[idx ]){
            return max;
        }else {
            return nums[idx ];
        }
    }
}
