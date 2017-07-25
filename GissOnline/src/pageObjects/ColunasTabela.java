package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gissOnline.Main;
import utility.Repositorio;

public class ColunasTabela {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void colunasTabela(String varxPath, String varNameColuna) {
		int cont = 1;
		boolean i =  true;
		this.driver = varRepo.driver;
		WebDriverWait delay = new WebDriverWait(driver, 10);
		WebElement varElemento; 
		
		while(i == true) {
			try {
				varElemento = driver.findElement(By.xpath(varxPath));
				assertEquals(varElemento.getAttribute("textContent"), varNameColuna);
				break;
			} catch(AssertionError ex) {
				cont++;
				varRepo.setPosicaoLimite(cont);
				varxPath = varRepo.varTableColuna;
			}
		}
		varRepo.clearVariaveis();
	}

}
