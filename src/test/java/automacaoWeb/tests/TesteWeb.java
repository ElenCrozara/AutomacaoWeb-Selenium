package automacaoWeb.tests;

import automacaoWeb.core.Driver;
import automacaoWeb.pages.CursoPage;
import automacaoWeb.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
        cursoPage = new CursoPage(driver);
    }

    @Test
    public void acessaSite() {
        assertEquals("Porque Tempo É Conhecimento.", principalPage.getTitulo());
    }

    @Test
    public void validaPaginaDeCursos() {
        principalPage.clickBotao();
        assertEquals("Conheça todos os nossos cursos.", cursoPage.getTitulo2());
    }

    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
