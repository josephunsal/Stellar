@regression
Feature:Stellar Inc Automation Engineer Challenge


  Background:
    When user able to open "http://www.google.com" page
    And web page should auto direct to the "https://www.google.com/" url

  @part2
  Scenario:Part2
    Then user should able to search "ducks"
    And user should able to see the total number of results along with the total search duration.

  @part3
  Scenario: Part3
    And user should able to search "ducks"
    And user clicks the "image" linktext
    Then user verifies the titles contains the word "ducks"


  @endToEnd
  Scenario: Part4
    When user able to open "http://www.google.com" page
    And web page should auto direct to the "https://www.google.com/" url
    Then user should able to search "ducks"
    And user should able to see the total number of results along with the total search duration.
    And user clicks the "image" linktext
    Then user verifies the titles contains the word "ducks"

