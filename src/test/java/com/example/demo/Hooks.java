package com.example.demo;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "com.example.demo")
@SpringBootApplication
public class Hooks {

    @io.cucumber.java.Before
    public void beforetest() {
        SpringApplication.run(Hooks.class);
    }

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