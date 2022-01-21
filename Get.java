import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Get {

	public static void main(String[] args) {


		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given().log().all().queryParam("postid", "1").when().get("posts/1/comments").then().log().all().assertThat().statusCode(200);

	}

}
