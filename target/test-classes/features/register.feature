Feature: Register API

  Scenario: Successful registration
    Given I register with username "newUser1" and password "strongPass12345" and confirm_password "strongPass12345"
    Then the response code should be 10

  Scenario: Username already exists
    Given I register with username "test1" and password "strongPass123" and confirm_password "strongPass123"
    Then the response code should be 113

  Scenario: Missing parameters
    Given I register with username "" and password "strongPass123" and confirm_password "strongPass123"
    Then the response code should be 112

  Scenario: Password too short
    Given I register with username "newUser2" and password "short" and confirm_password "short"
    Then the response code should be 129

  Scenario: Confirm password does not match
    Given I register with username "newUser3" and password "strongPass123" and confirm_password "wrongConfirm"
    Then the response code should be 99

  Scenario: Password equals username
    Given I register with username "same1234" and password "same1234" and confirm_password "same1234"
    Then the response code should be 129
