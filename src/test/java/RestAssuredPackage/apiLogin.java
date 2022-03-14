package RestAssuredPackage;

import org.junit.Test;

import io.restassured.RestAssured;

public class apiLogin {

	@Test
	public void check()
	{
		RestAssured.given()
		.auth()
		.basic("postman", "passoword")
		.baseUri("https://reqres.in/")
		.when()
		.get("https://postman-echo.com/basic-auth%22")
		.then()
		.log().body();
	}
}
