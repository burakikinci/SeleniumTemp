@OrangeHRM
  Feature: OrangeHRM Check Test Cases

    @AllEmpty
    Scenario: Empty Username & Empty Password
      Given User at login page
      When Click login button
      Then Check Required message about Username and Password

      @FalseLogin
      Scenario: False Username & False Password
        Given User at login page
        When Write Username and Password
        When Click login button
        Then Check Invalid credentials message about login

        @CorrectLogin
        Scenario: Correct Username & Correct Password
          Given User at login page
          When Write Correct Username and Password
          When Click login button
          Then Check Successful login

        @ChangeName
        Scenario: Change First Name and Last Name
          Given User at login page
          When Write Correct Username and Password
          When Click login button
          Then Check Successful login
          When Click to My Info button
          When Change Name and Surname
          When Click to Save Button
          Then Check New Name and Surname

