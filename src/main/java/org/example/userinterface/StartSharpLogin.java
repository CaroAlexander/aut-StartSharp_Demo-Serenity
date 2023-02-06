package org.example.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StartSharpLogin extends PageObject {
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("LoginPanel0_Username"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("LoginPanel0_Password"));

    public static final Target SIGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.id("LoginPanel0_LoginButton"));

    public static final Target NAME_TITLE = Target.the("Extraer el titulo de la pagina")
            .located(By.xpath("//h1[contains(text(),'Dashboard')]"));
}
