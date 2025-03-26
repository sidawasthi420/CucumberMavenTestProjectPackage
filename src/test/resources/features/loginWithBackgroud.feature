Feature: Login Feature
  Login functionality testing for nutrienagsolutions

  Background:
    Given Open the "chrome" browser
    When User navigates to the url "https://nutrienagsolutions.com/"
    
  @Regression
  Scenario: Successful navigation to Products page
    Then Navigate to product page
 
  @Regression1
  Scenario: Successful navigation to Services page
    Then Navigate to services page