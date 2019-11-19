package com.manhpd;

import com.google.gson.JsonElement;
import com.manhpd.utils.GsonUtils;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        String data = GsonUtils.createJsonSample();
//        String comments = JsonUtils.getDataBasedOnField(data, "comments");
//
//        System.out.println(comments);

        // get specific field path
//        JSONObject jsonObject = JsonUtils.toJsonObjectWithJsonSimple(data);
//        JSONArray comments = (JSONArray) JsonUtils.getDataBasedPathWithJsonSimple(jsonObject, "posts/comments");
//        System.out.println(comments.toString());

        // convert Json string array to Java array of string
//        String jsonStringArray = "[\"JSON\",\"To\",\"Java\"]";
//        List<String> lst = JsonUtils.toStringArray(jsonStringArray);
//        System.out.println(lst.toString());
//
//        System.out.println(JsonUtils.toJsonArray(lst));

        // convert Json integer array to Java array of integer
//        String jsonIntegerArray = "[101,201,301,401,501]";
//        List<Integer> lst = GsonUtils.toIntegerArray(jsonIntegerArray);
//        System.out.println(lst);

        // Use gson to get spedific path's field
        JsonElement comments = GsonUtils.getDataBasedOnFields(data, "posts/comments");
        System.out.println(comments.toString());
    }

}
