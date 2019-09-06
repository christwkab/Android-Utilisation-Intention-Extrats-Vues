package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
TextView code,nomPrenom,ville;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        code=(TextView)findViewById(R.id.txtCode);
        nomPrenom=(TextView)findViewById(R.id.txtNomPrenom);
        ville=(TextView)findViewById(R.id.txtVille);
        Intent i=getIntent();
        String c=i.getStringExtra(Main3Activity.ExtraCne);
        String n=i.getStringExtra(Main3Activity.ExtraNom);
        String p=i.getStringExtra(Main3Activity.ExtraPrenom);
        String np=n +"  "+p;
        String vil=i.getStringExtra(Main3Activity.ExtraVille);
        code.setText(c);
        nomPrenom.setText(np);
        ville.setText(vil);

    }
}