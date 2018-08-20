package br.com.ec.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;
    private TextView txtResultado, txtCPU2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar     = (Button) findViewById(R.id.btnJogar);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtCPU2      = (TextView) findViewById(R.id.txtCPU2);

        btnJogar.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v){
               Random random = new Random();
               int nRandom = random.nextInt(10);
               int nCPU2   = random.nextInt(10);
               txtResultado.setText("Minha Nota ->  "+ nRandom);
               txtCPU2.setText(" "+ nCPU2);
           }
        });
    }
}
