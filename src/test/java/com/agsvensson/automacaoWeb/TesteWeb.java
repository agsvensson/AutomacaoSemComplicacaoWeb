package com.agsvensson.automacaoWeb;

import com.agsvensson.core.Driver;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste(){
                            // /html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);
    }

    @Test
    public void segundoTeste(){
        String xpathBotao = "//div[3]/div/div/div/div/div[2]//span[2]";
        WebElement txtBotao = driver.findElement(By.xpath(xpathBotao));
        String botao = txtBotao.getText();
        txtBotao.click();
        assertEquals("Conheça Nossos Cursos", botao);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

}
