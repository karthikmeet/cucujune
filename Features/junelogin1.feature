@karthik
Feature: June FB login Second

  Background: 
    June FB Background Second

    Given using given in background
    When using when in background
    Then using then in background

  Scenario Outline: 
    June FB Five

    Given Open facebook and launch
    When Enter username as "<user>" and password as "<pwd>"
    Then Close the browser

    Examples: 
      | user      | pwd |
      | Akshaya   | aks |
      | Vijay     | vjs |
      | Narmadha  | Nma |
      | Muthumari | mmi |
