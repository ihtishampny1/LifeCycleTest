package com.tec.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String search = "MyMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("Activity Created");
        Log.v(search  , "Activity Created" );
    }

    void showToast(String msg){
        Toast.makeText(MainActivity.this , msg ,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        String s = "??????";
        showToast("Activity Started");
        Log.v(search , s);
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Activity Destroyed");
    }

    @Override
    public void onBackPressed() {
        showToast("Press Again to exit");
//        super.onBackPressed();
    }
}