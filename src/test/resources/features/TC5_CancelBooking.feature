@Cancel
Feature: Verifying Adaction Cancel Booking details

  Scenario Outline: Verifying Cancel Booking with valid credentials
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"
    When user should perform search hotel"<location>","<hotels>","<room type>","<number of rooms>","<check in date>","<check out date>","<adults per room>"and"<children per room>"
    Then User should be verify after search hotel "Select Hotel"
    And User should select hotel
    Then User should verify after select hotel "Book A Hotel"
    And User Should book hotel "<First Name>","<Last Name>"and"<Billing Address>"
      | Credit Card No   | Credit Card Type | Expiry Date | Expiry Date | CVV Number |
      | 7894561237894561 | American Express | January     |        2022 |       5465 |
      | 7894578945894561 | VISA             | February    |        2022 |       7865 |
      | 7894561230894561 | Master Card      | October     |        2022 |       7465 |
      | 3216549873216549 | Other            | December    |        2022 |       5765 |
    Then User should verify after Book Hotel"Booking Confirmation"
    And User should cancel the order id
    Then user should verify the order id canceled message"The booking has been cancelled."

    Examples: 
      | Username | Password  | location | hotels      | room type | number of rooms | check in date | check in out | adults per room | children per room | firstName | lastName | address |
      | kishordk | kishor@DK | Sydney   | Hotel Creek | Double    | 2 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         | 1 - None          | kishor    | dk       | omr     |

  Scenario Outline: Verifying Cancel Booking with booked id
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello ajith12!"
    And User should cancel the existing booked order id "<order_no>"
    Then user should verify the order id canceled message"The booking has been cancelled."

    Examples: 
      | Username | Password  | order_no   |
      | kishordk | kishor@DK | 1F5J9F4973 |
