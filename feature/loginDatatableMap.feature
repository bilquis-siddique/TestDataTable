Feature: Login with Data Table

Scenario: Login with Valid Credentials
Given User Launch Firefox browser
When User Opens URL "https://admin-demo.nopcommerce.com/login"
And User Enters username and password then clicks submit and logout
|       username        |   password   |
|  admin@yourstore.com  |  	  admin    |
|  admin@yourstore.com  |  	  admin    |
Then Close Browser
