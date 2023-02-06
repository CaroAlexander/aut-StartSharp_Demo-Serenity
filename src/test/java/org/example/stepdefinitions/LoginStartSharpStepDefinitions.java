package org.example.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.questions.AnswerLogin;
import org.example.tasks.LogIn;
import org.example.tasks.OpenUp;
import org.mockito.stubbing.Answer;

public class LoginStartSharpStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Alex, a registered user of the StartSharp application, wants to log in to the StartSharp main page to view the Dashboard$")
    public void thanAlexARegisteredUserOfTheStartSharpApplicationWantsToLogInToTheStartSharpMainPageToViewTheDashboard() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.StartSharpHomePage ());
        //throw new PendingException();
    }


    @When("^he navigates to the login page and provides this correct login credentials in the login form and clicks the Sign button$")
    public void heNavigatesToTheLoginPageAndProvidesThisCorrectLoginCredentialsInTheLoginFormAndClicksTheSignButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.theSingInPage());
        //throw new PendingException();
    }

    @Then("^he should be redirected to the dashboard main page$")
    public void heShouldBeRedirectedToTheDashboardMainPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogin.toTheQuestionLogin()));
        //throw new PendingException();
    }

}
