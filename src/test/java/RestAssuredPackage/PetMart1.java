package RestAssuredPackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PetMart1 {
	
	@Test
	public void check()
	{
		RestAssured.baseURI="https://petstore.swagger.io/";
		Response pet=RestAssured.given().get("v2/pet/1");
		String s=pet.asString();
		//printing all response details
		System.out.println(s);
		//checking if response is 200
		Assert.assertEquals(200, pet.getStatusCode());
		//checking if response contains available
		assertTrue(s.contains("available"));
		//printing the response time
		System.out.println(pet.getTimeIn(TimeUnit.SECONDS));
		//get headers of the response
		Headers h=pet.getHeaders();
	}

}
