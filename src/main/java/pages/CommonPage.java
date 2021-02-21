package pages;

public class CommonPage {

    public static final String XPATH_TEMPLATE_BUTTON = "//button[contains(text(),'%s')]";
    public static final String XPATH_TEMPLATE_INPUT_BOX = "//*[@placeholder='%s']";
    public static final String XPATH_TEMPLATE_TEXT = "//div[contains(text(), '%s')]";
    public static final String XPATH_TEMPLATE_DELETE_DASHBAORD_BUTTON = "//button[text()='%s']/parent::a/parent::div//div[@id='x']";

}
