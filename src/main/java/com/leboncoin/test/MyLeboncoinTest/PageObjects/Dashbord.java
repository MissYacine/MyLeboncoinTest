package com.leboncoin.test.MyLeboncoinTest.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashbord {
	
	public static WebElement element = null;
	private static final By byWelcome = By.xpath(".//*[@id='account_login']/div[1]/span");
	private static final By byLogout = By.xpath(".//*[@id='account_logout']/a");
	
	 public static WebElement getMenu_Welcome(WebDriver driver) throws NoSuchElementException{
		 waitForClickable(driver,byWelcome,40);
		  element = driver.findElement(byWelcome);
		  return element;
		  }
		  public static WebElement menu_LogOut(WebDriver driver) throws NoSuchElementException{
		  element = driver.findElement(byLogout);
		  return element;

}

protected static void waitForClickable( WebDriver driver,
		By bywelcome2, int duration) {
	for (int x = 0; x <= 5; x++) {
		try {
			new WebDriverWait(driver, duration).until(ExpectedConditions
					.elementToBeClickable(bywelcome2));
			break;
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
	}
}
}