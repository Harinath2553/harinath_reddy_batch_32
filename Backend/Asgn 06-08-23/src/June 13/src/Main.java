
public class Main extends extThread{
    public static void main(String [] args){
        Thread t=new extThread();
        Thread t1=new Thread(new InterThread());
        t.start();
        t1.start();
    }
}