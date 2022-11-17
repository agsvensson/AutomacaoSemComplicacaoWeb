package com.agsvensson.automacaoWeb;

import com.agsvensson.core.Driver;
import static org.junit.Assert.*;
import com.agsvensson.pages.CursoPage;
import com.agsvensson.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        principalPage = new PrincipalPage(driver);
        driver.get("https://chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste(){
        String titulo = principalPage.getTitulo();
        assertEquals("Porque Tempo É Conhecimento", titulo);
    }

    @Test
    public void segundoTeste(){
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        assertEquals("Conheça todos os nossos cursos", cursoPage.getTitulo2());
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

}
