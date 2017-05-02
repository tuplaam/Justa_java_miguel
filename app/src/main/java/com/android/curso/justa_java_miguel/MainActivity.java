package com.android.curso.justa_java_miguel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLoadActivity2; //variables globales

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //cargue los elementos que tiene este layout

        btnLoadActivity2 = (Button) findViewById(R.id.btnLoadActivity2);



    }

    public void loadActivity(View v){ //void por ser un metodo sin retorno

        Intent load = new Intent(this, Actividad_2.class);

        startActivity(load);

    }



}
