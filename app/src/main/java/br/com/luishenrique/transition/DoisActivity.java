package br.com.luishenrique.transition;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DoisActivity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dois);

        botao = findViewById(R.id.button_dois);

        botao.setOnClickListener( v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        overridePendingTransition(R.anim.activity_dois_entrando, R.anim.nada);
    }
}