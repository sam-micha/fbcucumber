package facebooklogin.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\fblogin.feature",glue="com\\facebooklogin\\stepdef")
public class FBTestRunner {


}
