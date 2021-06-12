$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Homework_Bank_Feature.feature");
formatter.feature({
  "line": 2,
  "name": "Test login and add new Bank and Cash",
  "description": "",
  "id": "test-login-and-add-new-bank-and-cash",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@otherFeature"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 7,
      "value": "#\tGiven The user is on the \"GoogleSearch\" login page"
    }
  ],
  "line": 10,
  "name": "1 User should be able to login with the valid credentials and add a new acct to Bank and Cash",
  "description": "",
  "id": "test-login-and-add-new-bank-and-cash;1-user-should-be-able-to-login-with-the-valid-credentials-and-add-a-new-acct-to-bank-and-cash",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@others1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The user clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The user land on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The user clicks Bank and Cash",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "The user clicks New Account",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The user land on Account page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "The user will enters \"\u003cAccount_Title\u003e\" and \"\u003cDescription\u003e\" and \"\u003cInitial_Balance\u003e\" and \"\u003cAccount_Number\u003e\" and \"\u003cContact_Person\u003e\" and \"\u003cPhone\u003e\" and \"\u003cInternet_Banking_URL\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The user clicks submit",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "The user should have made a new acct",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "test-login-and-add-new-bank-and-cash;1-user-should-be-able-to-login-with-the-valid-credentials-and-add-a-new-acct-to-bank-and-cash;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Account_Title",
        "Description",
        "Initial_Balance",
        "Account_Number",
        "Contact_Person",
        "Phone",
        "Internet_Banking_URL"
      ],
      "line": 21,
      "id": "test-login-and-add-new-bank-and-cash;1-user-should-be-able-to-login-with-the-valid-credentials-and-add-a-new-acct-to-bank-and-cash;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Tony\u0027s_Bank\u0027",
        "Checking",
        "$100000",
        "cd6545664",
        "JohnDoe",
        "(548)456-5794",
        "https://www.BOA.com"
      ],
      "line": 22,
      "id": "test-login-and-add-new-bank-and-cash;1-user-should-be-able-to-login-with-the-valid-credentials-and-add-a-new-acct-to-bank-and-cash;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1538795400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#\tGiven The user is on the Techfios login page"
    }
  ],
  "line": 6,
  "name": "The user is on the \"Techfios\" login page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Techfios",
      "offset": 20
    }
  ],
  "location": "AddNewAccountStepDef.the_user_is_on_the_login_page(String)"
});
formatter.result({
  "duration": 946899200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "1 User should be able to login with the valid credentials and add a new acct to Bank and Cash",
  "description": "",
  "id": "test-login-and-add-new-bank-and-cash;1-user-should-be-able-to-login-with-the-valid-credentials-and-add-a-new-acct-to-bank-and-cash;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@others1"
    },
    {
      "line": 1,
      "name": "@otherFeature"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The user enters \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The user clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The user land on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The user clicks Bank and Cash",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "The user clicks New Account",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The user land on Account page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "The user will enters \"Tony\u0027s_Bank\u0027\" and \"Checking\" and \"$100000\" and \"cd6545664\" and \"JohnDoe\" and \"(548)456-5794\" and \"https://www.BOA.com\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The user clicks submit",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "The user should have made a new acct",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "AddNewAccountStepDef.the_user_enters_and_as(String,String)"
});
formatter.result({
  "duration": 101184300,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountStepDef.the_user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 992301000,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountStepDef.the_user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 2004177800,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountStepDef.the_user_clicks_Bank_and_Cash()"
});
formatter.result({
  "duration": 34415200,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountStepDef.the_user_clicks_New_Account()"
});
formatter.result({
  "duration": 481692700,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountStepDef.the_user_land_on_Account_page()"
});
formatter.result({
  "duration": 2017353100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tony\u0027s_Bank\u0027",
      "offset": 22
    },
    {
      "val": "Checking",
      "offset": 41
    },
    {
      "val": "$100000",
      "offset": 56
    },
    {
      "val": "cd6545664",
      "offset": 70
    },
    {
      "val": "JohnDoe",
      "offset": 86
    },
    {
      "val": "(548)456-5794",
      "offset": 100
    },
    {
      "val": "https://www.BOA.com",
      "offset": 120
    }
  ],
  "location": "AddNewAccountStepDef.the_user_enters_and_and_and_and_and_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 282598800,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountStepDef.the_user_clicks_submit()"
});
formatter.result({
  "duration": 802785200,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountStepDef.the_acct_was_made()"
});
formatter.result({
  "duration": 2152292500,
  "status": "passed"
});
formatter.after({
  "duration": 691251700,
  "status": "passed"
});
});