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
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }
    @Test
    public void validaPaginaDeCursos() {
        String buttonCursos = "body > div > div > div > div > div > section.elementor-element.elementor-element-72fe67f.elementor-section-height-min-height.elementor-section-boxed.elementor-section-height-default.elementor-section-items-middle.elementor-section.elementor-top-section.elementor-motion-effects-element.elementor-motion-effects-element-type-background > div.elementor-container.elementor-column-gap-default > div > div > div > div > div.elementor-element.elementor-element-8e9235e.elementor-tablet-align-center.elementor-align-center.elementor-widget.elementor-widget-button > div > div > a > span > span.elementor-button-text";
        WebElement btoPage = driver.findElement(By.cssSelector(buttonCursos));
        String texto = btoPage.getText();
        assertEquals("Conheça Nossos Cursos", texto);
        String bto;
        btoPage.click();
        String src = "https://img.imageboss.me/orbitpages/height/100/withoutEnlargement:true/sites/102987/2022/01/layout_whatsapp.png";
//        WebElement imgLogo = driver.findElement(By.linkText(src));
//        assertEquals();
    }
    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
