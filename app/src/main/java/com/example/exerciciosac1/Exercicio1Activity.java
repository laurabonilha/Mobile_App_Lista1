package com.example.exerciciosac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1Activity extends AppCompatActivity {

    private EditText edtNome, edtIdade;
    private Button btnVerificar, btnVoltar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        // Inicializando os componentes
        edtNome = findViewById(R.id.edtNome);
        edtIdade = findViewById(R.id.edtIdade);
        btnVerificar = findViewById(R.id.btnVerificar);
        btnVoltar = findViewById(R.id.btnVoltar);  // Botão para voltar
        tvResultado = findViewById(R.id.tvResultado);

        // Definindo o clique do botão de Verificar
        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pegando os dados inseridos
                String nome = edtNome.getText().toString();
                String idadeStr = edtIdade.getText().toString();

                if (!nome.isEmpty() && !idadeStr.isEmpty()) {
                    int idade = Integer.parseInt(idadeStr);

                    // Verificando se é maior de idade
                    if (idade >= 18) {
                        tvResultado.setText(nome + ", você é maior de idade!");
                    } else {
                        tvResultado.setText(nome + ", você é menor de idade!");
                    }
                } else {
                    tvResultado.setText("Por favor, preencha todos os campos.");
                }
            }
        });

        // Definindo o clique do botão de Voltar
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Volta para a MainActivity
                Intent intent = new Intent(Exercicio1Activity.this, MainActivity.class);
                startActivity(intent);
                finish();  // Finaliza a Exercicio1Activity
            }
        });
    }
}
