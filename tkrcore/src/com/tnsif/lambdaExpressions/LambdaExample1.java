package com.tnsif.lambdaExpressions;

public class LambdaExample1 {
    public static void main(String[] args) {
        Runnable greet = () -> System.out.println("Hello from Lambda Expression!");
        greet.run();
    }
}

