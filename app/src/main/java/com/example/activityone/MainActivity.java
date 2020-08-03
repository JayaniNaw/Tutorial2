package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate() invoked");

    }
    public void onStart() {

        super.onStart();
        Log.i("Lifecycle", "OnStart() invoked");

    }
    public void onReStart() {

        super.onRestart();
        Log.i("Lifecycle", "OnReStart() invoked");

    }

    public void onResume() {

        super.onResume();
        Log.i("Lifecycle", "OnResume() invoked");
    }

    public void onPause() {

        super.onPause();
        Log.i("Lifecycle", "OnPause() invoked");
    }

    public void onStop() {

        super.onStop();
        Log.i("Lifecycle", "OnStop() invoked");
    }

    public void onDestroy(){

        super.onDestroy();
        Log.i("Lifecycle","OnDestroy invoked");

    }
}