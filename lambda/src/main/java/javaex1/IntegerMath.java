package javaex1;
// to ma być interfejs fukcyjny opisujący wyrażenia lambda w postaci
//(a, b) -> a+b // (a, b) -> a-b
@FunctionalInterface
public interface IntegerMath {
    Integer operationCalc (Integer a, Integer b);

}
