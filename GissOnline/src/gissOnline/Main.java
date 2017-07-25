package gissOnline;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.StartBrowser;
import pageObjects.VerificaStatusCheckbox;
import pageObjects.VerificarConteudoTabela;
import pageObjects.VerificarQtdElementosTabela;
import utility.Repositorio;
import utility.TratarValores;
import pageObjects.ClicarBotaoxPath;
import pageObjects.ClickIconeMenu;
import pageObjects.ColunasTabela;
import pageObjects.FecharNavegador;
import pageObjects.InserirValorID;
import pageObjects.EsperaExistir;
import pageObjects.InserirValorxPath;
import pageObjects.ProcuraElementosID;
import pageObjects.ProcuraElementosxPath;
import pageObjects.SelectDropdown;
import pageObjects.PrintScreenObj;
import pageObjects.ComparaValores;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import java.text.SimpleDateFormat;
import java.sql.Date;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Listeners(gissOnlineReportTest.class)
public class Main {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void startUP ()throws Exception
	{
		
		Repositorio varRepositorio = new Repositorio();
		StartBrowser varStart = new StartBrowser();
		ProcuraElementosID varProcuraElementosID = new ProcuraElementosID();
		InserirValorID varInserirValorID = new InserirValorID();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		
		
		varStart.startUP(
				varRepositorio.varDriverNav, 
				varRepositorio.varCaminhoDriver, 
				varRepositorio.varCaminhoExeNav, 
				varRepositorio.varURLDomain);

