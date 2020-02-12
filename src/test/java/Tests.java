import com.codeborne.selenide.Configuration;
import io.qameta.allure.Epic;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests extends TestBase {

    @Test
    @Epic("Login")
    public void LoginTest01(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest02(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest03(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest04(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest05(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest06(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest07(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest08(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest09(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

    @Test
    public void LoginTest10(){
        LoginPage loginPage = open(loginPageURL, LoginPage.class);
        loginPage.loginUser();
    }

}
