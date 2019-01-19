package com.management.system.language;

public class Language {

    private String wrongLoginOrPassword = null;
    private String sessionExpired = null;
    private String successfullyAdded = null;
    private String successfullyEdited = null;
    private String successfullyDeleted = null;
    private String permissionDenied = null;


    public String getWrongLoginOrPassword() {
        return wrongLoginOrPassword;
    }

    public void setWrongLoginOrPassword(String wrongLoginOrPassword) {
        this.wrongLoginOrPassword = wrongLoginOrPassword;
    }

    public String getSessionExpired() {
        return sessionExpired;
    }

    public void setSessionExpired(String sessionExpired) {
        this.sessionExpired = sessionExpired;
    }

    public String getSuccessfullyAdded() {
        return successfullyAdded;
    }

    public void setSuccessfullyAdded(String successfullyAdded) {
        this.successfullyAdded = successfullyAdded;
    }

    public String getSuccessfullyEdited() {
        return successfullyEdited;
    }

    public void setSuccessfullyEdited(String successfullyEdited) {
        this.successfullyEdited = successfullyEdited;
    }

    public String getSuccessfullyDeleted() {
        return successfullyDeleted;
    }

    public void setSuccessfullyDeleted(String successfullyDeleted) {
        this.successfullyDeleted = successfullyDeleted;
    }

    public String getPermissionDenied() {
        return permissionDenied;
    }

    public void setPermissionDenied(String permissionDenied) {
        this.permissionDenied = permissionDenied;
    }
}