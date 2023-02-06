package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.example.userinterface.StartSharpPage;

public class OpenUp implements Task {
    private StartSharpPage startSharpPage;

    public static OpenUp StartSharpHomePage() { return Tasks.instrumented(OpenUp.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(startSharpPage));

    }
}
