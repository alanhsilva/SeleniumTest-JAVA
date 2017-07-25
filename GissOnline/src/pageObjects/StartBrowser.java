package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import gissOnline.Main;
import utility.Repositorio;

public class StartBrowser {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void startUP(String varDriverNav,String varCaminhoDriver, String varCaminhoExeNav, String varURLDomain) {
		switch(varDriverNav) {
		case "webdriver.gecko.driver":
			FirefoxOptions optionsFirefox = new FirefoxOptions();
			System.setProperty(varDriverNav,varCaminhoDriver);
			driver = new FirefoxDriver(optionsFirefox);
			break;
		case "webdriver.chrome.driver":	
			ChromeOptions optionsChrome = new ChromeOptions();
			System.setProperty(varDriverNav,varCaminhoDriver);
			optionsChrome.addArguments("disable-infobars");
			driver = new ChromeDriver(optionsChrome);
			break;
		}
		
		varRepo.setDriver(this.driver);
		driver.get(varURLDomain);
		driver.manage().window().maximize();
		//this.driver = varMain.driver;
	}
	
}
