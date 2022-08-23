package com.zoro.twoproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView home1=findViewById(R.id.home1);
        TextView reges=findViewById(R.id.reges);
        TextView pass=findViewById(R.id.pass);
        TextView vhod=findViewById(R.id.vhod);
        TextView home=findViewById(R.id.clickME);
        Button buton=findViewById(R.id.voiti);
        EditText login=findViewById(R.id.login);
        EditText password=findViewById(R.id.password);
        login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
               if(login.getText().toString().equals("")){
                   buton.setBackgroundColor(Color.GRAY);
               } else {
                   buton.setBackgroundColor(Color.YELLOW);
               }
            }
        });

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if (login.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                 Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                 login.setVisibility(View.GONE);
                 reges.setVisibility(View.GONE);
                 pass.setVisibility(View.GONE);
                 vhod.setVisibility(View.GONE);
                 home.setVisibility(View.GONE);
                 home1.setVisibility(View.GONE);
                 password.setVisibility(View.GONE);
                 buton.setVisibility(View.GONE);
             }else {
                 Toast.makeText(MainActivity.this, "Вы вели неверные данные", Toast.LENGTH_SHORT).show();
             }
            }
        });
    }
}