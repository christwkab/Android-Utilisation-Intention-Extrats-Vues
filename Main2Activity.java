package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static final int minFemme = 15;
    private static final int maxFemme = 35;
    private static final int minHomme = 10;
    private static final int maxHomme = 25;


    EditText txtPoids, txtTaille, txtAge;
    RadioButton rbHomme, rbFemme;
    TextView lbResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    private void init() {
        txtPoids = (EditText) findViewById(R.id.txtPoids);
        txtTaille = (EditText) findViewById(R.id.txtTaille);
        txtAge = (EditText) findViewById(R.id.txtAge);
        lbResult = (TextView) findViewById(R.id.lbResult);
//        imgSmiley = (ImageView)findViewById(R.id.imgSmiley);
        rbHomme = (RadioButton) findViewById(R.id.rbHomme);
        rbHomme.setChecked(true);

    }

    public void calcul_click(View v) {
        String message = "normal";
        Integer poids, tailles, age, sexe, min, max;
        poids = 0;
        tailles = 0;
        age = 0;
        sexe = 0;
        try {
            poids = Integer.parseInt(txtPoids.getText().toString());
            tailles = Integer.parseInt(txtTaille.getText().toString());
            age = Integer.parseInt(txtAge.getText().toString());
        } catch (Exception e) {

        }

        if (rbHomme.isChecked())
            sexe = 1;
        if (poids == 00 || tailles == 00 || age == 0)
            Toast.makeText(Main2Activity.this, "Saisie incorrect", Toast.LENGTH_SHORT).show();
    else

    {
        double tailleM=((double)tailles)/100;
        double img=(double)(1.2*poids/(tailleM*tailleM)+(0.23*age)-(10.83*sexe)-5.4);
        if(sexe==0){
            min=minFemme;
            max=maxFemme;
        }else{
            min=minHomme;
            max=maxHomme;
        }

        //Message correspondant
        if(img<min)
            message="Trop faible";
        else if(img>max)
            message="Trop élévé";
        if(message=="normal") {
            lbResult.setTextColor(Color.GREEN);
        }else{
            if(message=="Trop aible") {
                lbResult.setTextColor(Color.RED);
            }else{
                lbResult.setTextColor(Color.RED);
            }
        }
        lbResult.setText(String.format("%.01f",img)+":IMG "+message);
}


}

}
