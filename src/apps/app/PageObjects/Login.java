package apps.app.PageObjects;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import apps.app.TestScripts.Test3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;
import org.sikuli.*;

import main.base.BasePage; 

public class Login extends BasePage{
	
	Screen screen = new Screen();
	Pattern username = new Pattern("C:\\tc\\dev\\objects\\Login.png");
	Pattern password = new Pattern("C:\\tc\\dev\\objects\\Password.png");
	Pattern login = new Pattern("C:\\tc\\dev\\objects\\Submit.png");

	public void LoginSubmit() throws FindFailed{
		screen.wait(username, 10);	 
		screen.type(username, "softwaretestingmaterial@gmail.com");
		screen.type(password, "softwaretestingmaterial");
		screen.click(login);
	}

	public void EnterUsername() {

	}
}