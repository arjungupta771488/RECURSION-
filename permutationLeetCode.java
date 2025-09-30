import java.util.ArrayList;
import java.util.List;

public class permutationLeetCode {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(  nums , new ArrayList<>() , result  );
        return result ;
    }
    public static void backTrack (  int[] nums ,  List<Integer> current , List<List<Integer>> result ){
        if ( current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for ( int num : nums  ){
            if ( current.contains( num )) continue;
            current.add(num);
            backTrack(  nums , current , result );
            current.remove( current.size() -1 );
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3 };
        System.out.println( permute ( arr));
    }
}
