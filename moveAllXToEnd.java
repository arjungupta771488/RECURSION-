import java.util.*;

public class moveAllXToEnd {
    public static void main(String[] args) {
        String str = "abxcdxmxx";
         moveXToEnd(  str , 'x',0 , 0 , "" );
    }

    public static void moveXToEnd( String str , char x , int iterator ,int count ,  String newStr ){
        if ( iterator == str.length()  ){
            for ( int i =0 ; i < count; i ++ ){
                newStr += "x";
            }
            System.out.println( newStr);
            return ;
        }
        if ( str.charAt( iterator ) == x){
            count ++ ;
            moveXToEnd(  str , x ,iterator +1 , count ,  newStr );
        }else {
            newStr += str.charAt( iterator );
            moveXToEnd(  str , x ,iterator +1 ,count , newStr );
        }

    }

}
