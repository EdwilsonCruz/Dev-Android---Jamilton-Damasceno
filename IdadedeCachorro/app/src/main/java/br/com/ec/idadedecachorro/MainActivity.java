package br.com.ec.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText caixaTxt;
    private Button btnResultado;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTxt = (EditText) findViewById(R.id.caixaTxt);
        btnResultado = (Button) findViewById(R.id.btnPrincipal);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recuperando o que foi digitado.
                String txtDigitado = caixaTxt.getText().toString();
                if(txtDigitado.isEmpty()){
                    // String vazia(msg de erro)
                    txtResult.setText("Nenhuma número digitado!!!");
                }else {
                    int valorDigitado = Integer.parseInt(txtDigitado);
                    int resultFinal   = (valorDigitado * 7);
                    txtResult.setText("A idade do cachorro em anos Humanos é: "+resultFinal+ " anos.");
                }
            }
        });
    }
}
