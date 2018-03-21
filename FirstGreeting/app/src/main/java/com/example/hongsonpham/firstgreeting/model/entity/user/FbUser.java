package com.example.hongsonpham.firstgreeting.model.entity.user;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HongSonPham on 3/13/18.
 */

@IgnoreExtraProperties
public class FbUser extends UserImp {
    private String userCover;
    private String userDOB;
    private String userEmail;
    private String userGender;

    public FbUser() {

    };

    public FbUser(String userId, String userName, String userAvatar, String userCover, String userDOB, String userEmail, String userGender) {
        super(userId, userName, userAvatar);
        this.userCover = userCover;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
        this.userGender = userGender;
    }

    public FbUser(User user, String userCover, String userDOB, String userEmail, String userGender) {
        super(user);
        this.userCover = userCover;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
        this.userGender = userGender;
    }

    public String getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserCover() {
        return userCover;
    }

    public void setUserCover(String userCover) {
        this.userCover = userCover;
    }

    @Override
    public String toString() {
        return super.toString() + "FbUser{" +
                "userDOB='" + userDOB + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userGender='" + userGender + '\'' +
                '}';
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("userId", userId);
        result.put("userName", userName);
        result.put("userAvatar", userAvatar);
        result.put("userCover", userCover);
        result.put("userDOB", userDOB);
        result.put("userGender", userGender);

        return result;
    }
}
