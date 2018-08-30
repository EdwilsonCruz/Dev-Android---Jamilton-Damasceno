package br.com.ec.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textFraseDia;
    private Button btnFrase;
    private String[] frases = {"testando", "Segunda frase do dia!","Cheirinho de Sucesso!","Mengão Cheirinho sem Freio!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFraseDia = (TextView) findViewById(R.id.textFraseDia);
        btnFrase     = (Button) findViewById(R.id.btnFrase);

        View.OnClickListener onClickListener = null;
        btnFrase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(frases.length);
                textFraseDia.setText(frases[i].toUpperCase().toString());
            }
        });
        //Log.i("MainActivity","msg -> "+ frases[1].toUpperCase().toString() );
    }
}
