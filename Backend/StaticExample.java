public class StaticExample {
   static int count=9;

   static {
       System.out.println(count);
       count();
       System.out.println("count:"+ count);
   }


    public static void count(){

        count=10;

    }

    public static void main(String[] args) {

    }

}
