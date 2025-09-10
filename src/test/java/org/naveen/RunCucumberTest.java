package org.naveen;

import io.cucumber.java.it.Data;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions (
    features = "src/test/resources/org/features",
            glue = "org.naveen",
            plugin = {"pretty","html:target\\reports"},
        publish=true
)

public class RunCucumberTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}