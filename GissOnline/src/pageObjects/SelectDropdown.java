package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gissOnline.Main;
import utility.Repositorio;

public class SelectDropdown {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void selectDropdown(String varxPathSelecao) {
		this.driver = varRepo.driver;
		WebDriverWait delay = new WebDriverWait(driver, 10);
		WebElement varElemento = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPathSelecao)));
		varElemento.click();
	}
	
}
