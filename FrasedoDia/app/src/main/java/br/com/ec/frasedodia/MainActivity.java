package br.com.ec.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textFraseDia;
    private Button btnFrase;
    private String[] frases = {"testando", "Segunda frase do dia"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFraseDia = (TextView) findViewById(R.id.textFraseDia);
        btnFrase     = (Button) findViewById(R.id.btnFrase);

        textFraseDia.setText(frases[1].toUpperCase().toString());
    }
}
