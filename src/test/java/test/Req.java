package test;

import baseURL.URL;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import testData.Data;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Req  extends URL {

    @Test
    public void test01(){
        // 1- URL and Body
        specJsonPlace.pathParam("url","json");
        // 2- Expected Data
        Data jsonPlaceHolder = new Data();
        JSONObject expBody = jsonPlaceHolder.expDataCreate();
        //System.out.println(expBody);
        // 3- Response save
        Response res = given().contentType(ContentType.JSON).spec(specJsonPlace).when().get("{url}"); //eger ıkı taneyse {pp1}/{pp2} seklınde yazıcaksın.
        //res.prettyPrint();
        // 4- Assertion
        JsonPath respJsonPath = res.jsonPath();
        assertEquals(jsonPlaceHolder.basariliStatusKod,res.getStatusCode()); //jUnıt den statıc code ımport ettık
        assertEquals(expBody.get("items"),respJsonPath.get("slideshow.slides[1].items[0]"));
    }


    }