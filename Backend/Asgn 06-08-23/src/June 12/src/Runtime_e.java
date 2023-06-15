
public class Runtime_e {

    public void test(int a,int b) {
        try {
            if(b==0) {
                throw new Exceptionr("Cannot Divide By zero");
            }
            else {
                System.out.println(a/b);
            }
        }
        catch(Exceptionr r) {

            System.out.println(r);

        }

    }
    public static void main(String [] args) {
        Runtime_e r=new Runtime_e();
        r.test(5,0);
    }
}