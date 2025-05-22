package stepdefs;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class Assertions {
    private final Container container;

    public Assertions(Container container) {
        this.container = container;
    }

    @Then("the response code should be {int}")
    public void the_response_code_should_be(Integer expectedCode) {
        String body = container.response.getBody().asString();
        System.out.println("RESPONSE BODY: " + body);

        int statusCode = container.response.getStatusCode();
        System.out.println("ACTUAL HTTP STATUS CODE: " + statusCode);

        assertEquals("Unexpected HTTP status code!", expectedCode.intValue(), statusCode);
    }
}
