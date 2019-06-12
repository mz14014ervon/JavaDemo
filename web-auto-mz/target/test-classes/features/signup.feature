Feature: This feature is creating a new account in phptravels.net

  Scenario: Sign up new user successfully
    Given homepage is opened
    When I click on my account button
      And I click on Sign Up button in Homepage
      And I enter First Name
      And I enter Last Name
      And I enter Mobile Number
      And I enter Email
      And I enter Password
      And I enter PasswordND
      And I click on Sign Up button
    Then New account is created