package com.example.app_dev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements JoystickView.JoystickListener {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JoystickView joystick;
        joystick = new JoystickView(null);
        setContentView(joystick);//R.layout.activity_main

        }

@Override
public void onJoystickMoved(float xp, float yp, int s) {
        Log.d("Main Method","X percent: "+xp+ "y percent: "+yp);
        }
}

