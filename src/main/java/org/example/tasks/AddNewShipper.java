package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import org.example.userinterface.StartSharpLogin;
import org.example.userinterface.StartSharpNorthwindShipper;

public class AddNewShipper implements Task {
    public static AddNewShipper newShipper() { return Tasks.instrumented(AddNewShipper.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StartSharpNorthwindShipper.NORTHWIND_SECTION_BUTTON),
                Click.on(StartSharpNorthwindShipper.SHIPPER_SECTION_BUTTON),
                Click.on(StartSharpNorthwindShipper.NEW_SHIPPER_BUTTON),
                Enter.theValue("I'm SDET, Alexander Tobar from DXC Company").into(StartSharpNorthwindShipper.INPUT_COMPANYNAME),
                Enter.theValue("3054461269").into(StartSharpNorthwindShipper.INPUT_COMPANYPHONE),
                Click.on(StartSharpNorthwindShipper.SAVE_SHIPPER_BUTTON),
                Click.on(StartSharpNorthwindShipper.NORTHWIND_SECTION_BUTTON)
                //Wait.for(5000)// espera de 5 segundos
        );

    }
}
