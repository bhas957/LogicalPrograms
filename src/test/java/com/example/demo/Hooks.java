package com.example.demo;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("** Executing Scenario " + scenario.getName() + " ***  \n");

    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("----------------Executing Completed for Scenario " + scenario.getName() + " --------------  \n\n\n");

    }

  /*  @BeforeStep
    public void afterScenario(StepDefinedEvent step){
        System.out.println("** Executing Completed for Scenario "+step.stepDefinition.toString()+" ***");
    }*/

}