package RestAssuredPackage;

import org.junit.Test;

import io.restassured.RestAssured;

public class apidelete {
	
	@Test
	public void ceheck()
	{
		
	RestAssured.given()
	.baseUri("https://reqres.in/")
	.when()
	.delete("/api/users/2")
	.then()
	.statusCode(204)
	.log().body();
	
}
}
