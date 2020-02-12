import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends TestBase{

    private By loginEmail = By.cssSelector("section.col-lg-9 input[name=\"email\"]");
    private By loginPassword = By.cssSelector("section.col-lg-9 input[name=\"password\"]");
    private By loginBtn = By.cssSelector("section.col-lg-9 div.col-sm-offset-2 button");

    public void loginUser(){
        $(loginEmail).setValue(adminEmail);
        $(loginPassword).setValue(adminPassword);
        $(loginBtn).click();
    }

}
