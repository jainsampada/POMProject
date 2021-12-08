package com.HRM.Testbase;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static Properties prop;
public static WebDriver driver;
public TestBase() 
{
	try {
		FileInputStream ip=new FileInputStream("E:\\Sampada\\Java_code\\com.HRMDemo\\src\\test\\java\\com\\OrangHRM\\configuration\\config.properties");
		
		prop=new Properties();
		
		prop.load(ip);
	}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	public void initialization()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
}

