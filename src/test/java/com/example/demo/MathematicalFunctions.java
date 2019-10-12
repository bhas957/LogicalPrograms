package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MathematicalFunctions {

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

  /*
   * Java method to check if an integer number is Armstrong or not.
   * @return true if number is ArmStrong, else false
   */
  public boolean isArmStrong(int i) {
    int original = i;
    int generatedArm = 0;
    for (int temp = i % 10; i > 0; i = i / 10) {
      generatedArm = generatedArm + temp * temp * temp;
    }
    return original == generatedArm;
  }
}
