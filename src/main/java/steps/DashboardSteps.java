package steps;

        import impls.DashboardImpl;
        import io.cucumber.java.en.Then;

        import java.util.List;

public class DashboardSteps {

    @Then("I verify the following dashboards are displayed:")
    public void iVerifyTheFollowingDashboardsAreDisplayed(List<String> dashboardList) {
        DashboardImpl impl = new DashboardImpl();
        impl.verifyDashboards(dashboardList);

    }

    @Then("I should see {string} error message")
    public void iShouldSeeErrorMessage(String errorMessage) {
        DashboardImpl impl = new DashboardImpl();
        impl.validateErrorMsg(errorMessage);
    }

    @Then("I delete the following dashboard:")
    public void iDeleteTheFollowingDashboard() {
    }
}
