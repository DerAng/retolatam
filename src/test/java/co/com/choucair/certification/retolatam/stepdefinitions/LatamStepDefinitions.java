package co.com.choucair.certification.retolatam.stepdefinitions;

import co.com.choucair.certification.retolatam.questions.Answer;
import co.com.choucair.certification.retolatam.tasks.Clic;
import co.com.choucair.certification.retolatam.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LatamStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Rose wants to validate the size of a reservation code$")
    public void thanRoseWantsToValidateTheSizeOfAReservationCode() {

          OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.the());

    }

    @When("^She enters the link my trips, clicks Enter with your trip data and finally opens the link Where to find them$")
    public void sheEntersTheLinkMyTripsClicksEnterWithYourTripDataAndFinallyOpensTheLinkWhereToFindThem() {

        OnStage.theActorInTheSpotlight().attemptsTo(Clic.theOptions());

    }

    @Then("^then she validates that the size of the reservation code is (\\d+) characters$")
    public void thenSheValidatesThatTheSizeOfTheReservationCodeIsCharacters(int size) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theSize(size)));



    }

}
