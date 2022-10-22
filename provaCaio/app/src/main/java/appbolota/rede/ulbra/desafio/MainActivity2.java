package appbolota.rede.ulbra.desafio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();
            }
        }, 4000);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                MainActivity2.this,MainActivity.class
        );
        startActivity(intent);
        finish();
    }
}

