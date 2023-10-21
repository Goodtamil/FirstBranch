@one
Feature: multiple data input

Scenario Outline: validate page with multiple data
Given launch chrome browser and open URL "http://demo.automationtesting.in/Register.html"
When user click Firstname and enter the values "<firstname>"
And user click Secondname and enter the  values "<lastname>"
And user click address and enter the values "<address>"
And user click mailid and enter the values "<mail>"
And user click phone and enter the values "<phone>"
Then user validate the page title as "Register"

Examples:
|firstname|lastname|address|mail|phone|
|tamil|selvan|erode|abc@gmail.com|123456789|
|pani|selva|salem|ccd@gmail.com|4312314|

