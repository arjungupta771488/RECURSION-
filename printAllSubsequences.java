import java.util.*;

public class printAllSubsequences {
    public static void main(String[] args) {
        String str = "abc";
        printSubsequence( str , 0 , "");
    }
    public static void printSubsequence( String str , int idx , String newStr ){
        if( idx == str.length() ){
            System.out.println( "[" + newStr +"]"  );
            return;
        }
        printSubsequence( str, idx+1 , newStr + str.charAt( idx ));
        printSubsequence( str , idx +1 , newStr );
    }
}
