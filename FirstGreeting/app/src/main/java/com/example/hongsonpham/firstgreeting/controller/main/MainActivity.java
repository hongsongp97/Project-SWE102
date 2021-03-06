package com.example.hongsonpham.firstgreeting.controller.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.hongsonpham.firstgreeting.R;
import com.example.hongsonpham.firstgreeting.controller.extended_services.FacebookAPI;
import com.example.hongsonpham.firstgreeting.controller.extended_services.FirebaseAPI;

public class MainActivity extends AppCompatActivity {

    FirebaseAPI firebaseAPI;
    FacebookAPI facebookAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAPI = new FirebaseAPI();
        facebookAPI = new FacebookAPI() {
            @Override
            public void moveToHome() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("fbId", facebookAPI.getFbId());
                startActivity(intent);
            };
        };

        firebaseAPI.demo();
        loginToApp();

    }

    public void loginToApp() {
//        LoginManager.getInstance().logOut();
        if (facebookAPI.isLoginAlready()) {
            facebookAPI.loadInformation();
        } else {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }

}
