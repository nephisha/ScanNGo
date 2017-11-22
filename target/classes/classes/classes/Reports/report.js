$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to Application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter the Scan and Go application with \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I press the login button",
  "keyword": "When "
});
formatter.step({
  "name": "I should be able to see the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "john@gmail.com",
        "123456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to Application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Scan and Go application with john@gmail.com and 123456",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iEnterTheScanAndGoApplicationWithEmailAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.iPressTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iShouldBeAbleToSeeTheHomePage()"
});
formatter.result({
  "status": "passed"
});
});