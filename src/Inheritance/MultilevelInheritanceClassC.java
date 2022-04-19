package Inheritance;

public class MultilevelInheritanceClassC extends MultilevelInheritanceClassB{

    public static void main(String[] args) {

        MultilevelInheritanceClassC objC = new MultilevelInheritanceClassC();

        System.out.println(objC.varClassA);
        objC.methodClassA();

        System.out.println(objC.varClassB);
        objC.methodClassB();
    }
}
