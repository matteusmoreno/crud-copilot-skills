package br.com.estacio;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testPersonCrudLifecycle() {
        // Create
        String payload = "{\"name\":\"Test User\",\"email\":\"test.user@example.com\",\"age\":25}";
        String id = given()
                .header("Content-Type", "application/json")
                .body(payload)
          .when().post("/api/persons")
          .then()
             .statusCode(201)
             .extract().path("id");

        // Get by id
        given()
          .when().get("/api/persons/" + id)
          .then()
            .statusCode(200)
            .body("name", equalTo("Test User"))
            .body("email", equalTo("test.user@example.com"));

        // Update
        String update = "{\"name\":\"Updated User\",\"email\":\"updated@example.com\",\"age\":26}";
        given()
          .header("Content-Type", "application/json")
          .body(update)
        .when().put("/api/persons/" + id)
        .then()
          .statusCode(200)
          .body("name", equalTo("Updated User"));

        // Delete
        given()
          .when().delete("/api/persons/" + id)
          .then()
            .statusCode(204);
    }
}