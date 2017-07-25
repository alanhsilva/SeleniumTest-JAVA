package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gissOnline.Main;
import utility.Repositorio;

public class ClickIconeMenu {
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void clickIconeMenu(String varxPath, String varValue) {
		this.driver = varRepo.driver;
		boolean boleano = true;
		WebDriverWait delay = new WebDriverWait(driver, 10);
		int cont = 1;
		
		while(boleano == true) {
			WebElement varElemento = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPath)));
			varElemento = driver.findElement(By.xpath(varxPath));
			if (varElemento.getAttribute("innerText").equals(varValue)) {
				varElemento.click();
				break;
			} else {
				cont++;
				varRepo.setPosicao(cont);
				varxPath = varRepo.varMenuModulosConteudo;
				if(cont == 3)
					cont = 1;
			}
		}
		//Limpa as variaveis utilizadas
		varRepo.clearVariaveis();
	}
	
}
