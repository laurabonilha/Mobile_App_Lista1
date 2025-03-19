package com.example.exerciciosac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2Activity extends AppCompatActivity {

    private EditText edtValor1, edtValor2;
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        // Inicializando os componentes
        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        tvResultado = findViewById(R.id.tvResultado);

        // Definindo os cliques dos botões de operações
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarOperacao("soma");
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarOperacao("subtracao");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarOperacao("multiplicacao");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarOperacao("divisao");
            }
        });

        // Configurando o clique do botão de voltar

    }

    // Função para realizar a operação com base no tipo
    private void realizarOperacao(String operacao) {
        String valor1Str = edtValor1.getText().toString();
        String valor2Str = edtValor2.getText().toString();

        if (!valor1Str.isEmpty() && !valor2Str.isEmpty()) {
            double valor1 = Double.parseDouble(valor1Str);
            double valor2 = Double.parseDouble(valor2Str);
            double resultado = 0;

            switch (operacao) {
                case "soma":
                    resultado = valor1 + valor2;
                    break;
                case "subtracao":
                    resultado = valor1 - valor2;
                    break;
                case "multiplicacao":
                    resultado = valor1 * valor2;
                    break;
                case "divisao":
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                    } else {
                        tvResultado.setText("Erro: Divisão por zero!");
                        return;
                    }
                    break;
            }

            tvResultado.setText("Resultado: " + resultado);
        } else {
            tvResultado.setText("Por favor, preencha os campos de valor.");
        }
    }
}
