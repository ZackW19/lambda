package javaex1;

public class Main {
    public static void main(String... args) {

        Calculator myApp = new Calculator();
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, (a, b) -> a + b));
        System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, (a, b) -> a - b));

        /* więcej pisania :)
        IntegerMath addition= (a, b) -> a + b;
        IntegerMath subtraction= (a, b) -> a -b;
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));    }
        */
    }
}

