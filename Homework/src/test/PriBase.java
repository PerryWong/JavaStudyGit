package test;

//private 
class Basee{
    Basee(){
        int i = 100;
        System.out.println(i);
    }
}
public class PriBase extends Basee{
    static int i = 200;
    public static void main(String argv[]){
        PriBase p = new PriBase();
        System.out.println(i);
    }
}
