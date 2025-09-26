public class FirstAndLastOccuranceOfAnElementInString {
    public static void main(String[] args) {
        String str = "abcdefghaa";
       int first = -1 ;
       int last = -1 ;
       int n = 0 ;
        firstAndLastOccurance( str , 'b',  n , first , last );
    }
    public static void firstAndLastOccurance( String str , char element  , int n , int first , int last ){
        if ( n == str.length()  ){
            System.out.println( first);
            System.out.println( last );
            return ;
        }
        if ( str.charAt( n ) == element ){
           if ( first == -1 ){
               first = n ;
           }else {
               last = n ;
           }
        }
        firstAndLastOccurance( str , element , n +1 , first , last );
    }
}
