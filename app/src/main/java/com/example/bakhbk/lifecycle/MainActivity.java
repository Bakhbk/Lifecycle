package com.example.bakhbk.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Toast onCreate!",Toast.LENGTH_LONG).show();
        Log.v("MainActivity","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "Toast onStart!",Toast.LENGTH_LONG).show();
        Log.v("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "Toast onResume!",Toast.LENGTH_LONG).show();
        Log.v("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "Toast onPause!",Toast.LENGTH_LONG).show();
        Log.v("MainActivity","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "Toast onDestroy!",Toast.LENGTH_LONG).show();
        Log.v("MainActivity","onDestroy");
    }
}
