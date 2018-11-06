package br.com.ec.caraoucoroa;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {
    private ImageView btnVoltar,imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem    = (ImageView) findViewById(R.id.imagemId);
        btnVoltar = (ImageView) findViewById(R.id.btnVoltar);

        Bundle extra =  getIntent().getExtras();
        if( extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara")) {
                //cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else{
                //coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalheActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
