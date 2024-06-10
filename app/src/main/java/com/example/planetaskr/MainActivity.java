package com.example.planetaskr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnIniciar;
    EditText user, pass;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = (Button) findViewById(R.id.Iniciar);
        user = (EditText)findViewById(R.id.User);
        pass = (EditText)findViewById(R.id.Pass);
        btnIniciar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(sum<3){
                    sum = sum + 1;

                    Intent intent = new Intent(getApplicationContext(), ListaPlanetas.class);
                    String datos = user.getText().toString();
                    String contr = pass.getText().toString();

                    if(datos.equals("") & contr.equals("")){
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "Bienvenido al Menú "+datos, Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(getApplicationContext(),"Cuenta o contraseña incorrectos, te quedan:  " +(3-sum)+" Intentos",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Excediste tus oportunidades",Toast.LENGTH_SHORT).show();
                    btnIniciar.setEnabled(false);
                }
            }
        });
    }
}