		varProcuraElementosID.procuraElementosID(varRepositorio.varEmailLogin, "");
		varProcuraElementosID.procuraElementosID(varRepositorio.varSenhaLogin, "");
		varInserirValorID.inserirValorID(varRepositorio.varEmailLogin, "TEST");
		varInserirValorID.inserirValorID(varRepositorio.varSenhaLogin, "TEST2");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoSeguinte);
		varEsperaExistir.esperaExistir(
				varRepositorio.varMsgBoasVindas, 
				"Bem vindo a Giss Online, veja abaixo algumas prioridades, notificações e pendências");
	}
	
	@Test
	public void test1_menuAcess() {
		Repositorio varRepositorio = new Repositorio();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Gestão");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Configuração");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Monitoração");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Integração");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Operação");
		
	}
	
	@Test
	public void test2_validaConteudoMenu() throws Exception {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varRepositorio.setLabel("Tomador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Tomador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Tomador");
		varRepositorio.setLabel("RPS");
        varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "RPS");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Recibo Provisório");
		varRepositorio.setLabel("Abatimento");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Abatimento");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Abatimento");
		varRepositorio.setLabel("Conta Corrente");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Conta Corrente");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Conta Corrente");
		varRepositorio.setLabel("Constituição de Crédito");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Constituição de Crédito");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Constituição de Crédito");
		varRepositorio.setLabel("Procurador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Procurador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Procurador");
		varRepositorio.setLabel("Clientes e Fornecedores");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Clientes e Fornecedores");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Lista dos seus clientes e fornecedores cadastrados");
		varRepositorio.setLabel("Construção Civil / Obra");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Construção Civil");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Construção Civil");
		varRepositorio.setLabel("Denúncia");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Denúncia");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Sua Lista de Denuncias");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Gestão");
		varRepositorio.setLabel("Gestão");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Gestão");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Configuração");
		varRepositorio.setLabel("Regra de Tributação");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Regra de Tributação");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Regra Tributação");
		varRepositorio.setLabel("Cliente");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Cliente");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Cliente");
		varRepositorio.setLabel("Serviço / Atividade");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Serviço / Atividade");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Serviço / Atividade");	
		varRepositorio.setLabel("Declaração / Fiscal");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Declaração");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Declaração");
		varRepositorio.setLabel("Conta Corrente");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Conta Corrente");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Conta Corrente");
		
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Monitoração");
		varRepositorio.setLabel("Monitoração");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Monitoração");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Integração");
		varRepositorio.setLabel("Empresa");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Empresa");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Empresa");
		varRepositorio.setLabel("Serviço / Atividade");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Serviço / Atividade");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Serviço / Atividade");
	}
	
	@Test
	public void test3_validaConteudoPrestadorEmitirNota() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		ComparaValores varComparaValores = new ComparaValores();
		
		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		//Tela 1
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Emitir NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varDadosTomador, "Busque abaixo os dados do tomador ou clique aqui para cadastra-lo manualmente");
		varEsperaExistir.esperaExistir(varRepositorio.varDadosTomadorLabel, "Pesquisar dados por");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varDadosTomadorInput, "43.819.978/0001-92");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varDadosTomadorBotaoPesquisar);
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoProximo);
		
		//Tela 2
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para emitir nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varCompetenciaLabel, "Competência");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varCompetenciaInput, formatador.format(data));
		varEsperaExistir.esperaExistir(varRepositorio.varLocalPrestacaoLabel, "Local de Prestação");
 		varRepositorio.setLabel("Tributação no Município");
 		varSelectDropdown.selectDropdown(varRepositorio.varLocalPrestacaoOpcao);
 		varRepositorio.setLabel("São Paulo");
 		varEsperaExistir.esperaExistir(varRepositorio.varEstadoLabel, "Estado");
 		varSelectDropdown.selectDropdown(varRepositorio.varEstadoOpcao);
 		varRepositorio.setLabel("São Paulo");
 		varEsperaExistir.esperaExistir(varRepositorio.varCidadeLabel, "Cidade");
 		varSelectDropdown.selectDropdown(varRepositorio.varCidadeOpcao);
 		varRepositorio.setLabel("7.02/439919901");
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoServicoLabel, "Código do serviço/Atividade");
 		varSelectDropdown.selectDropdown(varRepositorio.varCodigoServicoOpcao);
 		varEsperaExistir.esperaExistir(varRepositorio.varAliquotaLabel, "Aliquota(%)");
 		varInserirValorxPath.inserirValorxPath(varRepositorio.varAliquotaInput, "0,5%");
 		varEsperaExistir.esperaExistir(varRepositorio.varDescricaoLabel, "Descrição");
 		varInserirValorxPath.inserirValorxPath(varRepositorio.varDescricaoInput, "Tomador de serviço");
 		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varConstrucaoCivilButton);
 		varEsperaExistir.esperaExistir(varRepositorio.varListaObrasCadastradas, "Lista de Obras Cadastradas");
 		varRepositorio.setLabel("Obra Principal");
 		varSelectDropdown.selectDropdown(varRepositorio.varListaObrasCadastradasSelect);
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoART, "Código A.R.T"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoARTInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoObra, "Código Obra"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoObraInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varServicosPrestados, "Serviços Prestados"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varServicosPrestadosInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varDeducoes, "Deduções"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varDeducoesInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varDescIncondicionados, "Desc. Incondicionados"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varDescIncondicionadosInput, "");
 		
 		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoProximo);
 		
 		//Tela 3
 		varEsperaExistir.esperaExistir(varRepositorio.varTotalizadorLabel, "Totalizador");
 		varEsperaExistir.esperaExistir(varRepositorio.varBaseDeCalculo, "Base de Calculo:");
 		varComparaValores.comparaValores(varRepositorio.varBaseDeCalculoValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorLiquidoNota, "Valor Líquido da Nota:");
 		varComparaValores.comparaValores(varRepositorio.varBaseDeCalculoValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorDoISS, "Valor do ISS:");
 		varComparaValores.comparaValores(varRepositorio.varValorDoISSValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varIdentificacaoLabel, "Identificação do Tomador de Serviço.");
 		varEsperaExistir.esperaExistir(varRepositorio.varTomadorLabel, "Tomador :");
 		varEsperaExistir.esperaExistir(varRepositorio.varTomadorValor, "Tomador : Pessoa Física");
 		varEsperaExistir.esperaExistir(varRepositorio.varCNPJLabel, "CNPJ :");
 		varEsperaExistir.esperaExistir(varRepositorio.varCNPJValor, "CNPJ :");
 		varEsperaExistir.esperaExistir(varRepositorio.varIMLabel, "IM :");
 		varEsperaExistir.esperaExistir(varRepositorio.varIMValor, "IM :");
 		varEsperaExistir.esperaExistir(varRepositorio.varRazaoSocialLabel, "Razão social :");
 		varEsperaExistir.esperaExistir(varRepositorio.varRazaoSocialValor, "Razão social :");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicos, "Dados do Serviço.");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicosCompetenciaLabel, "Competência :");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicosCompetenciaValor, "Competência : 29/03/2017");
 		varEsperaExistir.esperaExistir(varRepositorio.varLocalPrestacaoServicoLabel, "Local de Pretação de Serviço (Cidade/Estado) :");
 		varEsperaExistir.esperaExistir(varRepositorio.varLocalPrestacaoServicoValor, "Local de Pretação de Serviço (Cidade/Estado) : SAO PAULO / SP");
 		varEsperaExistir.esperaExistir(varRepositorio.varNaturezaOperacaoLabel, "Natureza de Operação :");
 		varEsperaExistir.esperaExistir(varRepositorio.varNaturezaOperacaoValor, "Natureza de Operação : Tributação no município");
 		varEsperaExistir.esperaExistir(varRepositorio.varServicoAtividadeLabel, "Serviço/Atividade : ");
 		varEsperaExistir.esperaExistir(varRepositorio.varServicoAtividadeValor, "Serviço/Atividade : 7.02/439919901");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicosAliquotaLabel, "Aliquota(%) :");
 		varComparaValores.comparaValores(varRepositorio.varDadosServicosAliquotaValor, "4,26");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorServicosPrestadosLabel, "Valor Serviços Prestados");
 		varComparaValores.comparaValores(varRepositorio.varValorServicosPrestadosValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorDeducoesLabel, "Valor Deduções :");
 		varComparaValores.comparaValores(varRepositorio.varValorDeducoesValor, "0,00");
 		varEsperaExistir.esperaExistir(varRepositorio.varISSRetidoLabel, "ISS Retido :");
 		varEsperaExistir.esperaExistir(varRepositorio.varISSRetidoValor, "ISS Retido : não");
 		varEsperaExistir.esperaExistir(varRepositorio.varVIISSRetidoLabel, "Vl ISS Retido : R$ 0,00");
 		varComparaValores.comparaValores(varRepositorio.varVIISSRetidoValor, "0,00");
 		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoEmitirNota);
 		
	}
	

	@Test
	public void test4_validaConteudoPrestadorConsultarNotaIntervalodeNotas() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Consultar NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para consultar uma nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varBuscarPorLabel, "Buscar por");
		varRepositorio.setLabel("Intervalo de Notas");
		varSelectDropdown.selectDropdown(varRepositorio.varBuscarPorSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varInicioIntervaloLabel, "Inicio do Intervalo");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varInicioIntervaloInput, "01");
		varEsperaExistir.esperaExistir(varRepositorio.varFimIntervaloLabel, "Fim do Intervalo");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varFimIntervaloInput, "30");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBuscarButton);
		
		varEsperaExistir.esperaExistir(varRepositorio.varPesquisarLabel, "Pesquisar");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varPesquisarInput, "8990");
		varEsperaExistir.esperaExistir(varRepositorio.varExibirLabel, "Exibir");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varExibirInput, "5");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Número NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Base Cálculo");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Imposto");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Crédito");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Valor Total da NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Motivo do Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Ações");
		varVerificarQtdElementosTabela.verificarQtdElementosTabela(varRepositorio.varTableNumberElements, "1");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Número NFS-e", 
				"8990",
				"8990");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"10/04/2017");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"100,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"5,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"0,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"105,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"Valor Indevido	");
		
		
	}
	
	@Test
	public void test5_validaConteudoPrestadorConsultarNotaPeriodo() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Consultar NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para consultar uma nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varBuscarPorLabel, "Buscar por");
		varRepositorio.setLabel("Período");
		varSelectDropdown.selectDropdown(varRepositorio.varBuscarPorSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varInicioPeriodoLabel, "Inicio do período");
		varEsperaExistir.esperaExistir(varRepositorio.varFimPeriodoLabel, "Fim do período");
	
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBuscarButton);
		
		varEsperaExistir.esperaExistir(varRepositorio.varPesquisarLabel, "Pesquisar");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varPesquisarInput, "8990");
		varEsperaExistir.esperaExistir(varRepositorio.varExibirLabel, "Exibir");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varExibirInput, "5");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Número NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Base Cálculo");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Imposto");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Crédito");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Valor Total da NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Motivo do Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Ações");
		varVerificarQtdElementosTabela.verificarQtdElementosTabela(varRepositorio.varTableNumberElements, "1");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Número NFS-e", 
				"8990",
				"8990");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"10/04/2017");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"100,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"5,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"0,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"105,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"Valor Indevido	");
	}
	
	/*@Test
	public void test6_validaConteudoPrestadorPeriodoouIntervalo() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Consultar NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para consultar uma nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varBuscarPorLabel, "Buscar por");
		varRepositorio.setLabel("Período ou Intervalo");
		varSelectDropdown.selectDropdown(varRepositorio.varBuscarPorButton, varRepositorio.varBuscarPorSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varInicioPeriodoLabel, "Nº da NFS-e/Doc. do Tomador");
		//varInserirValorxPath.inserirValorxPath(varRepositorio.varInicioPeriodoInput, "01/01/2017");
		varEsperaExistir.esperaExistir(varRepositorio.varFimPeriodoLabel, "Fim do período");
		//varInserirValorxPath.inserirValorxPath(varRepositorio.varFimPeriodoInput, "05/05/2017");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBuscarButton);
		
		varEsperaExistir.esperaExistir(varRepositorio.varPesquisarLabel, "Pesquisar");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varPesquisarInput, "8990");
		varEsperaExistir.esperaExistir(varRepositorio.varExibirLabel, "Exibir");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varExibirInput, "5");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Número NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Base Cálculo");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Imposto");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Crédito");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Valor Total da NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Motivo do Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Ações");
		varVerificarQtdElementosTabela.verificarQtdElementosTabela(varRepositorio.varTableNumberElements, "1");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Número NFS-e", 
				"8990",
				"8990");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"10/04/2017");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"100,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"5,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"0,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"105,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"Valor Indevido	");
	}*/
	
	@Test
	public void test7_validaConteudoTomadorEmissaoNota() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		VerificaStatusCheckbox varVerificaStatusCheckbox = new VerificaStatusCheckbox();
		
		varRepositorio.setLabel("Tomador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Tomador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Tomador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Emissão de nova NFTS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para emitir nota fiscal");
		//Tela 1
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModuloLabel, "Dados prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varCPFCNPJLabel, "CPF/CNPJ");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varCPFCNPJInput, "429.331.758-94");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varCPFCNPJButton);
		//Tela 2
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoMunicipalLabel, "Inscrição Municipal: 1234567");
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoMunicipalValue, "1234567");
		varEsperaExistir.esperaExistir(varRepositorio.varNomeEmpresaLabel, "Nome: Empresa XPTO LTDA");
		varEsperaExistir.esperaExistir(varRepositorio.varNomeEmpresaValue, "Empresa XPTO LTDA");
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoEstadualLabel, "Inscrição Estadual: 43434");
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoEstadualValue, "43434");
		varEsperaExistir.esperaExistir(varRepositorio.varEnderecoLabel, "Endereço: Rua Bogaert, 107 - Vila Vermelha - Sacomã - SP - CEP: 09090-090");
		varEsperaExistir.esperaExistir(varRepositorio.varEnderecoValue, "Rua Bogaert, 107 - Vila Vermelha - Sacomã - SP - CEP: 09090-090");
		//varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varPrestadorSimplesCheckbox);
		//varVerificaStatusCheckbox.verificaStatusCheckbox(varRepositorio.varPrestadorSimplesCheckbox);
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varContinuarBotao);
		//Tela 3
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModuloLabel, "Dados prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varNomeDaEmpresaLabel, "Nome da empresa");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varNomeDaEmpresaInput, "EMPRESA TESTE");
		varEsperaExistir.esperaExistir(varRepositorio.varInfoDaEmpresaLabel, "Informações da empresa prestadora");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varInfoDaEmpresaInput, "Teste descrição");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varContinuarBotao2);
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModuloLabel, "Dados serviço");
		varEsperaExistir.esperaExistir(varRepositorio.varItemServicoAtividadeLabel, "Item Serviço/Atividade");
		varRepositorio.setLabel("14.01/952910600");
		varSelectDropdown.selectDropdown(varRepositorio.varItemServicoAtividadeSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varNumeroAtividadeLabel, "Número");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varNumeroAtividadeInput, "0149");
		varEsperaExistir.esperaExistir(varRepositorio.varValorServicoLabel, "Valor do serviço");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varValorServicoInput, "3000");
		varEsperaExistir.esperaExistir(varRepositorio.varSerieLabel, "Série");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varSerieInput, "A");
		varEsperaExistir.esperaExistir(varRepositorio.varDataServicoLabel, "Data do serviço");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varDataServicoInput, "25/07/2017");
		varEsperaExistir.esperaExistir(varRepositorio.varTipoLabel, "Tipo");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varDataServicoInput, "25/07/2017");
		
		
	}
	
	
	@AfterMethod
	public void sairNavegador() {
		FecharNavegador varFecharNavegador = new FecharNavegador();
		varFecharNavegador.fecharNavegador();
	}
	
}
