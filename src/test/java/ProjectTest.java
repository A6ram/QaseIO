import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectTest {

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "http://qase.io/";
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;
    }

    @Test
    public void blabla() {
        open("login");
        $("#inputEmail").sendKeys("illia.a6ram@gmail.com");
        $("#inputPassword").sendKeys("pipikonda5");
        $("#btnLogin").click();
        $("#createButton").shouldBe(Condition.visible);
    }
}


