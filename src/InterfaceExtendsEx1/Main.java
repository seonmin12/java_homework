package InterfaceExtendsEx1;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        action(b);
        action(c);

    }

    public static void action(InterfaceA A){

        if(A instanceof C c){
            c.method2();

        }else if(A instanceof B){
            A.method1();
        }

    }

}
