package com.example.planetaskr;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Planetas extends AppCompatActivity {

    SharedPreferences preferences;
    int p;
    ImageView ima;
    TextView Nom, Desc, Desc2, Desc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetas);

        leerOpc();

        ima = findViewById(R.id.Ima);
        Nom = findViewById(R.id.Nom);
        Desc = findViewById(R.id.Des);
        Desc2 = findViewById(R.id.Des2);
        Desc3 = findViewById(R.id.Des3);

        if(p==1){
            ima.setImageResource(R.drawable.mercurio);
            Nom.setText(R.string.Mer);
            Desc.setText(R.string.DescM);
            Desc2.setText(R.string.InfMer);
            Desc3.setText(R.string.InfMer2);
        }
        if(p==2){
            ima.setImageResource(R.drawable.venus);
            Nom.setText(R.string.Ven);
            Desc.setText(R.string.DescV);
            Desc2.setText(R.string.InfVen);
            Desc3.setText(R.string.InfVen2);
        }
        if(p==3){
            ima.setImageResource(R.drawable.tierra);
            Nom.setText(R.string.Tierra);
            Desc.setText(R.string.DescT);
            Desc2.setText(R.string.InfT);
            Desc3.setText(R.string.InfT2);
        }
        if(p==4){
            ima.setImageResource(R.drawable.marte);
            Nom.setText(R.string.Mar);
            Desc.setText(R.string.DescMa);
            Desc2.setText(R.string.InfMar);
            Desc3.setText(R.string.InfMar2);
        }
        if(p==5){
            ima.setImageResource(R.drawable.jupiter);
            Nom.setText(R.string.Jup);
            Desc.setText(R.string.DescJ);
            Desc2.setText(R.string.InfJup);
            Desc3.setText(R.string.InfJup2);
        }
        if(p==6){
            ima.setImageResource(R.drawable.saturno);
            Nom.setText(R.string.Sat);
            Desc.setText(R.string.DescS);
            Desc2.setText(R.string.InfSat);
            Desc3.setText(R.string.InfSat2);
        }
        if(p==7){
            ima.setImageResource(R.drawable.urano);
            Nom.setText(R.string.Ur);
            Desc.setText(R.string.DescU);
            Desc2.setText(R.string.InfUr);
            Desc3.setText(R.string.InfUr2);
        }
        if(p==8){
            ima.setImageResource(R.drawable.neptuno);
            Nom.setText(R.string.Nep);
            Desc.setText(R.string.DescN);
            Desc2.setText(R.string.InfNep);
            Desc3.setText(R.string.InfNep2);
        }
        if(p==9){
            ima.setImageResource(R.drawable.planetasenanos);
            Nom.setText(R.string.Plut);
            Desc.setText(R.string.InfPlut);
            Desc2.setText(R.string.InfMer);
        }


    }
    private void leerOpc() {
        preferences = getSharedPreferences("Variables", Context.MODE_PRIVATE);
        p = Integer.parseInt(preferences.getString("p", "0"));
    }
}