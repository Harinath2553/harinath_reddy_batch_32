

public class Intconversion {
    static String s;
    public Intconversion(String s) {
        this.s=s;
    }
    public int test() {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        try {
            Intconversion i =new Intconversion("test");
            System.out.println(i.test());
        }
        catch(NumberFormatException e){
            System.out.print("Cannot convert "+s+" to int");
        }


    }

}