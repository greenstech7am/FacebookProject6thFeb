$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Forgotten.feature");
formatter.feature({
  "name": "Validate the forgotten password functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the forgotten with invalid mobile number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Pink"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch chrome and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_launch_chrome_and_load_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "ForgottenStepDefinition.user_should_click_the_forgotten_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should input invalid mobile number in the text box",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenStepDefinition.user_should_input_invalid_mobile_number_in_the_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should print the title of my password reset page",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenStepDefinition.userShouldPrintTheTitleOfMyPasswordResetPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenStepDefinition.user_should_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to password reset page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgottenStepDefinition.user_should_navigate_to_password_reset_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});