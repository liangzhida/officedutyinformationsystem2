package com.example.lzd.officedutyinformationsystem;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private TextView tvName5;
    private EditText edtPassword2;
    private TextView tvName4;
    private EditText edtPassword;
    private TextView tvName3;
    private EditText edtName;
    private Button btnRegister;
    private Button btnReturn;
    private SQLiteDatabase db;
    MyDbHelper dbHelper;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tvName5 = (TextView) findViewById(R.id.tv_name5);
        edtPassword2 = (EditText) findViewById(R.id.edt_password2);
        tvName4 = (TextView) findViewById(R.id.tv_name4);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        tvName3 = (TextView) findViewById(R.id.tv_name3);
        edtName = (EditText) findViewById(R.id.edt_name);
        btnRegister = (Button) findViewById(R.id.btn_register);
        btnReturn = (Button) findViewById(R.id.btn_return);
        dbHelper=new MyDbHelper(this,"information.db",null,1);
        db=dbHelper.getWritableDatabase();


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                if (edtName.toString().equals(null)) {
                    Toast.makeText(RegisterActivity.this,"账号，密码不能为空",Toast.LENGTH_SHORT).show();
                }else{
                    if (edtPassword.getText().toString().equals(edtPassword2.getText().toString())) {
                        /*db=dbHelper.getWritableDatabase();
                        ContentValues values=new ContentValues();
                        values.put("name",edtName.getText().toString());
                        values.put("password",edtPassword.getText().toString());
                        db.insert("information",null,values);
                        values.clear();
                        Toast.makeText(RegisterActivity.this,"账号，密码添加成功！",Toast.LENGTH_SHORT).show();*/
                        Intent intent3 = new Intent(RegisterActivity.this, MainActivity.class);
                        intent3.putExtra("name", edtName.getText().toString());
                        intent3.putExtra("password", edtPassword.getText().toString());
                        intent3.putExtra("password2", edtPassword2.getText().toString());
                        startActivity(intent3);

                        Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    } else {
                        edtPassword.setText("");
                        edtPassword2.setText("");
                        Toast.makeText(RegisterActivity.this, "注册失败，二次密码不正确，请重新输入！", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });


        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });

    }
}
