package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverUtils {


    //SINGLETON WEBDRIVER

    private static WebDriver driver;

    private WebdriverUtils(){

    }


    public static WebDriver getWebDriver(){
        if(driver==null){
            String browserType = LocalConfigUtils.getProperty("browser");
            System.out.println("broswer::: " +browserType);

            switch (browserType.toLowerCase()){
                case "firefox" :
                    System.setProperty("webdriver.gecko.driver" , "/Users/khaliunaabaasandorj/Downloads/drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.setProperty("webdriver.chrome.driver" , "/Users/khaliunaabaasandorj/Downloads/drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;
            }

        }

        return driver;

    }




    public static void closeWebDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }




}







































