package com.example.planetaskr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListaPlanetas extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_planetas);

        listView=(ListView)findViewById(R.id.ListaP);
        String[] nombres={"Mercurio","Venus","Tierra","Marte","Júpiter","Saturno","Urano","Neptuno"};
        String[] descripciones ={"Es el planeta más cercano al Sol y también el más pequeño del sistema solar.","Es el planeta más parecido a la Tierra en cuanto a tamaño, composición y masa.","Es el mayor de los planetas rocosos del sistema solar y una de sus características es que cuenta con su propio satélite, la Luna.","El planeta rojo es el segundo menor del sistema solar y cuenta con dos satélites: Fobos y Deimos.","Se trata del primero de los planetas exteriores, también conocidos como planetas gaseosos.","Es el único planeta con un sistema de anillos que podemos ver desde la Tierra y, probablemente, el que cuenta con más satélites.","es un gigante gaseoso y está compuesto principalmente por agua congelada, metano y amoniaco.","Se trata del planeta más alejado del Sol, y por ello es también el más frío. "};
        Integer[]  imagen= {R.drawable.mercurio, R.drawable.venus, R.drawable.tierra, R.drawable.marte, R.drawable.jupiter, R.drawable.saturno, R.drawable.urano, R.drawable.neptuno};
        AdapterL adapter = new AdapterL(this, nombres, descripciones, imagen);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),Informacion.class);
                startActivity(intent);
            }
        });

    }
}