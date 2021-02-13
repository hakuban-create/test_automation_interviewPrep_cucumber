import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/dashboard.feature",
        glue = {"steps"}
//        tags="@test1 or @test2"
        //   tags="@regression and @shakeout"
)


public class DashboardRunner {

}
