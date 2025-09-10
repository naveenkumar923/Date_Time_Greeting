Feature: To test the greetings are apt for given time of the day

   Scenario Outline: User greets appropriately for given time of the day
      Given the system time is during afternoon hours
      When user makes a greeting
      Then System validates the proper greeting with "<user greeting>"
      Examples:
      |user greeting|
      |Good Morning!!|
      |Good Afternoon!!|
      |Good Evening!!|
