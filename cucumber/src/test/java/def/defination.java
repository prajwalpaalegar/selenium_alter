package def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class defination {
	@Given("i enter open the browser")
	public void i_enter_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@When("enter un an pwd")
	public void enter_un_an_pwd() {
	   System.out.println("enter");
	}

	@Then("check for homepage is displayed")
	public void chrck_for_homepage_is_displayed() {
	   System.out.println("hello");
	}
	@Then("close")
	public void close() {
	    System.out.println("close");
	}

}
