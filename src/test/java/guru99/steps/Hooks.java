package guru99.steps;

import guru99.utils.CommonUtils;
import guru99.utils.ConfigReader;
import guru99.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
//    @After
//    public void tearDown(){
//        CommonUtils.hardWait(3000);
//        Driver.getDriver().close();
//    }
}