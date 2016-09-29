package idadedecachorro.ppk.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixatexto;
    private Button botaoidade;
    private TextView resultadoidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caixatexto= (EditText) findViewById(R.id.caixatextoid);
        botaoidade= (Button) findViewById(R.id.botaoidadeid);
        resultadoidade= (TextView) findViewById(R.id.resultadoidadeid);

        botaoidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado= caixatexto.getText().toString();
                int valorDigitado, calculo;

                if(textoDigitado.isEmpty())
                {
                    resultadoidade.setText("Escreva a idade primeiro");
                }
                else
                {
                    valorDigitado= Integer.parseInt(textoDigitado);
                    calculo=valorDigitado*7;
                    resultadoidade.setText("A idade dele seria "+calculo+" Se ele fosse humano");
                }
            }
        });
        {

        }

    }
}
