package pe.edu.upeu.clase01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity{
    private TextView txtbienvenido;
    private Spinner opciones;
    /*private ArrayList<Alumno> lista = new ArrayList<>();
    ImageView imageView;*/
    TextView resultado;
    EditText numero;
    Button btnresultado;
    Uri imageUri;
    private static final int PICK_IMAGE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        //txtuser = (TextView) findViewById(R.id.tvr);
        txtbienvenido = (TextView)findViewById(R.id.txtwelcome);
        //imageView = (ImageView) findViewById(R.id.imageView);
        String x = getIntent().getExtras().getString("user");
        txtbienvenido.setText("Bienvenido: "+x);


        numero = (EditText) findViewById(R.id.txtnumero);
        resultado = (TextView)findViewById(R.id.tvresultado);
        btnresultado = (Button) findViewById(R.id.btncalcular);
        btnresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularRaiz();
            }
        });
        //opciones = (Spinner)findViewById(R.id.sp01);

        /*ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.opciones,R.layout.support_simple_spinner_dropdown_item);
        opciones.setAdapter(adapter);
        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGallery();
            }
        });*/

    }

    public void calcularRaiz(){
        double result = Math.round(Math.pow(Double.parseDouble(numero.getText().toString()),0.333));
        resultado.setText(String.valueOf(result));
    }

    /*public void openGallery(){
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery,PICK_IMAGE);
    }*/

   /* @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode==RESULT_OK&&requestCode==PICK_IMAGE){
            imageUri=data.getData();
            imageView.setImageURI(imageUri);
        }
    }*/
}
