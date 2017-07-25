package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gissOnline.Main;
import utility.Repositorio;

public class EsperaExistir {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void esperaExistir(String varxPath, String varText) {
		this.driver = varRepo.driver;
		WebDriverWait delay = new WebDriverWait(driver, 10);
		WebElement varElemento = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPath)));
		varElemento = driver.findElement(By.xpath(varxPath));
		assertTrue(varElemento.getAttribute("innerText").equals(varText));
	}
	
}
