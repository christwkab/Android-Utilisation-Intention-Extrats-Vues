package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText cne,nom,prenom,ville;
    Button btnEnvoyer,btnHome;
    public static String ExtraCne = "message_cne";
    public static String ExtraNom = "message_nom";
    public static String ExtraPrenom = "message_prenom";
    public static String ExtraVille = "message_ville";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cne=(EditText)findViewById(R.id.edtCne);
        nom=(EditText)findViewById(R.id.edNom);
        prenom=(EditText)findViewById(R.id.edPrenom);
        ville=(EditText)findViewById(R.id.edVille);
    }

    public void envoyer(View v){
        String c=cne.getText().toString();
        String n=nom.getText().toString();
        String p=prenom.getText().toString();
        String vl=ville.getText().toString();
        Intent i=new Intent(this,Main4Activity.class);
        i.putExtra(ExtraCne,c);
        i.putExtra(ExtraNom,n);
        i.putExtra(ExtraPrenom,p);
        i.putExtra(ExtraVille,vl);
        startActivity(i);

    }

    public void home(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);


    }
}
