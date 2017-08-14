Feature: Storage

  Scenario: Give correct storage-filling
    Given the filling is 25
    When I withdraw 6
    Then the filling should be 19