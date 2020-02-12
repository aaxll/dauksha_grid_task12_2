import org.openqa.grid.common.RegistrationRequest;
import org.openqa.grid.internal.utils.SelfRegisteringRemote;
import org.openqa.grid.internal.utils.configuration.GridHubConfiguration;
import org.openqa.grid.internal.utils.configuration.GridNodeConfiguration;
import org.openqa.grid.shared.GridNodeServer;
import org.openqa.grid.web.Hub;
import org.openqa.selenium.remote.server.SeleniumServer;

import java.io.File;

public class GridSetUp {
    public static void runHub(){
        GridHubConfiguration gridHubConfiguration = new GridHubConfiguration();
        File hubJSON = new File(System.getProperty("user.dir")+"/src/test/resources/hub.json" );
        GridHubConfiguration hubConfig = gridHubConfiguration.loadFromJSON(hubJSON.toString());

        Hub hub = new Hub(hubConfig);
        hub.start();
    }

    public static void runNode(String nodeIndex){
        GridNodeConfiguration gridNodeConfiguration = new GridNodeConfiguration();
        File hubJSON = new File(System.getProperty("user.dir")+"/src/test/resources/node"+nodeIndex+".json" );
        GridNodeConfiguration nodeConfig = gridNodeConfiguration.loadFromJSON(hubJSON.toString());

        RegistrationRequest registrationRequest = new RegistrationRequest(nodeConfig);
        GridNodeServer node = new SeleniumServer(registrationRequest.getConfiguration());
        SelfRegisteringRemote selfRegisteringRemote = new SelfRegisteringRemote(registrationRequest);
        selfRegisteringRemote.setRemoteServer(node);
        selfRegisteringRemote.startRemoteServer();
        selfRegisteringRemote.startRegistrationProcess();
        System.setProperty("webdriver.chrome.driver", "C:/testing/chromedriver_win32/chromedriver.exe");
    }

/*    public static void main(String[] args) {
        runHub();
        runNode("1");
        runNode("2");
        runNode("3");
    }*/
}
