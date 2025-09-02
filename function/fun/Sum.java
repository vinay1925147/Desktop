import java.util.*;
public class Sum {
    public static int  Product( int  a, int  b){
         return a*b;
        }
        public static int  Product( int  a, int  b,  int  c){
            return a*b*c ;
           }
          public static float  Product( float  a, float  b,  float  c){
            return a*b*c ;
           }
 

    public static void main (String args[])
    { 
        
      System.out.println( Product(5, 6));
      System.out.println( Product(5, 6, 6));
      System.out.println( Product(5.5f, 6.5f, 6.6f));

}
    
}
