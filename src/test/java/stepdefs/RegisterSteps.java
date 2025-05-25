package stepdefs;

import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;

public class RegisterSteps {
    private final Container container;

    public RegisterSteps(Container container) {
        this.container = container;
    }

    @Given("I register with username {string} and password {string} and confirm_password {string}")
    public void i_register(String username, String password, String confirmPassword) {
        container.response = given()
                .queryParam("username", username)
                .queryParam("password", password)
                .queryParam("confirm_password", confirmPassword)
                .when()
                .post("/register");
    }
}


