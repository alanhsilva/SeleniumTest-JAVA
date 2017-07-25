package pageObjects;

import org.openqa.selenium.WebDriver;

import gissOnline.Main;
import utility.Repositorio;

public class FecharNavegador {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void fecharNavegador() {
		driver = varRepo.driver;
		driver.quit();
	}
	
}
