package com.example.exerciciosac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio5Activity extends AppCompatActivity {

    private CheckBox cbNotificacoes, cbModoEscuro, cbLembrarLogin;
    private Button btnSalvarPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio5);

        // Inicializando os componentes
        cbNotificacoes = findViewById(R.id.cbNotificacoes);
        cbModoEscuro = findViewById(R.id.cbModoEscuro);
        cbLembrarLogin = findViewById(R.id.cbLembrarLogin);
        btnSalvarPreferencias = findViewById(R.id.btnSalvarPreferencias);

        // Configurando o clique no botão "Salvar Preferências"
        btnSalvarPreferencias.setOnClickListener(v -> {
            StringBuilder preferenciasSelecionadas = new StringBuilder();

            // Verificando as opções marcadas
            if (cbNotificacoes.isChecked()) {
                preferenciasSelecionadas.append("Receber notificações\n");
            }
            if (cbModoEscuro.isChecked()) {
                preferenciasSelecionadas.append("Modo escuro\n");
            }
            if (cbLembrarLogin.isChecked()) {
                preferenciasSelecionadas.append("Lembrar login\n");
            }

            // Se nenhuma opção foi selecionada
            if (preferenciasSelecionadas.length() == 0) {
                Toast.makeText(Exercicio5Activity.this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
            } else {
                // Exibindo as preferências selecionadas
                Toast.makeText(Exercicio5Activity.this, preferenciasSelecionadas.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
