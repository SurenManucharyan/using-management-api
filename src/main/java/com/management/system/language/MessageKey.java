package com.management.system.language;

public class MessageKey {

    private String success = null;
    private String sessionExpired = null;
    private String permissionDenied = null;
    private String wrongLoginOrPassword = null;


    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getSessionExpired() {
        return sessionExpired;
    }

    public void setSessionExpired(String sessionExpired) {
        this.sessionExpired = sessionExpired;
    }

    public String getPermissionDenied() {
        return permissionDenied;
    }

    public void setPermissionDenied(String permissionDenied) {
        this.permissionDenied = permissionDenied;
    }

    public String getWrongLoginOrPassword() {
        return wrongLoginOrPassword;
    }

    public void setWrongLoginOrPassword(String wrongLoginOrPassword) {
        this.wrongLoginOrPassword = wrongLoginOrPassword;
    }
}