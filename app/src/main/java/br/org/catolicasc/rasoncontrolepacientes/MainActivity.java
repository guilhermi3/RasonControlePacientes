package br.org.catolicasc.rasoncontrolepacientes;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, NovoPaciente.class);
                startActivity(it);
            }
        });


        ////

        ListView lvPacientes = findViewById(R.id.lvPaciente);

        DAL dal = new DAL(this);
        Cursor cursor = dal.loadAll();

        String[] fields = new String[] {CreateDatabase.ID, CreateDatabase.NOME};
        int[] ids = {R.id.tvId, R.id.tvTitle};

        //Log.d(TAG, "onCreate: id " + cursor.getInt(0) + " title " + cursor.getString(1));
        Log.d(TAG, "onCreate: " + cursor.getCount());
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(MainActivity.this,
                R.layout.paciente_layout, cursor, fields, ids, 0);

        lvPacientes.setAdapter(adapter);


        ////


    }


}

