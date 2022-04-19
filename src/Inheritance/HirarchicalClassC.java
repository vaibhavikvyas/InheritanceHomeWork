package Inheritance;

public class HirarchicalClassC extends HirarchicalClassA{

    int varClassC = 30;

    public static void methodClassC()
    {
        System.out.println("This is ClassC Method");
    }

    public static void main(String[] args) {
        HirarchicalClassC objC = new HirarchicalClassC();

        System.out.println(objC.varClassA);
        objC.methodClassA();

        System.out.println(objC.varClassC);
        objC.methodClassC();
    }
}
