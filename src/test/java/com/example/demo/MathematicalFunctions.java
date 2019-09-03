package com.example.demo;

//https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html

public class MathematicalFunctions {

    public static void main(String[] args) {
        MathematicalFunctions fun = new MathematicalFunctions();
        fun.FibbnociSeries(10);
    }

    /*
     * Java method to check if an integer number is prime or not.
     * @return true if number is prime, else false
     */
    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

    /**
     * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
     * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
     */
    public void FibbnociSeries(int number) {
        System.out.println("Fibonacci series upto " + number + " numbers : ");
        int fibo1 = 1, fibo2 = 1, nextFib;
        System.out.print(1 + " " + 1 + " ");
        for (int i = 3; i <= number; i++) {
            nextFib = fibo1 + fibo2;
            System.out.print(nextFib + " ");
            fibo1 = fibo2;
            fibo2 = nextFib;
        }
    }

}
