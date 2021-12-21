Feature:




  Background:
    Given The user wants to go toy page




  Scenario:Verify that toy header is as expecting
    Then The user wants to verify toy head as "Mother Elephant With Babies Soft Toy"


  Scenario: Verify The toy price is expected as "20$"
    Then The user wants to verify the toy price


  Scenario: Verify the url contains "payment-gateway"
    Then The user wants to verify the url contains "payment-gateway"


  Scenario: Verify the purchase of "5" amount toy
    Then The user set the quantity as "5"
    And The user wants click BuyNow button
    Then The user wants verify correct amount as "100$"
    And The user wants to put credit card info as
    |cardNumber|1234567891011121|
    |expirationMonth|10         |
    |expirationYear |2022       |
    |CVVNumber      |343        |
    Then The user wants click payButton
    And The user wants verify purchase success as "Payment successfull!"

    Scenario Outline:Verify the purchase of different quantity

      Then The user set the quantity as "<quantity>"
      And The user wants click BuyNow button
      Then The user wants verify correct amount as "100$"
      And The user wants to put credit card info as
        |cardNumber|1234567891011121|
        |expirationMonth|10         |
        |expirationYear |2022       |
        |CVVNumber      |343        |
      Then The user wants click payButton
      And The user wants verify purchase success as "Payment successfull!"
      Examples:
        |quantity|
        |   5    |
        |   7    |
        |   3    |
        |   2    |
















