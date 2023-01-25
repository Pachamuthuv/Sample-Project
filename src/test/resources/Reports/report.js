$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/adactin.feature");
formatter.feature({
  "name": "",
  "description": " Automating the fuctionalities of Adactin",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Tc-08: Verification of Adactin Logi               // rerun example",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user wants to open the Adactin application in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_open_the_Adactin_application_in_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to verify weather the login page apear or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_verify_weather_the_login_page_apear_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to give valid username and password using DataTable with header Two-D ,and click on the login button",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord"
      ]
    },
    {
      "cells": [
        "jocinthn",
        "123456"
      ]
    },
    {
      "cells": [
        "Andrew07",
        "UN45LL"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_give_valid_username_and_password_using_DataTable_with_header_Two_D_and_click_on_the_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to verify weather the search hotel page appear or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_verify_weather_the_search_hotel_page_appear_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Tc-09: Verification of Adactin Logi               // rerun example",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user wants to open the Adactin application in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_open_the_Adactin_application_in_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to verify weather the login page apear or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_verify_weather_the_login_page_apear_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to give valid username and password using DataTable with header Two-D ,and click on the login button",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord"
      ]
    },
    {
      "cells": [
        "jocinthn",
        "123456"
      ]
    },
    {
      "cells": [
        "Andrew07",
        "UN45LL"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_give_valid_username_and_password_using_DataTable_with_header_Two_D_and_click_on_the_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to verify weather the search hotel page appear or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StefDefenition.user_wants_to_verify_weather_the_search_hotel_page_appear_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});