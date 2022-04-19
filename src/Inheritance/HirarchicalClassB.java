package Inheritance;

public class HirarchicalClassB extends HirarchicalClassA{

    int varClassB = 20;

    public static void methodClassB()
    {
        System.out.println("This is ClassB Method");
    }

    public static void main(String[] args) {

        HirarchicalClassB objB = new HirarchicalClassB();

        System.out.println(objB.varClassA);
        objB.methodClassA();

        System.out.println(objB.varClassB);
        objB.methodClassB();
    }
}
