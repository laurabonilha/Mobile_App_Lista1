package com.example.exerciciosac1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio4Activity extends AppCompatActivity {

    private EditText edtNome;
    private Button btnGerarCheckBoxes;
    private LinearLayout llCheckBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);

        // Inicializando os componentes
        edtNome = findViewById(R.id.edtNome);
        btnGerarCheckBoxes = findViewById(R.id.btnGerarCheckBoxes);
        llCheckBoxes = findViewById(R.id.llCheckBoxes);

        // Definindo o clique do botão "Gerar CheckBoxes"
        btnGerarCheckBoxes.setOnClickListener(v -> {
            // Limpando as CheckBoxes anteriores (se houver)
            llCheckBoxes.removeAllViews();

            // Pegando o nome digitado
            String nome = edtNome.getText().toString().trim();

            if (!nome.isEmpty()) {
                // Gerando uma CheckBox para cada letra do nome
                for (int i = 0; i < nome.length(); i++) {
                    char letra = nome.charAt(i);

                    // Criando uma nova CheckBox para cada letra
                    CheckBox checkBox = new CheckBox(Exercicio4Activity.this);
                    checkBox.setText(String.valueOf(letra));

                    // Adicionando a CheckBox ao layout
                    llCheckBoxes.addView(checkBox);
                }
            } else {
                // Caso o nome esteja vazio
                Toast.makeText(Exercicio4Activity.this, "Por favor, digite um nome.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
