package automacaoWeb.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CursoElement {

    @FindBy(css = "div.text-center > div.large-h1")
    public WebElement txtTitulo;

}
