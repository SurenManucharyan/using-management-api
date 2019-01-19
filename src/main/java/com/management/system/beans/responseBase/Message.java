package com.management.system.beans.responseBase;

import com.google.gson.annotations.SerializedName;

public class Message {
    @SerializedName("localizedMessage")
    private String localizedMessage;
    @SerializedName("messageKey")
    private String messageKey;

    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String message_key) {
        this.messageKey = message_key;
    }

    public Message(String localizedMessage, String messageKey) {
        this.localizedMessage = localizedMessage.toString();
        this.messageKey = messageKey.toString();
    }
}
