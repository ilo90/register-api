package stepdefs;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import properties.Properties;

public class Hooks {
    @BeforeAll(order = 0)
    public static void setUp() {
        RestAssured.baseURI = Properties.getBaseUrl();
    }
}
