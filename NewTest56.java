package MyPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest56 {
	WebDriver dr=new ChromeDriver();
  @Test
  public void f() throws Exception {
	  Thread.sleep(1000);
      
      WebElement ment = dr.findElement(By.name("username"));
      ment.click();
      ment.sendKeys("Admin");
    
      WebElement indi = dr.findElement(By.name("password"));
      indi.click();
      indi.sendKeys("admin123");
    
      WebElement ll = dr.findElement(By.xpath("//button[@type='submit']"));
      ll.click();
  }
  @BeforeTest
  public void beforeTest() {
	  
       dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       dr.manage().window().maximize();
  }

  

@AfterTest
  
	 public void afterTest() throws InterruptedException {
	        
	        Thread.sleep(5000);
	        
	    }
  }


