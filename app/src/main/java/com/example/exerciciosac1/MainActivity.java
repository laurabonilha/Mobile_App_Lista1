package com.example.exerciciosac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEx1 = findViewById(R.id.btnExercicio1);
        Button btnEx2 = findViewById(R.id.btnExercicio2);
        Button btnEx3 = findViewById(R.id.btnExercicio3);
        Button btnEx4 = findViewById(R.id.btnExercicio4);
        Button btnEx5 = findViewById(R.id.btnExercicio5);

        btnEx1.setOnClickListener(view -> abrirActivity(Exercicio1Activity.class));
        btnEx2.setOnClickListener(view -> abrirActivity(Exercicio2Activity.class));
        btnEx3.setOnClickListener(view -> abrirActivity(Exercicio3Activity.class));
        btnEx4.setOnClickListener(view -> abrirActivity(Exercicio4Activity.class));
        btnEx5.setOnClickListener(view -> abrirActivity(Exercicio5Activity.class));
    }

    private void abrirActivity(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
