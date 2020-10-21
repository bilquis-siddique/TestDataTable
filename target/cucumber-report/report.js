$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:feature/loginDatatableMap.feature");
formatter.feature({
  "name": "Login with Data Table",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Firefox browser",
  "keyword": "Given "
});
formatter.match({
  "location": "loginWithDatatable.user_Launch_Firefox_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginWithDatatable.user_Opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters username and password then clicks submit and logout",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "loginWithDatatable.user_Enters_username_and_password_then_clicks_submit_and_logout(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginWithDatatable.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});