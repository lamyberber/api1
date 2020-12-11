package RestAssured.APItesting;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

import files.Payload;
public class addPlceDemo {


	public static void main(String[] args) {
		//given - all input details should be given
		//when submit the api - to resource http method
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick223").header("Content-Type", "application/json")
		.body(Payload.payLoad()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		.body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)");
		//add palce -- update the palce with new adrees  // get to retrieve the place we just added 

	}


}
