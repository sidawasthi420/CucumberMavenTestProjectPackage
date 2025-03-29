Feature: Login Feature
  Login functionality testing for nutrienagsolutions

  @Sanity @Regression
  Scenario: Successful navigation to NutrienAGSolution
    Given Open the "chrome" browser
    When User navigates to the url "https://nutrienagsolutions.com/"
    Then Nutrien Logo got displayed successfully
 
  @Regression1   
  Scenario Outline: Successful navigation to NutrienAGSolution with multiple set of values
    Given Open the "<browser>" browser
    When User navigates to the url "<url>"
    Then Nutrien Logo got displayed successfully
    And Close the browser

  Examples:
      | browser | url |
      |  chrome | https://nutrienagsolutions.com/ |
      | firefox | https://nutrienagsolutions.com/ |