package com.example.planetaskr;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Informacion extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int p;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b3 = findViewById(R.id.B3);
        b4 = findViewById(R.id.B4);
        b5 = findViewById(R.id.B5);
        b6 = findViewById(R.id.B6);
        b7 = findViewById(R.id.B7);
        b8 = findViewById(R.id.B8);
        b9 = findViewById(R.id.B9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 1;
                Gp(p);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 2;
                Gp(p);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 3;
                Gp(p);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 4;
                Gp(p);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 5;
                Gp(p);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 6;
                Gp(p);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 7;
                Gp(p);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 8;
                Gp(p);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Planetas.class);
                p = 9;
                Gp(p);
                startActivity(i);
            }
        });

    }
    private void Gp(int p) {
        preferences=getSharedPreferences("Variables", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("p", String.valueOf(p));
        editor.commit();
    }
}