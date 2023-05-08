package automacaoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {
    WebDriver driver;

    public PrincipalPage(WebDriver driver) { // para gerar um construtor automaticamente - botão direito>generate>constructor
        this.driver = driver;
    }
    public String getTitulo() {
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }
    public void clickBotao() {
        String buttonCursos = "//body/div/div/div/div/div/section[2]//a";

        WebElement btnPage = driver.findElement(By.xpath(buttonCursos));
        btnPage.click();
    }
}
