package MyPack;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demopropertyclass {
  @Test
  public void f() throws IOException {
	  WebDriver d=new ChromeDriver();
	  d.manage().window().maximize();
	  Properties p=new Properties();
	  FileReader fr=new FileReader("D:\\TestNG\\TestNGProj\\src\\input.property");
	 p.load(fr);
	  d.get(p.getProperty("url"));
	  WebElement e1= d.findElement(By.id("username"));
	     e1.click();
		  e1.sendKeys(p.getProperty("username"));
		  WebElement e2= d.findElement(By.id("password"));
		  e2.click();
		  e2.sendKeys(p.getProperty("password"));
		  WebElement e3= d.findElement(By.id("submit"));
		  e3.click();
  }
}
