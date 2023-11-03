import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestAssuredPrograms {

    Payload payload;

    @Test
    public void checkGETRequest() {
        RestAssured.baseURI = "";
        RequestSpecification httpRequest = RestAssured.given().auth().oauth2("");
        httpRequest.queryParam("","");
        httpRequest.header("","");

        Response response = httpRequest.get("");
        response.getStatusCode();

        response.getStatusLine();

        Headers headers = response.getHeaders();
        for(Header h:headers) {
            System.out.println(h);
        }

        String header = response.header("Content-type");
        System.out.println(header);

        ResponseBody responseBody = response.body();
        responseBody.asString();

        JsonPath jsp = response.jsonPath();
        System.out.println(jsp.getString(""));

        //tst ashjhsk

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
