package by.issoft.b;

public class Runner {

    public static void main(String[] args) {

        //byte,short,int,long, float, double
        //char

        int i = 1456;

        B b = new B();
        b.m1();

        //полиморфизм
        A a = b;


        B b1 = (B) a;
        ((B) a).m1();

    }
}

class A {
    private int i;
    private int j;
    private int k;

    public void m(int i, int j) {

    }
}

//"is a A"
class B extends A {
    private int k;
    private int i;
    private int j;

    public void m1() {
        B b = this;
        this.m(1, 2);
        System.out.println(k);
    }
}