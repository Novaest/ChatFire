package com.proejto.chatfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText senhaEditText;
    private Button btnEntrar;
    private TextView contaNovaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        senhaEditText = findViewById(R.id.senhaEditText);
        btnEntrar = findViewById(R.id.btnEntrar);
        contaNovaText = findViewById(R.id.contaNovaText);


        //Registro
        contaNovaText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String senha = senhaEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
                    
            }
        });

    }

}
