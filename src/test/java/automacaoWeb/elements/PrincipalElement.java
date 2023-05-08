package automacaoWeb.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalElement {


    @FindBy(xpath = "//section[2]//h4")
    public WebElement txtTitulo;

    @FindBy(xpath = "//body/div/div/div/div/div/section[2]//a")
    public WebElement btnPage;

}
