package com.example.hongsonpham.firstgreeting.model.entity.user;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by HongSonPham on 3/13/18.
 */

@IgnoreExtraProperties
public class Caller extends UserImp {
    private String clubId;

    public Caller(String clubId) {
        this.clubId = clubId;
    }

    public Caller(String userId, String userName, String userAvatar, String clubId) {
        super(userId, userName, userAvatar);
        this.clubId = clubId;
    }

    public Caller(User user, String clubId) {
        super(user);
        this.clubId = clubId;
    }

    public String getClubId() {
        return clubId;
    }

    public void setClubId(String clubId) {
        this.clubId = clubId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaller{" +
                "clubId='" + clubId + '\'' +
                '}';
    }
}
