package com.management.system.beans.responseBase;

import com.google.gson.annotations.SerializedName;

public class Response<T> {
    @SerializedName("result")
    private Result<T> result;
    @SerializedName("error")
    private Error error;

    public Result getResult() {
        return result;
    }
    public void setResult(Result<T> result) {
        this.result = result;
    }

    public Error getError() {
        return error;
    }

    public void setError(String localizedMessage, String messageKey) {
        error = new Error(localizedMessage,messageKey);
    }

    public void setMessage(String localizedMessage, String messageKey){
        result = new Result<>();
        result.setMessage(new Message(localizedMessage,messageKey));
    }

    public void setData(T data){
        result = new Result<>();
        result.setData(data);
    }

    public void setDataAndMessage(T data,String localizedMessage , String messageKey){
        result = new Result<>();
        result.setData(data);
        result.setMessage(new Message(localizedMessage,messageKey));
    }



}
