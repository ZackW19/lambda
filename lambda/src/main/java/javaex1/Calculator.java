package javaex1;

public class Calculator {
    public Integer operateBinary(Integer a, Integer b, IntegerMath lambda){
         Integer results =  lambda.operationCalc(a, b);
        return results;
    }

}
