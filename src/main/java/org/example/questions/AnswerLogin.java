package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.example.userinterface.StartSharpLogin;

public class AnswerLogin implements Question<Boolean> {
    private String question = "Dashboard";
    public static AnswerLogin toTheQuestionLogin() {
        return new AnswerLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameTitle = Text.of(StartSharpLogin.NAME_TITLE).viewedBy(actor).asString();
        if (question.equals(nameTitle)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
