package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class dataTableStepDef {

	@Given("^Read the table data$")
	public void read_the_table_data(DataTable dataTable) {
	    List<List<String>> userData = dataTable.asLists();
	    for(int i=0; i<userData.size();i++)
	    {
	    	System.out.println(userData.get(i).get(0));
	    	System.out.println(userData.get(i).get(1));
	    	System.out.println(userData.get(i).get(2));
	    }
	}

	@Then("^Move forward$")
	public void move_forward() {
	    System.out.println("Moved forward in the code");
	}

	@Then("^Close the code$")
	public void close_the_code() {
	    System.out.println("Close the code which was executed");
	}

}
