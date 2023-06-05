import java.sql.SQLOutput;

public class child extends Parent {

    int age ;

    child (String name,int age){
        super(name);
        this.age=age;

    }

    child(int age ){
        this.age=age;
    }

    public static void main(String[] args) {
        child c = new child("hari",20);
        child c1= new child(26);
        System.out.println(c.name+" "+c.age);
        System.out.println(c1.name+" "+c1.age);
    }
}
