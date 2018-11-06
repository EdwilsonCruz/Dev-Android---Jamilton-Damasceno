package br.com.ec.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView btnJogar;
    private String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = (ImageView) findViewById(R.id.btnJogar);
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gerar numero aleatorio
                Random r = new Random();
                int pos  = r.nextInt(2);

                Intent intent = new Intent(MainActivity.this,DetalheActivity.class);
                intent.putExtra("opcao", opcao[pos]);
                startActivity(intent);
            }
        });
    }
}
