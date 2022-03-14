package RestAssuredPackage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
		public class Test1 {
		@Test
		public void TC1()
		{
			
			//Using Rest Assured case to display API Testing
			//declare the base url of testing
			RestAssured.baseURI="https://reqres.in/";
			//create request to fetch the second page
			Response r=RestAssured.given().get("/api/users?page=2");
			System.out.println(r.asString());
			//checking whether response contains michael
			Assert.assertTrue(r.asString().contains("michael"));
			//checking whether status code is 200
			Assert.assertEquals(200, r.getStatusCode());
			//checking whether the response time
			Assert.assertEquals(1,r.getTimeIn(TimeUnit.SECONDS));
			
			//Get headers of the response
			Headers h=r.getHeaders();
			System.out.println(h);
			
			
		}
		
		@Test
		public void TC2()
		{
			//Rest Assured in BDD Style
			RestAssured .given().baseUri("https://reqres.in/").
			when().
			get("/api/users?page=2").
			then().
			statusCode(200);
		}

	}
 

