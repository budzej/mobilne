package com.example.aktywnosci;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class DrugaAktywnosc extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_druga_aktywnosc);

        TextView otrzymane = findViewById(R.id.txtOtrzymane);


        Intent intent = getIntent();
        String odebrany = intent.getStringExtra("imie");
        if(odebrany!=null){
            otrzymane.setText(odebrany);
        }

    }
    public void btnCofnij(View view){
        finish();
    }
}