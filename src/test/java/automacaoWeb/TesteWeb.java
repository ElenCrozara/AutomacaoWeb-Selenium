package automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class TesteWeb {
    ChromeDriver driver;
    @Before
    public void inicializaTeste() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }
    @Test
    public void acessaSite()  {
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
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
