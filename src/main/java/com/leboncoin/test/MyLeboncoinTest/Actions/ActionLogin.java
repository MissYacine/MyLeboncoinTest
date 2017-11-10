package com.leboncoin.test.MyLeboncoinTest.Actions;

import org.openqa.selenium.WebDriver;

import com.leboncoin.test.MyLeboncoinTest.PageObjects.Dashbord;
import com.leboncoin.test.MyLeboncoinTest.PageObjects.LoginPage;

public class ActionLogin {
	 public static void Login(WebDriver driver , String username, String password) {
		  LoginPage.loadPage(driver);
		  LoginPage.btn_Seconnecter(driver).click();
		  LoginPage.txtbx_UserName(driver).sendKeys(username);
		  LoginPage.txtbx_Password(driver).sendKeys(password);
		  LoginPage.btn_Login(driver).click();
		  }
		  public static void Logout(WebDriver driver){
		  Dashbord.getMenu_Welcome(driver).click();
		  Dashbord.menu_LogOut(driver).click();
		  }
		

}
