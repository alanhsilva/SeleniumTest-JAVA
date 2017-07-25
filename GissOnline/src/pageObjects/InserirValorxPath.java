package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import gissOnline.Main;
import utility.Repositorio;

public class InserirValorxPath {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void inserirValorxPath(String varxPath, String varSet){
		this.driver = varRepo.driver;
		WebElement varElemento = driver.findElement(By.xpath(varxPath));
		varElemento.clear();
		varElemento.sendKeys(varSet);
		assertTrue(varElemento.getAttribute("value").equals(varSet));
	}		
}
