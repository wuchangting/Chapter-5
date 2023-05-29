package com.byted.chapter5;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class UserResponse {
    @SerializedName("errorCode")
    public int errorCode;
    @SerializedName("errorMsg")
    public String errorMsg;
    @SerializedName("data")
    User user;

    @NonNull
    @Override
    public String toString() {
        return "Article{" +
                "errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + user.toString() +
                '}';
    }
}
