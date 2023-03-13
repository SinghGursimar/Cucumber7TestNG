package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

/*
 * Hooks class should be in the  same folder as steps
 * @before, @after will execute before and after every scenario
 * We can have multiple  @before and after
 * @Before(order = 0) proder for before starts from 0,1
 * order for after starts from 1,0
 * we can also provide tagging to hooks
 * @Before("@Staging") the tag should be same as that in scenario and feature
 */
public class Hooks {
	
	@Before
	public void setup()
	{
	  System.out.println("@Before hook - Launch Browser");	
	}
	
	@After
	public void after()
	{
		System.out.println("@After hook - close Browser");	
	}
	
	@BeforeAll
	public static void before__all()
	{
		System.out.println("@Before All hook - Open DB Connection");	
	}
	
	@AfterAll
	public static void after_all()
	{
		System.out.println("@After All hook - close db connection");	
	}

	@BeforeStep
	public void before_step()
	{
		//System.out.println("@before step - adding log");
	}
	
	@AfterStep
	public void after_step()
	{
		//System.out.println("@after step - removing log");
	}
}
