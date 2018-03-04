package com;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;
import org.sikuli.*;
import com.Test3;
import main.Base; 

public class Test4 extends Base{
	
	@Test
	public void facebookLogin() throws FindFailed{

		// Settings.OcrTextRead = true; // to switch on the Region.text() function
		//Settings.OcrTextSearch = true; // to switch on finding text with find("some text")

		// Creating Object of 'Screen' class
		//Screen is a base class provided by Sikuli. It allows us to access all the methods provided by Sikuli.
		Screen screen = new Screen();
		// Creating Object of Pattern class and specify the path of specified images
		// I have captured images of Facebook Email id field, Password field and Login button and placed in my local directory
		// Facebook user id image 
		Pattern username = new Pattern("C:\\tc\\dev\\objects\\Login.png");
		// Facebook password image
		Pattern password = new Pattern("C:\\tc\\dev\\objects\\Password.png");
		// Facebook login button image
		Pattern login = new Pattern("C:\\tc\\dev\\objects\\Submit.png");
		// Initialization of driver object to launch firefox browser 
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\tc\\dev\\drivers\\chrome\\32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		// Open Facebook
		driver.get("https://en-gb.facebook.com/");

		screen.wait(username, 10);	 
		// Calling 'type' method to enter username in the email field using 'screen' object
		screen.type(username, "softwaretestingmaterial@gmail.com");
		// Calling the same 'type' method and passing text in the password field
		screen.type(password, "softwaretestingmaterial");
		// This will click on login button
		screen.click(login);

		//ScreenImage file = screen.capture(screen.getBounds());
		//Print("Saved screen as "+file);
		//System.out.println(file);

		
		Base.screenshot();
		
		driver.close();

		/*
		String text = screen.find("C:\\tc\\dev\\objects\\Login.png").text();
		String Finaltext = text.trim();
		System.out.println(Finaltext);  */

 

	}

}