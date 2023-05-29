package com.byted.chapter5;

import com.google.gson.annotations.SerializedName;

/**
 * "admin": false,
 * "chapterTops": [],
 * "collectIds": [],
 * "email": "",
 * "icon": "",
 * "id": 58872,
 * "nickname": "wwwsjdajsd",
 * "password": "",
 * "publicName": "wwwsjdajsd",
 * "token": "",
 * "type": 0,
 * "username": "wwwsjdajsd"
 */
class User {
    @SerializedName("nickname")
    public String nickname;
    @SerializedName("password")
    public String password;

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }
}
