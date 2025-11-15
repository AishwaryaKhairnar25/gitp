package MyPack;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTestclass1 {
	@Test(priority = 2)
	  public void login() {
		  System.out.println("I am in login test case");
	  }
	  @Test(priority = 1)
	  public void reg() {
		  System.out.println("I am in reg test case");
	  }
	  @Test(priority = 3)
	  public void home() {
		  System.out.println("I am in home test case");
	  }
	  @Test(priority = 4)
	  public void logout() {
		  throw new SkipException("we are working");
		  //System.out.println("I am in logout test case");
	  }
	  
}
