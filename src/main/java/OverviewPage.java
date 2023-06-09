import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "finish")
    private WebElement finishItem;

    public void clickFinish() {
        finishItem.click();
    }
}
