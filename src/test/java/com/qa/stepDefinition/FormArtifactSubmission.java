package com.qa.stepDefinition;


import java.io.IOException;

import com.qa.pages.AssignmentSubmissionPage;
import com.qa.pages.FormEntrySubmission;
import com.qa.utils.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormArtifactSubmission {
	@Given("^I am on assignment side menu$")
	public void i_am_on_assignment_side_menu() throws TestCaseFailed {
		Log.info("Assignment side menu displayed as open.");
	    
	}

	@When("^I clicked on name of an assignment$")
	public void i_clicked_on_name_of_an_assignment() throws TestCaseFailed {
		Log.info("Click Assignment link.");
		
		AssignmentSubmissionPage.clickAssignment();
	}

	@Then("^application navigates and displayed assignment details page$")
	public void application_navigates_and_displayed_assignment_details_page() throws TestCaseFailed, IOException {
		Log.info("Details sub tab displayed.");
		AssignmentSubmissionPage.validateDetailsPage();
	}

	@When("^I clicked select button corresponing to an artifact$")
	public void i_clicked_select_button_corresponing_to_an_artifact() throws TestCaseFailed {
		Log.info("Click select button corresponding to artifact");
		
		AssignmentSubmissionPage.clickSelectbutton();
	}

	@Then("^An artifact form is displayed in non editable mode$")
	public void an_artifact_form_is_displayed_in_non_editable_mode() throws TestCaseFailed {
		Log.info("Artifact form displayed in non editable.");
	    
	}

	@Given("^I am on the Form page$")
	public void i_am_on_the_Form_page() throws TestCaseFailed {
	    
		Log.info("Form submission page is displayed.");
	}

	@When("^I selected date for 'Date' type entry$")
	public void i_selected_date_for_Date_type_entry() throws TestCaseFailed {
	    
	    
	}

	@And("^I input value for 'Decimal' type entry$")
	public void i_input_value_for_Decimal_type_entry() throws TestCaseFailed {
		Log.info("Input decimal value.");
		FormEntrySubmission.inputDecimal();
	}

	@And("^I select radio button for 'Likert' type entry$")
	public void i_select_radio_button_for_Likert_type_entry() throws TestCaseFailed {
		Log.info("Select likert value.");
		FormEntrySubmission.selectLikert();
	}

	@And("^I select value from 'Dropdown' type entry$")
	public void i_select_value_from_Dropdown_type_entry() throws TestCaseFailed {
	    
	    
	}

	@And("^I upload file for 'File' type entry$")
	public void i_upload_file_for_File_type_entry() throws TestCaseFailed, IOException {
		Log.info("upload file.");
		FormEntrySubmission.selectFile();
		
	}

	@And("^I select radio dutton for 'Radio' type entry$")
	public void i_select_radio_dutton_for_Radio_type_entry() throws TestCaseFailed {
		Log.info("Select radio entry.");
		FormEntrySubmission.selectRadiobutton();
	}

	@And("^i select check box for 'Checkbox' type entry$")
	public void i_select_check_box_for_Checkbox_type_entry() throws TestCaseFailed {
		Log.info("Select checkbox.");
		FormEntrySubmission.selectCheckBox();
	}

	@And("^I select first radio button for 'Rubric' type entry$")
	public void i_select_first_radio_button_for_Rubric_type_entry() throws TestCaseFailed {
		Log.info("Select rubric1.");
		FormEntrySubmission.SelectRadioForRubric1();
	}

	@And("^I select second radio button for 'Rubric' type entry$")
	public void i_select_second_radio_button_for_Rubric_type_entry() throws TestCaseFailed {
		Log.info("Select rubric2.");
		FormEntrySubmission.SelectRadioForRubric2();
	}

	@And("^I input text in 'Single Line Text' tupe entry$")
	public void i_input_text_in_Single_Line_Text_tupe_entry() throws TestCaseFailed {
		Log.info("input text in single line entry.");
		FormEntrySubmission.inputTextInSingleLine();
	    
	}

	@And("^I press \"([^\"]*)\" button$")
	public void i_press_button(String arg1) throws TestCaseFailed, InterruptedException {
		Log.info("Click Add button.");
		Thread.sleep(12000);
		FormEntrySubmission.clickAdd();
	}

	@Then("^I should see \"([^\"]*)\" and application navigates to Assignment details page\\.$")
	public void i_should_see_and_application_navigates_to_Assignment_details_page(String arg1) throws TestCaseFailed, IOException {
	    
		Log.info("Application navigates to detail sub tab."); 
		AssignmentSubmissionPage.validateDetailsPage();
		
		FormEntrySubmission.clickSave();
	}

}
