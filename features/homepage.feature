Feature: Home page validation

  Scenario: Check home page of webdriver.io
    Given Home page with url "http://webdriver.io/"
    When home page loaded
    Then check all the tabs
