import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty" , "html:target/LoginRunner"},           //Generates html report in target folder
        features = "src/main/resources/features/login.feature:33",    //path to the .feature file
        glue = {"steps"}                                           //path to the step definitions
      //  ,tags="@testLogin"
        , stepNotifications = true                                  //displays each steps in the console
        ,  dryRun=false                                             //generate step defs

)


public class LoginRunner {

}

