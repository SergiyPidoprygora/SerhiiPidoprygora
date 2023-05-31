import com.sun.jdi.IntegerValue;

/* autoboxing by metod */
public class Work {
  public static void main(String[] args){
      Integer a = 5;
      int b = 40;
      int result = Integer.valueOf(a+b);
      System.out.println(result);
      System.out.println( a == b);
      System.out.println(a+b!=50);
      int c = 40;
      short k = 10;
      int result1 = Integer.valueOf(c*k-b/a);
      System.out.println(result1);
      System.out.println(k*c==400);
      Integer L = 391;
      int result2 = Integer.valueOf(L+a+4);
      System.out.println(result2);
      System.out.println(result2%k*c);
      System.out.println(result1==result2);
    }

}
