package test;

class Baseee {
    private Baseee() { System.out.println(0);}
    public Baseee(int i) {System.out.println(i);}
}
public class Test6 extends Baseee {
    public Test6() {super(1);};
    public static void main(String argv[]){
        Test6 t = new Test6();
    }
}
