import java.util.*;

public class removeDuplicatesInString {
     Boolean [] map = new Boolean[26];
    public static void main(String[] args) {
        String str = "abbbcddea";
        Boolean [] map = new Boolean[26];
        Arrays.fill(map, false);
        removeDuplicates( str , 0 , new StringBuilder() , map);
    }
    public static void removeDuplicates( String str , int idx  , StringBuilder newStr,Boolean [] map  ){

        if ( idx == str.length() ){
            System.out.println(  newStr );
            return;
        }
        if ( map[ str.charAt(idx) -'a' ]){
            removeDuplicates( str , idx +1 , newStr , map );
        }else {
            newStr.append(str.charAt( idx ));
            map[ str.charAt( idx ) - 'a']= true ;
            removeDuplicates( str , idx +1 , newStr , map );
        }
    }
}
