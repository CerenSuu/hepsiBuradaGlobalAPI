package testData;

import org.json.JSONArray;
import org.json.JSONObject;

public class Data {

    public int basariliStatusKod = 200;

    public JSONObject expDataCreate() {
        // 2- Expected Data
        JSONObject expData = new JSONObject();
        expData.put("items", "Why <em>WonderWidgets</em> are great");
        return expData;

    }
}
