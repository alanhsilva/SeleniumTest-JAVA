package gissOnline;

import org.openqa.selenium.WebDriver;

public class Repositorio {

	static int varPosicaoA = 1;
	static int  varPosicaoB = 1;
	static String varLabel;
	/*Classe utilizada para armazenamento dos caminhos utilizados
	 *pelos objetos de testes das plataformas assim vinculados
	 *Separados pela forma de mapeamento para assim facilitar a 
	 *manutenção do mesmo*/
	
	//Nota: Todas as variaveis devem ser publicas

	//Parametros Globais
	public static String varDriverNav = "webdriver.gecko.driver";
	public static String varCaminhoDriver = "C:\\DriversNavegadores\\Firefox\\geckodriver.exe";
	public static String varCaminhoExeNav = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
	public static String varURLDomain = "http://nova.giss.com.br/login/"; 
	
	
	//Variaveis a serem utilizadas em tempo de execução
	public static WebDriver driver;
	
	//Mapeado por ID
	public static String varEmailLogin = "inputEmail";
	public static String varSenhaLogin = "inputPassword";
	
	
	//Mapeado por Class
	
	
	//Mapeado por Type
	
	
	/* Mapeado por xPath */
	//Login
	public static String varBotaoSeguinte = "//div[@class=\"form-group\"]/button[@type=\"submit\"]";
	
	//Home Page
	public static String varMsgBoasVindas = "//div[@class=\"col-12 mt-3\"]/span";
	public static String varMenuModulos = "//li[@class=\"nav-item dropdown\"]/a/i";
	public static String varTituloModulo = "//div[@class=\"w-100 l-padConteudo\"]//hgroup/h1";
	
	//Modulos
	public static String varModuloBotao = "//div[@class=\"ng-scope\"]/div/div[" + varPosicaoA + "]/a/div/p";
	//Operação>Prestador
	//Tela 1
	public static String varDadosTomador = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[1]/div";
	public static String varDadosTomadorLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[2]/div/label";
	public static String varDadosTomadorInput = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[2]/div/div/input";
	public static String varDadosTomadorBotaoPesquisar = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[2]/div/div/button";
	//Tela 2
	public static String varCompetenciaLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataComp\"]";
	public static String varCompetenciaInput = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/input[@id=\"dataComp\"]";
	public static String varLocalPrestacaoLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataLocal\"]";
	public static String varLocalPrestacaoBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataLocal\"]";
	public static String varLocalPrestacaoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataLocal\"]/option[@label=\""+ varLabel +"\"]";
	public static String varEstadoLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"statelUser\"]";
	public static String varEstadoBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"statelUser\"]";
	public static String varEstadoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"statelUser\"]/option[@label=\"" + varLabel + "\"]";
	public static String varCidadeLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"citylUser\"]";
	public static String varCidadeBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"citylUser\"]";
	public static String varCidadeOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"citylUser\"]/option[@label=\"" + varLabel + "\"]";
	public static String varCodigoServicoLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataCode\"]";
	public static String varCodigoServicoBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataCode\"]";
	public static String varCodigoServicoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataCode\"]/option[@label=\""+ varLabel +"\"]";
	public static String varAliquotaLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataPercent\"]";
	public static String varAliquotaInput = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/input[@id=\"dataPercent\"]";
	
	public static String varBotaoProximo = "//div[@class=\"d-flex justify-content-end align-items-end pl-3 pr-3\"]/a";
	
	//Menu
	public static String varMenuModulosOperacao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Operação\"]";
	public static String varMenuModulosIntegracao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Integração\"]";
	public static String varMenuModulosConteudo = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//div[@class=\"p-3\"]/div["+ varPosicaoB +"]/div[" + varPosicaoA + "]//span[@class=\"ng-binding\"]";
	public static String varMenuModulosConfiguracao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Configuração\"]";
	public static String varMenuModulosMonitoracao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Monitoração\"]";
	//public static String varMenuSidebarOperacao = "//li[@class=\"l-sidebar_menu_item\" and @ng-show=\"vm.eixoAtivoTitulo == 'Configuração'\"]/a/span";
	public static String varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[@class=\"l-sidebar_menu_item\"]/a[@data-original-title=\"" + varLabel + "\"]/span";
	
	//Tratamento de variaveis do proprio repositorio
	public void setPosicao(int value) {
		varPosicaoA = value;
		if (varPosicaoA == 3) {
			varPosicaoA = 1;
			varPosicaoB = 2;
		}
		
		varMenuModulosConteudo = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//div[@class=\"p-3\"]/div[" + varPosicaoB + "]/div[" + varPosicaoA + "]//span[@class=\"ng-binding\"]";
	}
	
	public void setPosicaoLimite(int value) {
		this.varPosicaoA = value;
	}
	
	public void setDriver(WebDriver value) {
		this.driver = value;
	}
	
	public void setLabel(String value) {
		this.varLabel = value;
		varLocalPrestacaoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataLocal\"]/option[@label=\""+ varLabel +"\"]";
		varEstadoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"statelUser\"]/option[@label=\"" + varLabel + "\"]";
		varCidadeOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"citylUser\"]/option[@label=\"" + varLabel + "\"]";
		varCodigoServicoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataCode\"]/option[@label=\""+ varLabel +"\"]";
		varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[@class=\"l-sidebar_menu_item\"]/a[@data-original-title=\"" + varLabel + "\"]/span";
	}
	
	//Limpa as variaveis e seta novamente as variaveis que dependem dos contadores de posição
	public void clearVariaveis() {	
		varPosicaoA = 1;
		varPosicaoB = 1;
		varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[" + varPosicaoA + "]/a/span";
		varMenuModulosConteudo = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//div[@class=\"p-3\"]/div[" + varPosicaoB + "]/div[" + varPosicaoA + "]//span[@class=\"ng-binding\"]";
		varModuloBotao = "//div[@class=\"ng-scope\"]/div/div[" + varPosicaoA + "]/a/div/p";
	}
	
}
