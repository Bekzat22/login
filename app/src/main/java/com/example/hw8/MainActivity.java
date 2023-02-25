package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1,imageView,imageView2;
    EditText Name;
    TextView textView,textView1,textView2,textView3,textView4;
    EditText Password;
    AppCompatButton Btn;
    public void onClick(View view){
        Btn=findViewById(R.id.btn);
        imageView=findViewById(R.id.signal);
        imageView1=findViewById(R.id.wifi);
        imageView2=findViewById(R.id.battery);
        textView3=findViewById(R.id.text2);
        textView=findViewById(R.id.login);
        textView1=findViewById(R.id.time);
        textView2=findViewById(R.id.click);
        textView4=findViewById(R.id.forgot);
        Name=findViewById(R.id.edit);
        Password=findViewById(R.id.edit2);
        if(!Name.getText().toString().equals("admin")||!Password.getText().toString().equals("admin")){
            Toast.makeText(MainActivity.this,"Неправильный логин и пароль",Toast.LENGTH_SHORT).show();
        }if(Name.getText().toString().equals("admin")&&Password.getText().toString().equals("admin")){
                        Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_SHORT).show();
                        textView4.setVisibility(View.GONE);
                        textView2.setVisibility(View.GONE);
                        textView1.setVisibility(View.GONE);
                        textView.setVisibility(View.GONE);
                        textView3.setVisibility(View.GONE);
                        textView4.setVisibility(View.GONE);
                        imageView2.setVisibility(View.GONE);
                        imageView.setVisibility(View.GONE);
                        imageView1.setVisibility(View.GONE);
                        Name.setVisibility(View.GONE);
                        Password.setVisibility(View.GONE);
                        Btn.setVisibility(View.GONE);


                    }
        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.edit);
        Password = findViewById(R.id.edit2);
        Btn = findViewById(R.id.btn);
        Name.addTextChangedListener(textWatcher);
        Password.addTextChangedListener(textWatcher);
    }


    private final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @SuppressLint("ResourceAsColor")
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String user = Name.getText().toString();
            String pass = Password.getText().toString();
            Btn.setActivated(!user.isEmpty() || !pass.isEmpty());


        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

}