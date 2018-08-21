package pe.edu.upeu.clase01;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog.Builder;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtbienvenido;
    private EditText txtuser;
    private EditText txtpass;
    private Button btnenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //txtuser = (TextView) findViewById(R.id.tvr);
        txtuser= (EditText) findViewById(R.id.txtusuario);
        txtpass= (EditText) findViewById(R.id.txtpass);
        btnenviar =(Button)findViewById(R.id.btnenviar);
        txtbienvenido = (TextView) findViewById(R.id.txtwelcome);

    }
    public void login(View view){
        String usuario = txtuser.getText().toString();
        String pass = txtpass.getText().toString();
        /*Context context = getApplicationContext();
        CharSequence text ="";
        int duration = Toast.LENGTH_SHORT;*/
        if(usuario.equals("carlos")&&pass.equals("123")){
            Intent i = new Intent(MainActivity.this,MainActivity2.class);
            i.putExtra("user",usuario);
            startActivity(i);
            /*String keyIdentifer  = null;
            i.putExtra(strName, keyIdentifer );*/
        }else{

            // 1. Instantiate an AlertDialog.Builder with its constructor
            //AlertDialog.Builder  builder = new AlertDialog.Builder(R.layout.activity_main);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);


            // 2. Chain together various setter methods to set the dialog characteristics
            builder.setMessage("NO PASA NADA")
                    .setTitle("NO PASA NADA");

            // 3. Get the AlertDialog from create()
            AlertDialog dialog = builder.create();
            dialog.show();

            /*text="Error de datos";
            Toast.makeText(context,text,duration).show();*/
        }
    }
}
