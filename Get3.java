import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get3 {

	public static void main(String[] args) {

		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given().log().all().when().get("posts/a").then().log().all().assertThat().statusCode(404);

	}

}
