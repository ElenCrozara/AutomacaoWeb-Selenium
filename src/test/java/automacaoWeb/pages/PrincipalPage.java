package automacaoWeb.pages;

import automacaoWeb.elements.PrincipalElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalElement principalElement;

    public PrincipalPage(WebDriver driver) { // para gerar um construtor automaticamente - botão direito>generate>constructor
        this.driver = driver;
        principalElement = new PrincipalElement();
        PageFactory.initElements(driver, principalElement );

    }
    public String getTitulo() {
        return principalElement.txtTitulo.getText();
    }
    public void clickBotao() {
        principalElement.btnPage.click();
    }
}
