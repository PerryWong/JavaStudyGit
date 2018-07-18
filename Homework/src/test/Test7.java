package test;

class Base7 {
    void f(int i) {System.out.println("int"); }
    void f(double d) {System.out.println("double");}
}
public class Test7 extends Base7 {
    void f(String s) { System.out.println("String"); }
    public static void main(String argv[]){
    		Test7 a = new Test7();
        a.f(10);
    }
}
