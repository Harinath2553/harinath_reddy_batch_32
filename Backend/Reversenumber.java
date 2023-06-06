
import java.util.Scanner;
public class Reversenumber
{
       int  Reverse(int m){
          int  sum=0;
           while(m > 0) {
              int n = m % 10;
               sum = sum * 10 + n;
               m = m / 10;
           }
           return sum;
       }
    public static void main(String args[])
    {
        Reversenumber Ob=new Reversenumber();
        System.out.println(Ob.Reverse(s));
    }
}
