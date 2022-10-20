@SelectHotel
Feature: Verifying Adaction Select Hotel details

  Scenario Outline: Verifying Adaction Select Hotel with valid credential
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"
    When user should perform search hotel"<location>","<hotels>","<room type>","<number of rooms>","<check in date>","<check out date>","<adults per room>"and"<children per room>"
    Then User should be verify after search hotel "Select Hotel"
    And User should select hotel
    Then User should verify after select hotel "Book A Hotel"

    Examples: 
      | Username  | Password  | location | hotels      | room type | number of rooms | check in date | check in out | adults per room | children per room |
      | ajith1212 | ajith1212 | Sydney   | Hotel Creek | Double    | 2 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         | 1 - None          |

  Scenario Outline: Verifying Adaction select hotel without continue
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"
    When user should perform search hotel"<location>","<hotels>","<room type>","<number of rooms>","<check in date>","<check out date>","<adults per room>"and"<children per room>"
    Then User should be verify after search hotel "Select Hotel"
    And User should click continue without select the any hotel
    Then User should  click continue without select any hotel error message contains "Please Select a Hotel"

    Examples: 
      | Username  | Password  | location | hotels      | room type | number of rooms | check in date | check in out | adults per room | children per room |
      | ajith1212 | ajith1212 | Sydney   | Hotel Creek | Double    | 2 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         | 1 - None          |
