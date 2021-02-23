package br.com.luishenrique.transition;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.button);

        botao.setOnClickListener( v -> {
            Intent intent = new Intent(this, DoisActivity.class);
            startActivity(intent);
            finish();
        });
        
        overridePendingTransition(R.anim.activity_um_entrando, R.anim.nada);
    }
}