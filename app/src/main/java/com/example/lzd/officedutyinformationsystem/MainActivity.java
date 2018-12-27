package com.example.lzd.officedutyinformationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName2;
    private EditText edtPassword;
    private TextView tvName;
    private EditText edtName;
    private TextView textView3;
    private Button btnStart;
    private Button btnRegister2;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName2 = (TextView) findViewById(R.id.tv_name2);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        tvName = (TextView) findViewById(R.id.tv_name);
        edtName = (EditText) findViewById(R.id.edt_name);
        textView3 = (TextView) findViewById(R.id.textView3);
        btnStart = (Button) findViewById(R.id.btn_start);
        btnRegister2 = (Button) findViewById(R.id.btn_register2);

        btnRegister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent1);
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent4=new Intent(MainActivity.this,EnterActivity.class);
                startActivity(intent4);
            }
        });
    }

}
