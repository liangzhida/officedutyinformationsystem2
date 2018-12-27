package com.example.lzd.officedutyinformationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EnterActivity extends AppCompatActivity {
    private TextView textView2;
    private EditText edtName;
    private EditText edtGrade;
    private EditText edtNumber;
    private EditText edtAge;
    private EditText edtSex;
    private Button btnEnsure;
    private Button btnJump;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        init();
    }

    private void init() {
        textView2 = (TextView) findViewById(R.id.textView2);
        edtName = (EditText) findViewById(R.id.edt_name);
        edtGrade = (EditText) findViewById(R.id.edt_grade);
        edtNumber = (EditText) findViewById(R.id.edt_number);
        edtAge = (EditText) findViewById(R.id.edt_age);
        edtSex = (EditText) findViewById(R.id.edt_sex);
        btnEnsure = (Button) findViewById(R.id.btn_ensure);
        btnJump = (Button) findViewById(R.id.btn_jump);
        btnEnsure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent5=new Intent(EnterActivity.this,Main2Activity.class);
                intent5.putExtra("name",edtName.getText().toString());
                intent5.putExtra("age",edtAge.getText().toString());
                intent5.putExtra("number",edtNumber.getText().toString());
                intent5.putExtra("grade",edtGrade.getText().toString());
                intent5.putExtra("sex",edtSex.getText().toString());
                startActivity(intent5);
            }
        });
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent6=new Intent(EnterActivity.this,Main2Activity.class);
                startActivity(intent6);
            }
        });


    }
}
