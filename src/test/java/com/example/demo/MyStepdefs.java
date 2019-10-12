package com.example.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Hooks.class)
public class MyStepdefs {
    @Autowired
    MathematicalFunctions mathematicalFunctions;
    String givenInput = "1";
    String tempVariable = "";
    ArrayList<Integer> storeNumbers = new ArrayList<>();

    @When("I generate a (.+) numbers upto the given number")
    public void iGenerateANumbersUptoTheGivenNumber(String type) {
        storeNumbers.clear();
        for (int i = 2; i <= Integer.parseInt(givenInput); i++) {
            boolean validnumber = false;
            switch (type) {
                case "prime":
                    validnumber = mathematicalFunctions.isPrime(i);
                    break;
                case "ArmStrong":
                    validnumber = mathematicalFunctions.isArmStrong(i);
                    break;
            }
            if (validnumber) {
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
        assertEquals(
                "Given String \""
                        + givenInput
                        + "\" and reverse string \""
                        + tempVariable
                        + "\" are not equal",
                givenInput.toUpperCase(),
                tempVariable.toUpperCase());
    }

    @Given("A .+ (.+)")
    public void GetInput(String input) {
        try { // if user provider integer starts with 0, then this eliminates these 0's
            Integer i = Integer.parseInt(input);
            givenInput = i.toString();
        } catch (Exception e) {
            givenInput = input;
        }
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
}
