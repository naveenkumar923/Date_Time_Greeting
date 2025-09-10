package org.naveen;

import io.cucumber.java.en.*;
import org.testng.Assert;
import java.time.*;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    String userGreeting="Good Afternoon!!";


    LocalDateTime currentTime=LocalDateTime.now();
    int currentHour=currentTime.getHour();



    @Given("the system time is during afternoon hours")
    public void the_system_time_is_during_afternoon_hours() {
        System.out.println("Time now is: "+currentTime.getHour());

    }
    @When("user greets {string}")
    public void user_greets(String userGreeting) {
            System.out.println(userGreeting);
    }
    @Then("System validates the greeting")
    public void greeting_validation() {
        String systemGreeting=setSystemGreeting(currentHour);

        Assert.assertEquals(userGreeting,systemGreeting);

    }


    public String setSystemGreeting(int currentHour) {
        if(currentHour>=6 && currentHour<=12){
            return "Good Morning!!";
        }
        if(currentHour>12 && currentHour<=18){
            return "Good Afternoon!!";
        }
        if(currentHour>18 && currentHour<=22){
            return "Good Evening!!";
        }
        else{
            return "Why the hell are you awake!!";
        }
    }
}
