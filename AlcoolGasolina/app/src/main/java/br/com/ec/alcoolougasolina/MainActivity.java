package br.com.ec.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText precoAlc, precoGas;
private Button verificar;
private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //componentes da tela
        precoGas = (EditText) findViewById(R.id.precoGas);
        precoAlc = (EditText) findViewById(R.id.precoAlc);
        verificar = (Button) findViewById(R.id.verificar);
        txtResult = (TextView) findViewById(R.id.txtResult);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuperar valor
                String txtprecoGas = precoGas.getText().toString();
                String txtprecoAlc = precoAlc.getText().toString();
                //converter os valores strings p/ numeros
                Double valorAlc = Double.parseDouble(txtprecoAlc);
                Double valorGas = Double.parseDouble(txtprecoGas);
                //alcool / Gasolina
                Double resultado = (valorAlc / valorGas);

                if(resultado >= 0.7){
                    //Gasolina
                    txtResult.setText("E MELHOR USAR GASOLINA!");
                }else{
                    //Alcool
                    txtResult.setText("E MELHOR USAR ALCOOL!");
                }
            }
        });
    }
}
