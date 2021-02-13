import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/manageAccess.feature",
        glue = {"steps"},
       tags="@createuser"
        //   tags="@regression and @shakeout"
)


public class ManageAccessRunner {

}
