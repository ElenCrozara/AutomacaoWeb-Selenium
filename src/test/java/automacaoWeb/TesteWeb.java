package automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {

    @Test
    public void primeiroTeste() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
    }
}
