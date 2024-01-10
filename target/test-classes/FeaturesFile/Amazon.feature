@All
Feature: Test Amazon Application

  Background: 
    Given Open Amazon Application

  @HomePage
  Scenario: Test for Homepage Title
    When User captures actual title of Homepage
    Then Title should be matched with expected Homepage title

  @BestSellers
  Scenario: Test for BestSellers page Title
    When User opens BestSellers page
    When User captures actual title of BestSellers page
    Then Title should be matched with expected BestSellers title

  @Mobiles
  Scenario: Test for Mobiles page Title
    When User opens Mobiles page
    When User captures actual title of Mobiles page
    Then Title should be matched with expected Mobiles title

  #@TodaysDeals
  @ignore
  Scenario: Test for TodaysDeals page Title
    When User opens TodaysDeals page
    When User captures actual title of TodaysDeals page
    Then Title should be matched with expected TodaysDeals title
