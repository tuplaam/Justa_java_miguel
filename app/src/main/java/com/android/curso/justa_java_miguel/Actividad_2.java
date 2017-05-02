package com.android.curso.justa_java_miguel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Actividad_2 extends AppCompatActivity {


    private Button btnCambiarImagen;


    private ImageView ivImagenActividad2;
    private RadioButton rbAndroid;
    private RadioButton rbIos;
    private TextView tvRestablecer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_2);

        btnCambiarImagen = (Button) findViewById(R.id.btnCambiarImagen);
        ivImagenActividad2 = (ImageView) findViewById(R.id.ivImagenActividad2);
        rbAndroid = (RadioButton) findViewById(R.id.rbAndroid);
        rbIos = (RadioButton) findViewById(R.id.rbIos);
        tvRestablecer = (TextView) findViewById(R.id.tvRestablecer);

    }





    public void cambiarImagen (View v){


        if(rbAndroid.isChecked()){
           // Toast.makeText(this, "android", Toast.LENGTH_SHORT).show();
            ivImagenActividad2.setImageResource(R.drawable.android);


        } else if(rbIos.isChecked()){
         //   Toast.makeText(this, "ios", Toast.LENGTH_SHORT).show();
            ivImagenActividad2.setImageResource(R.drawable.apple);

        }



    }



    public void restablecerImagen (View v){

        if (tvRestablecer.isClickable()){
            ivImagenActividad2.setImageResource(R.drawable.cara);

        }



    }
    
}