package com.example.myapplication89;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView;
        txtView=findViewById(R.id.text);
        txtView.setText(R.string.Msg2);


        Log.i("Lifecycle","OnCreate() invoked" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","onStart() invoked" );
    }
    public void onRestart() {
        super.onRestart();
        Log.i("Lifecycle","onRestart() invoked" );
    }
    public void onResume() {
        super.onResume();
    }
}