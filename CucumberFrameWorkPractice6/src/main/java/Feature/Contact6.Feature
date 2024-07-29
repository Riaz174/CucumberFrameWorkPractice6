Feature: Join Us Form
@tag1
  Scenario Outline: Verify if the user clicks the contact link,the Join us form displays and confirm the message when the user clicks the register button after entering the valid data
    Given Already opened the site protrainingtech.com
    When User clicks the contact link
    Then User able to see Join us form
    When User enters the value of first name "<First Name>"
    And User enters the value of last name "<Last Name>"
    And User enters the value of email "<Email>"
    And User enters the phone "<Phone>"
    And User clicks the register button
    Then User able to see confirmation message

    Examples: 
      | First Name | Last Name | Email                     | Phone     |
      | Nadeem     | Shahbaz   | protrainingtech@gmail.com | 703544786 |

  