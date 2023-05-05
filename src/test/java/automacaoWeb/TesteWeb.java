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
        String xpathTitulo = "//section[2]//h4"; // foi inserido uma barra no inicio e final e deletado vários elementos até chegar nessa composição
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        assertEquals("Porque Tempo É Conhecimento.", txtTitulo.getText());
    }
    @Test
    public void validaPaginaDeCursos() {
        String buttonCursos = "//body/div/div/div/div/div/section[2]//a";
        WebElement btnPage = driver.findElement(By.xpath(buttonCursos));
        btnPage.click();


        String cssTitulo = "div.text-center > div.large-h1"; // foi montado o caminho do css com 2 divs e 2 classes
        WebElement txtTitulo = driver.findElement(By.cssSelector(cssTitulo));
        assertEquals("Conheça todos os nossos cursos.", txtTitulo.getText());


        String src = "//section[1]//img"; // nunca pegar caminhos de elementos que contenham números porque eles sempre mudam
        WebElement imgLogo = driver.findElement(By.xpath(src));
        imgLogo.isDisplayed();

    }
    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
