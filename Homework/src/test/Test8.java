package test;

public class Test8{
//	static 是没有的不能编译
    static String s;
    static class Inner {
        void testMethod() {
            s = "Hello world.";
        }
    }
    public static void main(String[] argv) {
        Inner i = new Inner();
        i.testMethod();
        System.out.println(s);
    }
}
