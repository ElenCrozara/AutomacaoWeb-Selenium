package automacaoWeb;

import automacaoWeb.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste() {
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void acessaSite() {
        assertEquals("Porque Tempo É Conhecimento.", getTitulo());
    }
    private String getTitulo() {
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }

    @Test
    public void validaPaginaDeCursos() {
        clickBotao();
        assertEquals("Conheça todos os nossos cursos.", getTitulo2());

    }
    private String getTitulo2() {
        String xpathTitulo = "//section[4]/div/div/div/div[1]/div//div";

        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }
    private void clickBotao() {
        String buttonCursos = "//body/div/div/div/div/div/section[2]//a";

        WebElement btnPage = driver.findElement(By.xpath(buttonCursos));
        btnPage.click();
    }

    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
