$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Mynew.project.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook smoke test",
  "description": "",
  "id": "facebook-smoke-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "verify the facebook credentials with valid input",
  "description": "",
  "id": "facebook-smoke-test;verify-the-facebook-credentials-with-valid-input",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open firefox and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify and take screen shot of the application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "verify the facebook credentials with valid input",
  "description": "",
  "id": "facebook-smoke-test;verify-the-facebook-credentials-with-valid-input",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "open firefox and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "The user enter invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "verify and take screen shot of the application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});