package stepdefs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class RegisterSteps {
    private Response response;

    @Given("I register with username {string} and password {string} and confirm_password {string}")
    public void i_register(String username, String password, String confirmPassword) {
        response = given()
                .baseUri("https://09215xnnrg.execute-api.us-east-1.amazonaws.com/singular_task")
                .queryParam("username", username)
                .queryParam("password", password)
                .queryParam("confirm_password", confirmPassword)
                .when()
                .post("/register");
    }

    @Then("the response code should be {int}")
    public void the_response_code_should_be(Integer expectedCode) {
        String body = response.getBody().asString();
        System.out.println("RESPONSE BODY: " + body);

        int statusCode = response.getStatusCode();
        System.out.println("ACTUAL HTTP STATUS CODE: " + statusCode);

        assertEquals("Unexpected HTTP status code!", expectedCode.intValue(), statusCode);
    }


}
