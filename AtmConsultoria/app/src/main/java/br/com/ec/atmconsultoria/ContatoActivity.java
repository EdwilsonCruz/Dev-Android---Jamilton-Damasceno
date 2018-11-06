package br.com.ec.atmconsultoria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ContatoActivity extends AppCompatActivity {

    private String[] assuntoLista = {"Planos","Recursos Humanos","Serviços"};
    private Spinner spnList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        spnList = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,assuntoLista);
        spnList.setAdapter(ad);
    }
}
