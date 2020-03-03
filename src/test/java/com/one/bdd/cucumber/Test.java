package com.one.bdd.cucumber;

import java.util.List;
import java.util.logging.LoggingMXBean;

import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.TableRow;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	//public static WebDriverException driver;
	
	@Given("I launch the login page")
	public void i_launch_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Logging in");
	}

	@When("I enter username and password")
	public void i_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> credentials = dataTable.asLists();
	    System.out.println("Username : " + credentials.get(1).get(0) + " Password : " + 
		credentials.get(1).get(1));
	}

//	@When("I enter username and password")
//	public void i_enter_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


	@Then("I login with following credentials:")
	public void i_login_with_following_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




	@When("press login button")
	public void press_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pressed login button");
	}

	@Then("launch the dashboard")
	public void launch_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successful! \n");
	}

//	@Then("show error message")
//	public void show_error_message() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Login Failed! Incorrect username or password \n");
//	}
//
//	@Then("show required message")
//	public void show_required_message() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Incomplete credentials! \n");
//	}




}
