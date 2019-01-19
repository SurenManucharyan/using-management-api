package com.management.system.beans.responseBase;

import com.google.gson.annotations.SerializedName;

public class Error {
    @SerializedName("localizedMessage")
    private String localizedMessage;
    @SerializedName("messageKey")
    private String messageKey;

    public Error(String localizedMessage, String messageKey) {
        this.localizedMessage = localizedMessage;
        this.messageKey = messageKey;
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }
}
