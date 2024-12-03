package com.example.aktywnosci;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button przycisk = findViewById(R.id.btnDodrugiej);


    }
    public void doDrugiej(View view){
        EditText imie = findViewById(R.id.txtImie);
        String txtImie = imie.getText().toString();
        Intent intent = new Intent(this, DrugaAktywnosc.class);
        intent.putExtra("imie",txtImie);
        startActivity(intent);

    }
    }
