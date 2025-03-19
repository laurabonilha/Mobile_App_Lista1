package com.example.exerciciosac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio3Activity extends AppCompatActivity {

    private EditText edtNome, edtIdade, edtUF, edtCidade, edtTelefone, edtEmail;
    private Button btnCadastrar, btnVoltar;
    private RadioGroup radioGroupTamanho;
    private CheckBox cbVermelho, cbAzul, cbVerde, cbPreto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);

        // Inicializando os componentes
        edtNome = findViewById(R.id.edtNome);
        edtIdade = findViewById(R.id.edtIdade);
        edtUF = findViewById(R.id.edtUF);
        edtCidade = findViewById(R.id.edtCidade);
        edtTelefone = findViewById(R.id.edtTelefone);
        edtEmail = findViewById(R.id.edtEmail);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnVoltar = findViewById(R.id.btnVoltar);
        radioGroupTamanho = findViewById(R.id.radioGroupTamanho);
        cbVermelho = findViewById(R.id.cbVermelho);
        cbAzul = findViewById(R.id.cbAzul);
        cbVerde = findViewById(R.id.cbVerde);
        cbPreto = findViewById(R.id.cbPreto);

        // Ação do botão "Cadastrar"
        btnCadastrar.setOnClickListener(v -> {
            // Lógica para realizar o cadastro
            String nome = edtNome.getText().toString();
            String idade = edtIdade.getText().toString();
            String uf = edtUF.getText().toString();
            String cidade = edtCidade.getText().toString();
            String telefone = edtTelefone.getText().toString();
            String email = edtEmail.getText().toString();

            // Aqui você pode pegar o tamanho selecionado e as cores preferidas
            int selectedId = radioGroupTamanho.getCheckedRadioButtonId();
            RadioButton radioButton = findViewById(selectedId);
            String tamanho = radioButton != null ? radioButton.getText().toString() : "";

            StringBuilder coresPreferidas = new StringBuilder();
            if (cbVermelho.isChecked()) coresPreferidas.append("Vermelho ");
            if (cbAzul.isChecked()) coresPreferidas.append("Azul ");
            if (cbVerde.isChecked()) coresPreferidas.append("Verde ");
            if (cbPreto.isChecked()) coresPreferidas.append("Preto");

            // Exibir ou processar os dados cadastrados
            // Você pode fazer algo como salvar os dados ou exibir uma mensagem

            // Exemplo de log
            System.out.println("Cadastro realizado: " + nome + ", " + idade + ", " + uf + ", " + cidade + ", " + telefone + ", " + email + ", Tamanho: " + tamanho + ", Cores: " + coresPreferidas);
        });

        // Ação do botão "Voltar ao Menu Principal"
        btnVoltar.setOnClickListener(v -> {
            // Intent para voltar à tela principal (MainActivity)
            Intent intent = new Intent(Exercicio3Activity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Opcional: finalizar a atividade atual para não voltar a ela ao pressionar o botão de voltar do dispositivo
        });
    }
}
