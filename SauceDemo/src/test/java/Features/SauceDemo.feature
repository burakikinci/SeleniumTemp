@SauceDemo
  Feature: SauceDemo Check Test Cases

    @AllEmpty
    Scenario Outline: Empty Username & Empty Password
      Given User at home page
      When Click login button
      Then Check "<error>" message about username
      Examples:
      |error                    |
      |Username is required     |

    @EmptyPassword
    Scenario Outline: Empty Password
      Given User at home page
      When write "<username>" for username field
      When Click login button
      Then Check "<error>" message about password
      Examples:
      |username       |error                |
      |abcdefg        |Password is required |

      @EmptyUsername
      Scenario Outline: Empty Username
        Given User at home page
        When write "<password>" for password field
        When Click login button
        Then Check "<error>" message about username
        Examples:
        |password      |error                   |
        |123456        |Username is required    |


      @FalseLogin
      Scenario Outline: Correct Username & False Password
        Given User at home page
        When write Correct "<username>" for username field
        When write False "<password>" for password field
        When Click login button
        Then Check "<error>" message about don't match
        Examples:
          |username             |error                                                       |password  |
          |standard_user        |Username and password do not match any user in this service |abc1234   |

      @FalseLogin2
      Scenario Outline: False Username & Correct Password
        Given User at home page
        When write False "<username>" for username field
        When write Correct "<password>" for password field
        When Click login button
        Then Check "<error>" message about don't match
        Examples:
          |username       |error                | password            |
          |asdfg          |Password is required | secret_sauce        |

       @CorrectLogin
       Scenario Outline: Correct Username & Correct Password
         Given User at home page
         When write Correct "<username>" for username field
         When write Correct "<password>" for password field
         When Click login button
         Then Check Successful login
         Examples:
           |username              |password       |
           |standard_user         |secret_sauce   |






