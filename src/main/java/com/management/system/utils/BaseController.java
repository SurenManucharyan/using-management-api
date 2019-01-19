package com.management.system.utils;

import com.google.gson.Gson;
import com.management.system.beans.responseBase.Response;

public class BaseController {

    private Gson gson = new Gson();


    public String createGson(Response response) {
        return gson.toJson(response);
    }
}
