import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class subsets2LeetCode {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort( nums );
        backTrack( 0 , nums , new ArrayList<>() , result  );
        return result ;
    }
    public static void backTrack ( int start , int[] nums ,  List<Integer> current , List<List<Integer>> result ){
        result.add(new ArrayList<>(current));
        for ( int i = start ; i < nums.length ;i++ ){
            if (i > start && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            backTrack( i +1 , nums , current , result );
            current.remove( current.size() -1 );
        }
    }

    public static void main(String[] args) {
        int [] nums = { 1,2,2 };
        System.out.println( subsets(nums ));
    }
}
