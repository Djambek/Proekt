package com.example.proekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity{
    int second;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MySurfaceView(this));
        /*
        textView = findViewById(R.id.textView);

        second += 1;
        Button button = findViewById(R.id.start_stop_button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                new Thread(MainActivity.this).start();
            }
        });
    */

    }
}

