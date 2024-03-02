package api;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.restassured.RestAssured.*;


public class RestApiMocked {

    @BeforeAll
    public static void setup(){
        RestAssured.baseURI ="http://35.208.34.242";
        RestAssured.port =8080;
    }
    @Test
    public void  getOrderByIdAndCheckResponseCodeIsOk(){
        get("http://35.208.34.242:8080/test-orders/5")
                .then()
                .statusCode(200);

    }

    @Test
    public void  getOrderByIdAndCheckResponseCodeIsBadRequest(){
        get("http://35.208.34.242:8080/test-orders/11")
                .then()
                .statusCode(400);

    }

    @Test
    public void  getOrderByIdAndCheckResponseCodeIs200t(){
        get("http://35.208.34.242:8080/test-orders/get_orders")
                .then()
                .statusCode(200);

}

// Home Work 9



    @Test
    public void deletingAnOrderIs200(){
        given().
                header("api_key", "1234567890123456").
                when().
                delete("http://35.208.34.242:8080/test-orders/2").
                then().
                statusCode(204);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,5,9,10})
    public void getOrdersByIdAndCheckResponseCodeIsOk(int orderId) {
        given().
                log()
                .all()
                .when()
                .get("/test-orders/" + orderId)
//                .get("/test-orders/{orderId}", orderId)
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 12})
    public void getOrdersByIdAndCheckResponseCodeIsNOk(int orderId) {
        given().
                log()
                .all()
                .when()
                .get("/test-orders/" + orderId)
//                .get("/test-orders/{orderId}", orderId)
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,5,9,10})
    public void getOrdersByIdAndCheckResponseCodeIsOkSecond(int orderId) {
       int responseOrderId=
               given().
                log()
                .all()
                .when()
                .get("/test-orders/" + orderId)
//                .get("/test-orders/{orderId}", orderId)
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract()
                .path("id");

        Assertions.assertEquals(orderId, responseOrderId);
    }

}
