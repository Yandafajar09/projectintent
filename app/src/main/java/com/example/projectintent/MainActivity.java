package com.example.projectintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombol = (Button) findViewById(R.id.tombol_proses);
       tombol.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
     Intent intent = new Intent(this,activitykedua.class);
     startActivity(intent);

    }
}