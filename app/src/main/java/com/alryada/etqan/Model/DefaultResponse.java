package com.alryada.etqan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Abd El-Sattar
 * on 2/3/2018.
 */

public class DefaultResponse {

    @SerializedName("status")
    @Expose
    private Boolean status;

    @SerializedName("message")
    @Expose
    private String message;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

