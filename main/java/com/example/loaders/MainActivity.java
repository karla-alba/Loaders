package com.example.loaders;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void iniciarBoton(View v){
            ProgressDialog progreso = new ProgressDialog(this);
            progreso.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progreso.setIcon(R.drawable.ic_launcher_background);
            progreso.setTitle("Barras de Progreso");
            progreso.show();


        }
}