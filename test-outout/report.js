$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium Project Folder/WorkBook 4/CucumberSeleniumDemo/src/main/java/com/qa/features/ApplicationLogin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Test Login application scenarios",
  "description": "I want to use this template to login application",
  "id": "test-login-application-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 22,
      "value": "# @tag1"
    }
  ],
  "line": 23,
  "name": "Test login with invalid cerdentials",
  "description": "",
  "id": "test-login-application-scenarios;test-login-with-invalid-cerdentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Open browser Firefox and start browser",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I enter invalid \"akakkar\" and invalid \"t3stf1rst\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "On clicking \u0027Login\u0027 button, an error message \u0027Invalid Username/Password\u0027 is displayed to the user.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginApplication.open_browser_Firefox_and_start_browser()"
});
formatter.result({
  "duration": 15320132607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "akakkar",
      "offset": 17
    },
    {
      "val": "t3stf1rst",
      "offset": 39
    }
  ],
  "location": "LoginApplication.i_enter_invalid_and_invalid(String,String)"
});
formatter.result({
  "duration": 809838420,
  "status": "passed"
});
formatter.match({
  "location": "LoginApplication.on_clicking_Login_button_an_error_message_Invalid_Username_Password_is_displayed_to_the_user()"
});
formatter.result({
  "duration": 3837122349,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 28,
      "value": "# @tag2"
    }
  ],
  "line": 29,
  "name": "Test login with valid username and invalid password",
  "description": "",
  "id": "test-login-application-scenarios;test-login-with-valid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "# Given Open browser Firefox and start browser"
    }
  ],
  "line": 31,
  "name": "I enter valid \"akakkar0000\" and invalid \"123456\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "on clicking login button, an error message invalid username/password is displayed.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "akakkar0000",
      "offset": 15
    },
    {
      "val": "123456",
      "offset": 41
    }
  ],
  "location": "LoginApplication.i_enter_valid_and_invalid(String,String)"
});
formatter.result({
  "duration": 268250215,
  "status": "passed"
});
formatter.match({
  "location": "LoginApplication.on_clicking_login_button_an_error_message_invalid_username_password_is_displayed()"
});
formatter.result({
  "duration": 3033326230,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 34,
      "value": "# @tag3"
    }
  ],
  "line": 35,
  "name": "Test login with valid username and invalid password",
  "description": "",
  "id": "test-login-application-scenarios;test-login-with-valid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "# Given Open browser Firefox and start browser"
    }
  ],
  "line": 37,
  "name": "I enter invalid \"akakkar\" and valid \"t3stf1rst\"",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "on clicking login button2, an error message invalid username/password is displayed.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "akakkar",
      "offset": 17
    },
    {
      "val": "t3stf1rst",
      "offset": 37
    }
  ],
  "location": "LoginApplication.i_enter_invalid_and_valid(String,String)"
});
formatter.result({
  "duration": 273930870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "LoginApplication.on_clicking_login_button_an_error_message_invalid_username_password_is_displayed(int)"
});
formatter.result({
  "duration": 3155662272,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 40,
      "value": "# @tag4"
    }
  ],
  "line": 41,
  "name": "Test login with valid cerdentials",
  "description": "",
  "id": "test-login-application-scenarios;test-login-with-valid-cerdentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 42,
      "value": "#Given Open browser Firefox and start browser"
    }
  ],
  "line": 43,
  "name": "I enters valid \"odobbs\" and valid \"t3stf1rst\"",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "user should be able to login successfully and Home text is displayed as a header of the page.",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "verify page title and url.",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "close driver.",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "odobbs",
      "offset": 16
    },
    {
      "val": "t3stf1rst",
      "offset": 35
    }
  ],
  "location": "LoginApplication.i_enters_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 267066870,
  "status": "passed"
});
formatter.match({
  "location": "LoginApplication.user_should_be_able_to_login_successfully_and_Home_text_is_displayed_as_a_header_of_the_page()"
});
formatter.result({
  "duration": 33042327493,
  "status": "passed"
});
formatter.match({
  "location": "LoginApplication.verify_page_title_and_url()"
});
formatter.result({
  "duration": 14421704,
  "status": "passed"
});
formatter.match({
  "location": "LoginApplication.close_driver()"
});
formatter.result({
  "duration": 32602,
  "status": "passed"
});
formatter.uri("E:/Selenium Project Folder/WorkBook 4/CucumberSeleniumDemo/src/main/java/com/qa/features/AssignmentSubmission.feature");
formatter.feature({
  "line": 1,
  "name": "Submit an assignment",
  "description": "Assignment should not be submitted without attaching any file or artifact\r\nAssignment should not be submitted until submit button is clicked.\r\nIf user has attached a file or an artifact then on clicking submit button assigment should be submitted.",
  "id": "submit-an-assignment",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "# @tag5"
    }
  ],
  "line": 7,
  "name": "Check wheather assignment is displayed under \u0027Assigments\u0027 sidemenu.",
  "description": "",
  "id": "submit-an-assignment;check-wheather-assignment-is-displayed-under-\u0027assigments\u0027-sidemenu.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Open browser and login to the application.",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User clicks \u0027Courses\u0027 sidemenu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Application navigates to Courses \u003e My Courses sie menu",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks \u0027Coursework\u0027 sidemenu.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Application navigates to \u0027Assignments\u0027 side menu",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Assignment is displayed on the page and name of assignment is in link form",
  "keyword": "And "
});
formatter.match({
  "location": "AssignmentSubmission.open_browser_and_login_to_the_application()"
});
formatter.result({
  "duration": 96600,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.user_clicks_Courses_sidemenu()"
});
formatter.result({
  "duration": 226857926,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.application_navigates_to_Courses_My_Courses_sie_menu()"
});
formatter.result({
  "duration": 13816146,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.user_clicks_Coursework_sidemenu()"
});
formatter.result({
  "duration": 5165373541,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.application_navigates_to_Assignments_side_menu()"
});
formatter.result({
  "duration": 19373636,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.assignment_is_displayed_on_the_page_and_name_of_assignment_is_in_link_form()"
});
formatter.result({
  "duration": 2927797295,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "# @tag6"
    }
  ],
  "line": 16,
  "name": "Check whether user has attached an artifact within assignment",
  "description": "",
  "id": "submit-an-assignment;check-whether-user-has-attached-an-artifact-within-assignment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I am on assignment side menu",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I clicked on name of an assignment",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "application navigates and displayed assignment details page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I clicked select button corresponing to an artifact",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "An artifact form is displayed in non editable mode",
  "keyword": "Then "
});
formatter.match({
  "location": "FormArtifactSubmission.i_am_on_assignment_side_menu()"
});
formatter.result({
  "duration": 1004635,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_clicked_on_name_of_an_assignment()"
});
formatter.result({
  "duration": 513595477,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.application_navigates_and_displayed_assignment_details_page()"
});
formatter.result({
  "duration": 4900249529,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_clicked_select_button_corresponing_to_an_artifact()"
});
formatter.result({
  "duration": 14286607745,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.an_artifact_form_is_displayed_in_non_editable_mode()"
});
formatter.result({
  "duration": 659292,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "# @tag7"
    }
  ],
  "line": 24,
  "name": "Enter data in the form and save it",
  "description": "",
  "id": "submit-an-assignment;enter-data-in-the-form-and-save-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I am on the Form page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I selected date for \u0027Date\u0027 type entry",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I input value for \u0027Decimal\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select radio button for \u0027Likert\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select value from \u0027Dropdown\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I upload file for \u0027File\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select radio dutton for \u0027Radio\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "i select check box for \u0027Checkbox\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select first radio button for \u0027Rubric\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I select second radio button for \u0027Rubric\u0027 type entry",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I input text in \u0027Single Line Text\u0027 tupe entry",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I press \"Add\" button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should see \"Form saved\" and application navigates to Assignment details page.",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#When I clicked select button corresponing to a File entry"
    },
    {
      "line": 39,
      "value": "#And I upload file for \u0027File\u0027 type entry"
    }
  ],
  "line": 40,
  "name": "I submiited the assignment",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "select yes for the submission alert message",
  "keyword": "And "
});
formatter.match({
  "location": "FormArtifactSubmission.i_am_on_the_Form_page()"
});
formatter.result({
  "duration": 824719,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_selected_date_for_Date_type_entry()"
});
formatter.result({
  "duration": 33206,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_input_value_for_Decimal_type_entry()"
});
formatter.result({
  "duration": 669687011,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_select_radio_button_for_Likert_type_entry()"
});
formatter.result({
  "duration": 270871080,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_select_value_from_Dropdown_type_entry()"
});
formatter.result({
  "duration": 114712,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_upload_file_for_File_type_entry()"
});
formatter.result({
  "duration": 3498851975,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_select_radio_dutton_for_Radio_type_entry()"
});
formatter.result({
  "duration": 202870454,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_select_check_box_for_Checkbox_type_entry()"
});
formatter.result({
  "duration": 416496661,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_select_first_radio_button_for_Rubric_type_entry()"
});
formatter.result({
  "duration": 589535979,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_select_second_radio_button_for_Rubric_type_entry()"
});
formatter.result({
  "duration": 217865115,
  "status": "passed"
});
formatter.match({
  "location": "FormArtifactSubmission.i_input_text_in_Single_Line_Text_tupe_entry()"
});
formatter.result({
  "duration": 828334208,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add",
      "offset": 9
    }
  ],
  "location": "FormArtifactSubmission.i_press_button(String)"
});
formatter.result({
  "duration": 18476618993,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Form saved",
      "offset": 14
    }
  ],
  "location": "FormArtifactSubmission.i_should_see_and_application_navigates_to_Assignment_details_page(String)"
});
formatter.result({
  "duration": 5911679063,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.i_submiited_the_assignment()"
});
formatter.result({
  "duration": 7636928304,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.select_yes_for_the_submission_alert_message()"
});
formatter.result({
  "duration": 62121337,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 43,
      "value": "# @tag8"
    }
  ],
  "line": 44,
  "name": "Recall assignment",
  "description": "Given: Assignment is already submitted",
  "id": "submit-an-assignment;recall-assignment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "I selected checkbox corresponding to an assignment",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "click \u0027Recall\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "An assignment is recalled and pending flag is displayed corresponing to an assignment.",
  "keyword": "Then "
});
formatter.match({
  "location": "AssignmentSubmission.i_selected_checkbox_corresponding_to_an_assignment()"
});
formatter.result({
  "duration": 6283928316,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.click_Recall_button()"
});
formatter.result({
  "duration": 11205335554,
  "status": "passed"
});
formatter.match({
  "location": "AssignmentSubmission.an_assignment_is_recalled_and_pending_flag_is_displayed_corresponing_to_an_assignment()"
});
formatter.result({
  "duration": 930072214,
  "error_message": "com.qa.utils.TestCaseFailed: Text Not Matched, Actual text is:Pending\r\n\tat com.qa.utils.ValidationMethods.validateElementText(ValidationMethods.java:106)\r\n\tat com.qa.pages.AssignmentSubmissionPage.validatePendingFlag(AssignmentSubmissionPage.java:105)\r\n\tat com.qa.stepDefinition.AssignmentSubmission.an_assignment_is_recalled_and_pending_flag_is_displayed_corresponing_to_an_assignment(AssignmentSubmission.java:97)\r\n\tat ✽.Then An assignment is recalled and pending flag is displayed corresponing to an assignment.(E:/Selenium Project Folder/WorkBook 4/CucumberSeleniumDemo/src/main/java/com/qa/features/AssignmentSubmission.feature:48)\r\n",
  "status": "failed"
});
});