package com.example.demo;

// https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;

public class MathematicalFunctions {
    String givenInput = "1";
    String tempVariable = "";
    ArrayList<Integer> storeNumbers = new ArrayList<>();

    @Given("A .+ (.+)")
    public void GetInput(String input) {
        givenInput = input;
    }

    /*
     * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
     * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
     */
    @When("I generate a fibbnoic serices for given number")
    public void iGenerateAFibbnoicSericesForGivenNumber() {
        storeNumbers.clear();
        int fibo1 = 1, fibo2 = 1, nextFib;
        storeNumbers.add(1);
        storeNumbers.add(1);
        for (int i = 3; i <= Integer.parseInt(givenInput); i++) {
            nextFib = fibo1 + fibo2;
            storeNumbers.add(nextFib);
            fibo1 = fibo2;
            fibo2 = nextFib;
        }
    }

    @Then("I will print the Generated (.+) series on log.")
    public void iWillPrintTheGeneratedSeriesOnLog(String s) {
        System.out.println("Printing " + s + " Series Upto " + givenInput + " Numbers");
        for (Integer i : storeNumbers) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    /*
     * Java method to check if an integer number is prime or not.
     * @return true if number is prime, else false
     */
    public boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

    @When("I generate a prime numbers upto the given number")
    public void iGenerateAPrimeNumbersUptoTheGivenNumber() {
        storeNumbers.clear();
        for (int i = 2; i <= Integer.parseInt(givenInput); i++) {
            if (isPrime(i)) {
                storeNumbers.add(i);
            }
    }
    }

    @When("I Reverse the given Input string")
    public void iReverseTheGivenInputString() {
        for (int i = givenInput.length() - 1; i >= 0; i--) {
            tempVariable = tempVariable + givenInput.charAt(i);
        }
    }

    @Then("the Given input string and Reverse string are same.")
    public void theGivenInputStringAndReverseStringAreSame() {

    }
}
