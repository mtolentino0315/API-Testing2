import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get2 {

	public static void main(String[] args) {

		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given().log().all().when().get("/todos/1").then().log().all().assertThat().statusCode(200);

	}

}
