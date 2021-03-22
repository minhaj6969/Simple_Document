@GoogleUrl
Feature: Google feature in test

Scenario: I search google successfully with valid url
  Given I am on the home page
  When I click on back arrow
  And  I click on forward arrow
  And I click on refresh arrow
  And I enter text on search box
  And I click on google search
  And I click on images
  Then I successfully get the page
  
   
