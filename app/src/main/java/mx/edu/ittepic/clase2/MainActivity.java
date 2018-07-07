package mx.edu.ittepic.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText edtNombres;
    EditText edtApellidos;
    Button btnMostrar;
    String nombres, apellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombres = findViewById(R.id.edtNombres);
        edtApellidos = findViewById(R.id.edtApellidos);
        btnMostrar = findViewById(R.id.btnMostrar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombres = edtNombres.getText().toString();
                apellidos = edtApellidos.getText().toString();

                btnMostrar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, nombres+" "+apellidos, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }//onCreate
}
