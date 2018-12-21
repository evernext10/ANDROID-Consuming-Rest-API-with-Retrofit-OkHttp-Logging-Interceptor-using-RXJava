package com.evertdev.crud_networking.Networking.Model;

import com.evertdev.crud_networking.Networking.Model.BaseResponse;
import com.google.gson.annotations.SerializedName;

public class User extends BaseResponse {
    @SerializedName("api_key")
    String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
