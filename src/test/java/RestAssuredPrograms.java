import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestAssuredPrograms {

    Payload payload;

    @Test
    public void checkGETRequest() {
        RestAssured.baseURI = "";
        RequestSpecification httpRequest = RestAssured.given().auth().oauth2("");
        httpRequest.queryParam("","");
        httpRequest.header("","")
        .get("");

    }

    @Test
    public void checkPOSTRequest() {
        RestAssured.baseURI = "";
        RequestSpecification httpRequest = RestAssured.given().auth().oauth2("");
        httpRequest.when().queryParam("","");
        httpRequest.header("","");
        payload = new Payload("","");
        httpRequest.body(payload).post("").then().statusCode(200);

    }
}
