package automacaoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }
   public String getTitulo2() {
        String xpathTitulo = "//section[4]/div/div/div/div[1]/div//div";

        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }
}
