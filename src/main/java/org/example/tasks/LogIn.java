package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userinterface.StartSharpLogin;

public class LogIn implements Task {
    public static LogIn theSingInPage() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("admin").into(StartSharpLogin.INPUT_USER),
                Enter.theValue("serenity").into(StartSharpLogin.INPUT_PASSWORD),
                Click.on(StartSharpLogin.SIGIN_BUTTON)
        );
    }
}
