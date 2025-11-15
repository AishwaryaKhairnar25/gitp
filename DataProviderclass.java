package MyPack;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderclass {
  private static final boolean WebElement = false;

@Test(dataProvider = "dp")
  public void f(String n, String s) {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//same has thread sleep
	 
//	  List<WebElement>e0= dr.findElements(By.tagName("input"));
//	  List<WebElement>e01= dr.findElements(By.tagName("a"));
//	  System.out.println("The number of text box are:"+e0.size());
//	  for(WebElement w:e0)
//		  System.out.println(w.getText());
	  
      dr.manage().window().maximize();
	  WebElement e1= dr.findElement(By.id("username"));
     e1.click();
	  e1.sendKeys(n);
	  WebElement e2= dr.findElement(By.id("password"));
	  e2.click();
	  e2.sendKeys(s);
	 
	  WebElement e3= dr.findElement(By.id("submit"));
	  e3.click();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//same has thread sleep
		 
	  List<WebElement>we= dr.findElements(By.tagName("input"));
	//List<WebElement>e01= dr.findElements(By.tagName("a"));
	  System.out.println("The number of text box are:"+we.size());
	  for(WebElement w:we)
		  System.out.println(w.getText());
	  
//	  System.out.println("The number of text box are 2:"+e01.size());
//	  for(WebElement w:e01)
//		  System.out.println(w.getText());
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "student", "Password123" },
      new Object[] { "pqrs", "nhtu" },
    };
  }
}
