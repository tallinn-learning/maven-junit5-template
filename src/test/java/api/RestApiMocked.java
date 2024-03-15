package api;

import com.google.gson.Gson;
import dto.OrderDtoMocked;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import utils.RandomDataGenerator;

import static io.restassured.RestAssured.*;


public class RestApiMocked {

    @BeforeAll
    public static void setup(){
        RestAssured.baseURI ="http://35.208.34.242:8080";
     //   RestAssured.port =443;
    }

    @Test
    public void createOrderAndCheckResponseCodeIsOk(){

      //  OrderDtoMocked orderDtoMocked = new OrderDtoMocked("OPEN", 0, "customer", "56554645", "hello", 0);

        OrderDtoMocked orderDtoMocked = new OrderDtoMocked();




        orderDtoMocked.setStatus("OPEN");
        orderDtoMocked.setCourierId(0);
        orderDtoMocked.setCustomerName(RandomDataGenerator.generateName());
        orderDtoMocked.setCustomerPhone("2423424");
        orderDtoMocked.setComment("comment");
        orderDtoMocked.setId(1);

        given().
                header("Content-Type", "application/json")
                .log()
                .all()
                .when()
                .body( new Gson().toJson(orderDtoMocked))
                .post("/test-orders")
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK);


    }
    @Test
    public void  getOrderByIdAndCheckResponseCodeIsOk(){
        get("test-orders/9")
                .then()
                .log()
                .all()
                .statusCode(200);

    }

    @Test
    public void  getOrderByIdAndCheckResponseCodeIsBadRequest(){
        given().
                when().
                get("test-orders/9")
                .then()
                .log()
                .all()
                .statusCode(400);

    }
// Urok 9
    @Test
    public void  getOrderByIdAndCheckResponseCodeIs200t(){
        get("http://35.208.34.242:8080/test-orders/get_orders")
                .then()
                .statusCode(200);

}

// Home Work 9, point 1



    @Test
    public void deletingAnOrderIs204(){
        given().
                header("api_key", "1234567890123456").
                when().
                delete("http://35.208.34.242:8080/test-orders/1").
                then().
                statusCode(204);
    }

    @Test
    public void  deletingAnOrderIs404(){
        given().
                header("api_key", "1234567890123456").
                when().
                delete("test-orders/2")
                .then()
                .log()
                .all()
                .statusCode(404);

    }
    @Test
    public void  deletingAnOrderIsBadRequest(){
        given().
                header("api_key", "1234567890123456").
                when().
                delete("test-orders/22")
                .then()
                .log()
                .all()
                .statusCode(400);

    }
    @Test
    public void  deletingAnOrderIsUnauthorized(){
        given().
                header("api_key", "12ertert7890123456").
                when().
                delete("test-orders/2")
                .then()
                .log()
                .all()
                .statusCode(401);

    }

// Urok 10

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
    // HOMEWORK 10
    @ParameterizedTest
    @CsvSource({
            "Peter1, Password01",
            "Maria2, Password02",
            "Tuuli3, Password03",
            "Ivan4, Password04"
    })
    public void testWithCsvSourceParameters(String username, String password){
        String response = given().
                log()
                .all()
                .when()
                .get("/test-orders?username=" + username+"&password="+ password)
//                .get("/test-orders/{orderId}", orderId)
                .then()
                .log()
                .all()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract()
                .path("apiKey");

        Assertions.assertNotNull(response);


    }

    //// UROK 12 - peredelatj

    }

