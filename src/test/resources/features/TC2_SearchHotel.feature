@SearchHotel
Feature: Verifying Adaction Search Hotel details

Background: 
 Given User id on the Adaction login page
 When User should perform login "<Username>"and"<Password>"
 And User shoukd verify after login "<Username>,<Password>"
  @SearchHotel1                         
  Scenario Outline: Verifying Adaction Search Hotel valid credentials                                                                                                                                                                                                                                                                                  
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"
    When user should perform search hotel"<location>","<hotels>","<room type>","<number of rooms>","<check in date>","<check out date>","<adults per room>"and"<children per room>"
    Then User should be verify after search hotel "Select Hotel"

    Examples: 
      | Username | Password  | location | hotels      | room type | number of rooms | check in date | check in out | adults per room | children per room |
      | kishordk  | kishor@DK | Sydney   | Hotel Creek | Double    | 2 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         | 1 - None          |

  Scenario Outline: Verifying Adaction Search Hotel by given mandatory fields
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"
    When user should perform search hotel"<location>","<number of rooms>","<check in date>","<check out date>"and"<adults per room>"
    Then User should be verify after search hotel "Select Hotel"

    Examples: 
      | Username | Password  | location | number of rooms | check in date | check in out | adults per room |
      | kishordk | kishor@DK | Sydney   | 2 - Two         | 03/07/2022    | 04/07/2022   | 2 - Two         |

  Scenario Outline: Verifying Adaction Search Hotel with date checking
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"
    When user should perform search hotel"<location>","<hotels>","<room type>","<number of rooms>","<check in date>","<check out date>","<adults per room>"and"<children per room>"
    Then User should be verify date checking after search hotel error message as "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | Username | Password  | location | hotels      | room type | number of rooms | check in date | check in out | adults per room | children per room |
      | kishordk | kishor@DK | Sydney   | Hotel Creek | Double    | 2 - Two         | 04/07/2022    | 03/07/2022   | 2 - Two         | 1 - None          |

  Scenario Outline: Verifying Adaction Search Hotel without entering any fields
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"
    When User should perform search hotel without entering any fields
    Then User should verify without enter any fields search hotel error message contains "Please Select a Location"

    Examples: 
      | Username | Password  |
      | kishordk | kishor@DK |
