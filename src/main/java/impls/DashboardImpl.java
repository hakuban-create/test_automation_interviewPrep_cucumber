package impls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utils.CucumberLogUtils;
import utils.WebdriverUtils;

import java.util.List;
import java.util.NoSuchElementException;

public class DashboardImpl {

    public void verifyDashboards(List<String> dashboardList) {

        for (String eachDashboard : dashboardList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_BUTTON, eachDashboard);

            try {
                WebElement webElement = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()) {
                    CucumberLogUtils.logPass(eachDashboard + " dashboard is displayed as expected", false);
                }


            } catch (Exception e) {
                CucumberLogUtils.logFail(eachDashboard + " dashboard is NOT displayed", false);
            }

        }
        CucumberLogUtils.logPass("All the dashboards are displayed as expected: " +dashboardList, true);

    }

    public void validateErrorMsg(String errorMessage) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_TEXT, errorMessage);
        WebElement webElement = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));

        if(webElement.isDisplayed())
        {
            CucumberLogUtils.logPass("'" + errorMessage + "' is displayed as expected " ,true);
        }
    }
}
