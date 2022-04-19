package Inheritance;

public class MultilevelInheritanceClassB extends MultilevelInheritanceClassA {

    int varClassB= 20;

    public static void main(String[] args) {

        MultilevelInheritanceClassB objB = new MultilevelInheritanceClassB();

        System.out.println(objB.varClassA);
        objB.methodClassA();

        System.out.println(objB.varClassB);
        objB.methodClassB();
    }

    public static void methodClassB()
    {
        System.out.println("This is Class B Method");
    }
}
