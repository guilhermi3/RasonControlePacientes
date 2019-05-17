package br.org.catolicasc.rasoncontrolepacientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class NovoPaciente extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_paciente);

        Button btnUpadate = findViewById(R.id.btnUpadate);


        btnUpadate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etNome = findViewById(R.id.etNome);
                EditText etIdade = findViewById(R.id.etIdade);
                EditText etLeucocitos = findViewById(R.id.etLeucocitos);
                EditText etGlicemia = findViewById(R.id.etGlicemia);
                EditText etAST = findViewById(R.id.etAST);
                EditText etLDH = findViewById(R.id.etLDH);


                String nome = etNome.getText().toString();
                String idade = etIdade.getText().toString();
                String leucocitos = etLeucocitos.getText().toString();
                String glicemia = etGlicemia.getText().toString();
                String ast = etAST.getText().toString();
                String ldh = etLDH.getText().toString();


            }
        });

    }
}
