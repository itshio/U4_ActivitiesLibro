package com.example.u4_activitiesejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etAutor, etEditorial, etDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etAutor = (EditText)findViewById(R.id.etAutor);
        etEditorial = (EditText)findViewById(R.id.etEditorial);
        etDescripcion = (EditText)findViewById(R.id.etDescripcion);
    }

    public void btnEnviarLibro(View view){

        String nombre=etNombre.getText().toString();
        String autor=etAutor.getText().toString();
        String editorial=etEditorial.getText().toString();
        String descripcion=etDescripcion.getText().toString();

        if(nombre.equals("") ||autor.equals("") ||editorial.equals("") ||descripcion.equals("")){
            Toast.makeText(getApplicationContext(),"Rellena todos los campos",Toast.LENGTH_LONG).show();
        }else{

        }
    }
}
