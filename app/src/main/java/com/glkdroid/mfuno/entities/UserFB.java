package com.glkdroid.mfuno.entities;

import com.google.gson.annotations.SerializedName;

public class UserFB {

    @SerializedName("name")
    public String name;

    @SerializedName("email")
    public String email;

    @SerializedName("facebookID")
    public String facebookID;

    @SerializedName("gender")
    public String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}