Feature: Top50JavaPrograms
#  https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html


  Scenario: Generate Fibbnoic Series
    Given A number 5
    When I generate a fibbnoic serices for given number
    Then I will print the Generated Fibbnoci series on log.

  Scenario: Generate Prime Number Series
    Given A number 15
    When I generate a prime numbers upto the given number
    Then I will print the Generated Prime series on log.

  #A Palindrome is a String which is equal to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
  Scenario Outline: Java program to check Whether given String is palindrome or not
    Given A  String <input>
    When I Reverse the given Input string
    Then the Given input string and Reverse string are same.

    Examples:
      | input |
      | one   |
      | Rever |
      | 12321 |

  #A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
  Scenario: Generate ArmStrong Series
    Given A number 154
    When I generate a ArmStrong numbers upto the given number
    Then I will print the Generated ArmStrong series on log.