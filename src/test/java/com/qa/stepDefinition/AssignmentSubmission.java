package com.qa.stepDefinition;


import java.io.IOException;

import com.qa.pages.AssignmentSubmissionPage;
import com.qa.utils.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AssignmentSubmission {

	@Given("^Open browser and login to the application\\.$")
	public void open_browser_and_login_to_the_application() throws TestCaseFailed {
	    
		//Log.info("Open browser and start executing login script1");	    
		//BrowserFactory.startDriver("chrome");
		//Log.info("Enter Username and Password");
		//LoginPage.enterUnamePass(username, password);
	}

	@When("^User clicks 'Courses' sidemenu$")
	public void user_clicks_Courses_sidemenu() throws TestCaseFailed {
	    
		Log.info("Click courses sidemenu.");
		AssignmentSubmissionPage.clickCoursesSidemenu();
	}

	@Then("^Application navigates to Courses > My Courses sie menu$")
	public void application_navigates_to_Courses_My_Courses_sie_menu() throws TestCaseFailed, IOException {
		Log.info("Validate page title.");
		AssignmentSubmissionPage.validatePageTitle();
	    
	}

	@When("^User clicks 'Coursework' sidemenu\\.$")
	public void user_clicks_Coursework_sidemenu() throws TestCaseFailed, InterruptedException {
		Log.info("Click coursework sidemenu.");
		AssignmentSubmissionPage.clickCourseworkSidemenu(); 
	    
	}

	@Then("^Application navigates to 'Assignments' side menu$")
	public void application_navigates_to_Assignments_side_menu() throws TestCaseFailed, IOException {
	    
		Log.info("Validate page title.");
		AssignmentSubmissionPage.validatePageTitle();
	}

	@Then("^Assignment is displayed on the page and name of assignment is in link form$")
	public void assignment_is_displayed_on_the_page_and_name_of_assignment_is_in_link_form() throws TestCaseFailed, IOException {
		Log.info("Validate assignment name.");
		AssignmentSubmissionPage.validateAssignmentLink();    
	}
	
	
	@When("^I clicked select button corresponing to a File entry$")
	public void i_clicked_select_button_corresponing_to_a_File_entry() throws TestCaseFailed {
		Log.info("upload file in file entry.");
	    
	}

	@Then("^I submiited the assignment$")
	public void i_submiited_the_assignment() throws TestCaseFailed, InterruptedException {
		Log.info("Submit Assignment");
		Thread.sleep(5000);
		AssignmentSubmissionPage.clickSubmitButton();
	}

	@And("^select yes for the submission alert message$")
	public void select_yes_for_the_submission_alert_message() throws TestCaseFailed {
		Log.info("Accept alert.");
		AssignmentSubmissionPage.acceptAlert();
	}

	@When("^I selected checkbox corresponding to an assignment$")
	public void i_selected_checkbox_corresponding_to_an_assignment() throws TestCaseFailed, InterruptedException {
		Log.info("Select checkbox corresponing to assignment.");
		Thread.sleep(5000);
		AssignmentSubmissionPage.selectCheckbox();
	}

	@When("^click 'Recall' button$")
	public void click_Recall_button() throws TestCaseFailed, InterruptedException {
		Log.info("Click recall button.");
		Thread.sleep(5000);
		AssignmentSubmissionPage.clickRecallButton();
	}

	@Then("^An assignment is recalled and pending flag is displayed corresponing to an assignment\\.$")
	public void an_assignment_is_recalled_and_pending_flag_is_displayed_corresponing_to_an_assignment() throws TestCaseFailed, IOException {
		Log.info("verify pending flag.");
		AssignmentSubmissionPage.validatePendingFlag();
	}

	
	
}
