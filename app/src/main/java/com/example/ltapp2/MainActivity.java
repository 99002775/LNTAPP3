package com.example.ltapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private static final String TAG =  MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "ONSTART");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onstop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onpause");
    }

    public void clickHandler(View view) {
        Log.i(TAG,"clickHandler");
        Intent hIntent = new Intent(MainActivity.this, HomeActivity.class);
        switch (view.getId()){
            case R.id.button:
                startHome();
                break;
            case R.id.button2:
                Intent dialIntent =new Intent(Intent.ACTION_VIEW,  Uri.parse("tel:12345678" ));
               // "//http://www.google.com"));
                //new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567"));
                startActivity(dialIntent);
                break;
        }


    }

    private void startHome() {
        Intent hIntent = new Intent(MainActivity.this, HomeActivity.class);
        hIntent.putExtra("mykey","divya");
        int c = add(10, 20);
        startActivity(hIntent);
    }


    private int add(int a, int b) {
        return a+b;
    }
}