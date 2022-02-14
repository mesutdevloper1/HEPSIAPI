import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class restAPI {
    @Test
    public void BDDtest(){
        when().get("https://www.hepsiburada.com/").then().statusCode(403);
    }
    @Test
    public void Name(){
        when().get("https://www.hepsiburada.com/").then().statusCode(200).body("data.name");
    }

    @Test
    public void postAPI(){
        String postData = "{\n" +
                " \"id\": 4,\n" +
                " \"name\": \"string\",\n" +
                " \"price\": 12.3,\n" +
                " \"stock\": 3\n" +
                "}\n";
        given().contentType(ContentType.JSON).body(postData).when().post("https://www.hepsiburada.com/").statusCode(200);

    }
}
