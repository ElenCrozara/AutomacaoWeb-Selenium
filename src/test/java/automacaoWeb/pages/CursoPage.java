package automacaoWeb.pages;

import automacaoWeb.elements.CursoElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    WebDriver driver;
    CursoElement cursoElement;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoElement = new CursoElement();
        PageFactory.initElements(driver, cursoElement);
    }
   public String getTitulo2() {
       return cursoElement.txtTitulo.getText();
    }
}

// //section[4]/div/div/div/div[1]/div//div