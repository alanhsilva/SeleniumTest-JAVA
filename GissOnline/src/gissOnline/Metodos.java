package gissOnline;

import org.junit.Assert.*;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.openqa.selenium.support.ui.ExpectedConditions; 


public class Metodos {
	
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
	
	
	//Buscas feita por ID
	public void procuraElementosID(String varID, String varTextoEsperado) {
		WebElement varElemento =  driver.findElement(By.id(varID));
		assertTrue(varElemento.getAttribute("innerText").equals(varTextoEsperado));
	}
	
	public void inserirValorID(String varID, String varSet){
		WebElement varElemento = driver.findElement(By.id(varID));
		varElemento.sendKeys(varSet);
		assertTrue(varElemento.getAttribute("value").equals(varSet));
	}
	
	//Buscas feita por xPath
	
	public void inserirValorxPath(String varxPath, String varSet){
		WebElement varElemento = driver.findElement(By.xpath(varxPath));
		varElemento.sendKeys(varSet);
		assertTrue(varElemento.getAttribute("value").equals(varSet));
	}
	
	public void procuraElementosxPath(String varxPath, String varTextoEsperado) {
		int cont = 1;
		boolean i =  true;
		this.driver = varRepo.driver;
		WebElement varElemento;
		
		WebDriverWait delay = new WebDriverWait(driver, 10);
		while(i == true) {
 			try {
 				varElemento = driver.findElement(By.xpath(varxPath));
 				String r = varElemento.getAttribute("textContent");
 				assertEquals(varElemento.getAttribute("textContent"), varTextoEsperado);
 				varElemento.click();
 				break;
 			} catch(AssertionError ex) {
 				cont++;
 				varRepo.setPosicaoLimite(cont);
 				varxPath = varRepo.varMenuSidebar;
 			}
 		}
		
		varRepo.clearVariaveis();
	}
	
	public void clicarBotaoxPath(String varxPath) {
		this.driver = varRepo.driver;
		WebDriverWait delay = new WebDriverWait(driver, 10);
 		WebElement varElemento = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPath)));
		varElemento = driver.findElement(By.xpath(varxPath));
		varElemento.click();
	}
	
	public void selectDropdown(String varxPathDropDown, String varxPathSelecao) {
		WebDriverWait delay = new WebDriverWait(driver, 10);
		WebElement varElemento = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPathDropDown)));
		varElemento = driver.findElement(By.xpath(varxPathDropDown));
		varElemento.click();
		varElemento = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPathSelecao)));
		varElemento.click();
	}
	
	public void esperaExistir(String varxPath, String varText) {
		WebDriverWait delay = new WebDriverWait(driver, 10);
		WebElement varElemento = delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(varxPath)));
		varElemento = driver.findElement(By.xpath(varxPath));
		String r = varElemento.getAttribute("innerText");
		assertTrue(varElemento.getAttribute("innerText").equals(varText));
	}
	
	public void clickIconeMenu(String varxPath, String varValue) {
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
	
	public void fecharNavegador() {
		driver = varRepo.driver;
		driver.quit();
	}
	
	
}
