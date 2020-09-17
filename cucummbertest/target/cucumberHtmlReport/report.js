$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/VerifyLogoTest.feature");
formatter.feature({
  "line": 2,
  "name": "google search test",
  "description": "",
  "id": "google-search-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify logo on JP Morgan homepage",
  "description": "",
  "id": "google-search-test;verify-logo-on-jp-morgan-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@verifyLogo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to google webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I see google homepage using \"\u003cwebsite\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I search for keyword using \"\u003ckeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select search result",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify JP Mogan logo on home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "google-search-test;verify-logo-on-jp-morgan-homepage;",
  "rows": [
    {
      "cells": [
        "website",
        "keyword"
      ],
      "line": 13,
      "id": "google-search-test;verify-logo-on-jp-morgan-homepage;;1"
    },
    {
      "cells": [
        "Google",
        "J.P. Morgan"
      ],
      "line": 14,
      "id": "google-search-test;verify-logo-on-jp-morgan-homepage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "verify logo on JP Morgan homepage",
  "description": "",
  "id": "google-search-test;verify-logo-on-jp-morgan-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@verifyLogo"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to google webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I see google homepage using \"Google\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I search for keyword using \"J.P. Morgan\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select search result",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify JP Mogan logo on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStepDef.i_navigate_to_webpage_using()"
});
formatter.result({
  "duration": 8223601100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 29
    }
  ],
  "location": "GoogleStepDef.i_see_homepage_using(String)"
});
formatter.result({
  "duration": 13832000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P. Morgan",
      "offset": 28
    }
  ],
  "location": "GoogleStepDef.i_search_for_keyword_using(String)"
});
formatter.result({
  "duration": 2333446400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDef.i_select_result()"
});
formatter.result({
  "duration": 4036012200,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDef.i_verify_the_logo_on_home_page()"
});
formatter.result({
  "duration": 100652000,
  "status": "passed"
});
});