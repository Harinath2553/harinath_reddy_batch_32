interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation of method2");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
    }
}
