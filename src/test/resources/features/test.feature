@smoke
Feature: Viewing Documentation

  Scenario: Validate the RCB team has 4 foreign players
    Given I am an user
    When I verify RCB team for 4 foreign players
    Then I validate 4 foreign players are available

  Scenario: Validate the RCB team has at least 1 Wicket Keeper
    Given I am an user
    When I verify RCB team for at least 1 wicket keeper
    Then I validate wicket keeper is available