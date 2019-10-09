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

  Scenario Outline: Java program to check Whether given String is palindrome or not
    Given A  String <input>
    When I Reverse the given Input string
    Then the Given input string and Reverse string are same.

    Examples:
      | input |
      | one   |
      | Rever |
