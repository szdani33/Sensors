package com.example.daniel_szabo.sensors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        startService(new Intent(this, SensorDataRecorderService.class));
    }

    public void openAccelerometer(View view) {
        startActivity(new Intent(this, AccelerometerActivity.class));
    }

    public void openSettings(View view) {
        new SettingsDialog().show(getFragmentManager(), "settings");
    }
}
