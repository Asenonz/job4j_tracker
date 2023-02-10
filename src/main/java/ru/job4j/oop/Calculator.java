package ru.job4j.oop;

public class Calculator {

    static private int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + divide(a) + multiply(a);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int rslSum = Calculator.sum(10);
        System.out.println(rslSum);

        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(5);
        System.out.println(rslMultiply);

        int rslMinus = Calculator.minus(30);
        System.out.println(rslMinus);

        int rslDivide = calculator.divide(60);
        System.out.println(rslDivide);

        int rslSumAllOp = calculator.sumAllOperation(20);
        System.out.println(rslSumAllOp);
    }
}