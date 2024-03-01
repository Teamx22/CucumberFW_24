Feature: TalentTEK Signup Feature

  @smoke @regression @signup
  Scenario: Student logs in with valid credentials
    Given student at TalentTEK Homepage
    And student enter their valid email address
    And student enter their valid password
    When student clicks on Login button
    Then student should be successfully login