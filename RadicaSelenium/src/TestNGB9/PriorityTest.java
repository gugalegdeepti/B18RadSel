package TestNGB9;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PriorityTest {
	
	String userName;
	
	
	
	@Test (priority = 1)
	public void login(){
		System.out.println("I am in test 2");
	}
	
	@Test (priority = 2)
	public void createU(){
		System.out.println("I am in test 1");
		//create user
		userName= "Anil_timestamp" ;
	}
	
	
	
	@Test (priority =3)
	public void deleteU(){
		System.out.println("I am in test 2");
	}
	
	@Test (priority =4)
	public void createG(){
		System.out.println("I am in test 2");
	}
	
	@Test (priority = 5)
	public void deletegroup(){
		System.out.println("I am in test 2");
	}
	
	

}
