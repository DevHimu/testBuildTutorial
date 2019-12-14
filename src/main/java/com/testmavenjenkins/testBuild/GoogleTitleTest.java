package com.testmavenjenkins.testBuild;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTitleTest {

  WebDriver driver;
  @Test
  public void verifyGoogleTitle() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in");
	  System.out.println("Verify Title of Google");
	  Assert.assertEquals(driver.getTitle(),"Google","Title should Google but found "+driver.getTitle());
	  Thread.sleep(5000);
  }

  @AfterTest
  public void tearDown() {
	  
	  System.out.println("closing of  chrome driver");
	  driver.close();
  }
  

}
