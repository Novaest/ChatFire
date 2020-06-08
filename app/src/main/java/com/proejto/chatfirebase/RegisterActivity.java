package com.proejto.chatfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private TextView nomeEditText;
    private EditText emailEditText;
    private EditText senhaEditText;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_register);

        nomeEditText = findViewById(R.id.nomeEditText);
        emailEditText = findViewById(R.id.emailEditText);
        senhaEditText = findViewById(R.id.senhaEditText);
        btnCadastro = findViewById(R.id.btnCadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        });

    }
    private void createUser(){
        String email = emailEditText.getText().toString();
        String senha = senhaEditText.getText().toString();

        if( email == null || email.isEmpty() ||senha == null || senha.isEmpty() ){
            Toast.makeText(this, "Senha e Email devem estar preenchidos", Toast.LENGTH_LONG).show();
            return;
        }

    }



}
