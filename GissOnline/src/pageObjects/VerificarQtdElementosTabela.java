package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gissOnline.Main;
import utility.Repositorio;

public class VerificarQtdElementosTabela {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void verificarQtdElementosTabela(String varxPath, String varQtdElements) {
		this.driver = varRepo.driver;
		WebDriverWait delay = new WebDriverWait(driver, 10);
		
		WebElement varElement = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPath)));
		assertEquals(varElement.getAttribute("childElementCount"), varQtdElements);
	}
	
}
