
package com.appeni.bartender.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Access {

    @SerializedName("api_key")
    @Expose
    private String apiKey;
    @SerializedName("name")
    @Expose
    private String name;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
