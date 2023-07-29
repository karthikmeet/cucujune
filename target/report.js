$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/junelogin1.feature");
formatter.feature({
  "name": "June FB login Second",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "    June FB Background Second",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "using given in background",
  "keyword": "Given "
});
formatter.match({
  "location": "JuneFbBackground.using_given_in_background()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "using when in background",
  "keyword": "When "
});
formatter.match({
  "location": "JuneFbBackground.using_when_in_background()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "using then in background",
  "keyword": "Then "
});
formatter.match({
  "location": "JuneFbBackground.using_then_in_background()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "June FB Five",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open facebook and launch",
  "keyword": "Given "
});
formatter.match({
  "location": "JuneFbStepdef.open_facebook_and_launch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "JuneFbStepdef.enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "JuneFbStepdef.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});