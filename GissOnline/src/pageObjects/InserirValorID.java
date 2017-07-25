package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import gissOnline.Main;
import utility.Repositorio;

public class InserirValorID {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void inserirValorID(String varID, String varSet){
		this.driver = varRepo.driver;
		WebElement varElemento = driver.findElement(By.id(varID));
		varElemento.sendKeys(varSet);
		assertTrue(varElemento.getAttribute("value").equals(varSet));
	}
}
