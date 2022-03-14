package RestAssuredPackage;

import org.junit.Test;

import io.restassured.RestAssured;

public class apiParameters {
	
	@Test
	public void check(){
		RestAssured.given()
		.pathParam("PageNo", 2)
		.baseUri("https://reqres.in/")
		.when()
		.get("/api/users?page={PageNo}")
		.then()
		.statusCode(200)
		.log().body();
		
	}

}
