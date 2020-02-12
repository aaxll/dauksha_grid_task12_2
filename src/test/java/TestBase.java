import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Browsers.CHROME;

public class TestBase extends GridSetUp{


    // URLs
    String loginPageURL = "http://open-eshop.stqa.ru/oc-panel/auth/login/";

    // Admin credentials
    String adminEmail = "demo@open-eshop.com";
    String adminPassword = "demo";

   /* hub: local physical WIN10
    * java -jar selenium-server.jar -role hub
    *
    * node1: virtual UBUNTU
    * java -jar selenium-server.jar -role webdriver -hub http://192.168.174.1:4444/grid/register -port 5556
    * node2: virtual WIN7
    *
    * java -jar selenium-server.jar -role webdriver -hub http://192.168.174.1:4444/grid/register -port 5557
    *
    * */

   @BeforeClass
   public static void setUpGrid(){
       runHub();
       runNode("1");
       runNode("2");
       runNode("3");
    }


    @Before
    public void setUp() {
        Configuration.browser = CHROME;
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.fastSetValue = true;
        Configuration.remote = "http://127.0.0.1:4444/wd/hub";
        // прогон только на определенной платформе
        //Configuration.browserCapabilities.setPlatform(Platform.LINUX);
    }

    @After
    public void tearDown() {
       //System.out.println(Configuration.browserCapabilities.getPlatform().toString());
       WebDriverRunner.closeWebDriver();
    }



}
