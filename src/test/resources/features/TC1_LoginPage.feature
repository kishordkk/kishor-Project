@Login
Feature: Verifying Adaction Login Hotel details

Background: 
				Given User id on the Adaction login page
			  When User should perform login "<Username>"and"<Password>"
			  

  @login1
  Scenario Outline: Verifying Adaction login with valid credential
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login "Hello kishordk!"

    Examples: 
      | Username | Password  |
      | kishordk | kishor@DK |

  Scenario Outline: Verifying Adaction login with valid credential
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>" with Enter key
    Then User should verify after login "Hello kishordk!"

    Examples: 
      | Username | Password  |
      | kishordk | kishoe@DK |

  Scenario Outline: Verifying Adaction login with invalid credential
    Given User id on the Adaction login page
    When User should perform login "<Username>"and"<Password>"
    Then User should verify after login error message contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | Username | Password  |
      | kishordk  | Kishor@Dk |
