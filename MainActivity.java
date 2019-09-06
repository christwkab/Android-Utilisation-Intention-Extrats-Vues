package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnCalculPoids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculPoids=(ImageButton)findViewById(R.id.imgBtnCalculPoids);

    }

    public void OpenActivity2(View v){
        Intent i2;
        i2 = new Intent(this,Main2Activity.class);
        startActivity(i2);
    }

    public void OpenActivity4(View v){
        Intent i4;
        i4 = new Intent(this,Main3Activity.class);
        startActivity(i4);
    }
}
