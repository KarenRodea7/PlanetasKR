package com.example.planetaskr;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterL extends ArrayAdapter<String> {
    private final Activity context;
    private final String[]  nombres;
    private final String[]  descripciones;
    private final Integer[] imagen;

    public AdapterL(Activity context, String[] nombres, String[] descripciones, Integer[] imagen) {
        super(context,R.layout.item,nombres);
        this.context = context;
        this.nombres = nombres;
        this.descripciones = descripciones;
        this.imagen = imagen;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item,null);
        TextView _nombre=(TextView)rowView.findViewById(R.id.nombre);
        TextView _precio=(TextView)rowView.findViewById(R.id.descripción);
        ImageView _imagen=(ImageView)rowView.findViewById(R.id.imagen);
        _nombre.setText(nombres[position]);
        _precio.setText(descripciones[position]);
        _imagen.setImageResource(imagen[position]);
        return rowView;
    }

}
