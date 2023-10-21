$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/BDD/featurefile/Registration.feature");
formatter.feature({
  "name": "Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register Detail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch chrome browser and open URL",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoSite.launch_chrome_browser_and_open_URL()"
});
formatter.result({
  "status": "passed"
});
});