import java.util.*;

public class firstOccurenceOfElement {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,1,2,3,4,1,2,4,3,5,9};
        System.out.println(firstoccurence( nums , 0 , 9 ));;
    }
    public static int firstoccurence ( int[] nums , int idx , int x ){
        if ( idx == nums.length){
            return 0;
        }
        if ( nums[idx] == x ){
            return idx ;
        }else {
            int first = firstoccurence ( nums ,  idx +1  , x );
            return first ;
        }
    }
}
