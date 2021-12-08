package com.HRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.HRM.Pages.LoginPage;
import com.HRM.Testbase.TestBase;

public class LaunchBrowser extends TestBase {
LoginPage oo;
String title;
public LaunchBrowser()
{
	super();
}
@BeforeSuite	
public void Launch()
{
	initialization();
	oo=new LoginPage();
}
@Test
public void Checktitle()
{
	title=oo.VerifyTitle();
	Assert.assertEquals(title, "OrangeHRM");
}
@Test
public void Login()
{
	oo.checklogin();
}
}
