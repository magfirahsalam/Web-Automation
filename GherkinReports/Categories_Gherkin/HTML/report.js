$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Categories.feature");
formatter.feature({
  "name": "Categories",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Categories"
    }
  ]
});
formatter.scenario({
  "name": "User search product available product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs1"
    }
  ]
});
formatter.step({
  "name": "user already login",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_already_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input available product name",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_input_available_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can find the available product",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_can_find_the_available_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search product unavailable product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs2"
    }
  ]
});
formatter.step({
  "name": "user has been login",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_has_been_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input unavailable product name",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_input_unavailable_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cannot find the unavailable product",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_cannot_find_the_available_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search product with blank product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs3"
    }
  ]
});
formatter.step({
  "name": "user successful login",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_successful_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user not input product name",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_not_input_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user find the aimless products",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_find_the_aimless_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search product with input space only",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs4"
    }
  ]
});
formatter.step({
  "name": "users have been login",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.users_have_been_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input product name contains space only",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_input_product_name_contains_space_only()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user find the random product",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_find_the_random_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search product with mix data types",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs5"
    }
  ]
});
formatter.step({
  "name": "user login",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input product name contains mixed data types",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_input_product_name_contains_mixed_data_types()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can not find the product",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_can_not_find_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User search product by categories",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Categories"
    },
    {
      "name": "@ctgrs6"
    }
  ]
});
formatter.step({
  "name": "user login successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "Categories.user_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose category",
  "keyword": "When "
});
formatter.match({
  "location": "Categories.user_choose_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can find the product by category",
  "keyword": "Then "
});
formatter.match({
  "location": "Categories.user_can_find_the_product_by_category()"
});
formatter.result({
  "status": "passed"
});
});