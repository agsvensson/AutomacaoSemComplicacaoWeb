package com.agsvensson.pages;

import com.agsvensson.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);

    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText();
// modelo anterior
//        String titulo = principalMap.txtTitulo.getText();
//        return titulo;
    }

    public void clickBotao() {
        principalMap.btnTitulo.click();
// modelo anterior
//        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
//        btnTitulo.click();
    }
}
