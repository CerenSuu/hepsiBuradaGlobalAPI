package baseURL;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class URL {
    protected RequestSpecification specJsonPlace;

    @Before
    public void setUp(){

        specJsonPlace = new RequestSpecBuilder().
                setBaseUri("https://httpbin.org").
                build();
    }
}
