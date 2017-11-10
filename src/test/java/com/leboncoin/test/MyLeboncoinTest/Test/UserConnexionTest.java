package com.leboncoin.test.MyLeboncoinTest.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leboncoin.test.MyLeboncoinTest.Actions.ActionLogin;
import com.leboncoin.test.MyLeboncoinTest.PageObjects.Dashbord;
import com.leboncoin.test.MyLeboncoinTest.PageObjects.LoginPage;

import junit.framework.Assert;



public class UserConnexionTest 
    
{
	
	private static WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
	  driver = new FirefoxDriver();
	  // driver = new ChromeDriver();
	  }
	  @Test
	  public void sucessfullLoginTest() {
	  LoginPage.loadPage(driver);
	  ActionLogin.Login(driver, "yacine.dangou@outlook.com", "yac99ine");
	  Assert.assertTrue(Dashbord.getMenu_Welcome(driver).getText().contains("Welcome"));
	  }
	  
	  @Test
	  public void Test_Logout(){
	  ActionLogin.Logout(driver);
	  }
	  @AfterTest
	  public void afterTest() {
	  driver.quit();
	  }
    
	  
    
    
    
}
