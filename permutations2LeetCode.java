import java.util.*;

public class permutations2LeetCode {
    public static List<List<Integer>> permuteUnique (int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean [] used = new boolean[ nums.length ];
        backTrack(  nums , new ArrayList<>() , result , used  );
        return result ;
    }
    public static void backTrack( int [] nums ,List< Integer> current ,List<List<Integer>> result ,boolean [] used ) {
        if ( current.size() == nums.length ){
            result.add( new ArrayList<>(current));
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if (used[i]) continue;
            if ( i > 0 &&  nums[i] == nums[ i - 1 ] && !used[ i - 1 ]) continue;
            used[i] = true ;
            current.add(nums[i]);
            backTrack( nums , current , result , used );
            current.remove(current.size() -1 );
            used[i]= false ;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,2 };
        System.out.println( permuteUnique( arr));
    }
}
