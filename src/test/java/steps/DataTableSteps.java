package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;

public class DataTableSteps {
	
	@Then("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> data =dataTable.asLists();
	    
	    for(List<String> s : data)
	    {
	    	System.out.println("First Name :- "+s.get(0));
	    	System.out.println("Last Name :- "+s.get(1));
	    }
	}
	
	
	@Then("user enters firstname and lastname using maps")
	public void user_enters_firstname_and_lastname_using_maps(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> map = dataTable.asMaps();
	    
	    for(Map<String,String>s: map)
	    {
	    	System.out.println("First Name :- "+s.get("firstname"));
	    	System.out.println("Last Name :- "+s.get("lastname"));
	    }
	}
	
	
}
