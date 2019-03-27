package br.com.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button jogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoResultado = findViewById(R.id.textoResultado);
        jogar = findViewById(R.id.jogar);

        jogar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Random random = new Random();
                int resuldado = random.nextInt(10);
                textoResultado.setText("O Resultado é " + resuldado);

            }
        });
    }
}
