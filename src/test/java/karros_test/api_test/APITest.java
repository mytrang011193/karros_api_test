package karros_test.api_test;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
 
import static io.restassured.RestAssured.*;
 
public class APITest {
 
    @Test
    public void getAPI() {
    	//get the response using RestAssured lib
        Response res = given()
                .when()
                .get("https://my-json-server.typicode.com/typicode/demo/posts/1");
        
        System.out.println(res.prettyPeek());
        //verify response status
        res.then().statusCode(200);
        //verify response body
        res.then().body("id", equalTo(1));
        res.then().body("title", equalTo("Post 1")); 
    }
}