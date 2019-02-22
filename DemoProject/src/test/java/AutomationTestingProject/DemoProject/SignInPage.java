package AutomationTestingProject.DemoProject;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SignInPage {
	
	//WebDriver driver;
  @BeforeSuite
  
  void  preRequest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushm\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  //WebDriver driver = new ChromeDriver();
  }
	
	
  @Test
  public void f() {
  }
}
