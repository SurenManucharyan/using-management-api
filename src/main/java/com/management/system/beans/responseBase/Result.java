package com.management.system.beans.responseBase;

import com.google.gson.annotations.SerializedName;

public class Result<T> {

    @SerializedName("data")
    private T data;
    @SerializedName("message")
    private Message message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
