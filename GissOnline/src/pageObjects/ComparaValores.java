package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.TratarValores;
import utility.Repositorio;

public class ComparaValores {
	
	WebDriver driver;
	
	public void comparaValores(String varxPath, String varValue) {
		Repositorio varRepo = new Repositorio();
		TratarValores varTratar = new TratarValores();
		
		this.driver = varRepo.driver;
		WebDriverWait delay = new WebDriverWait(driver, 10);
		
		varTratar.tratarValores(delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPath))).getAttribute("innerText"), "R$");
		assertEquals(varRepo.varValue , Double.parseDouble(varValue.replace(",", ".")));
	}

}
