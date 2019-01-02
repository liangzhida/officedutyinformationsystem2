package com.example.lzd.officedutyinformationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView textView8;
    private EditText edtPassword;
    private TextView textView;
    private TextView textView3;
    private EditText edtName;
    private Button btnStart;
    private TextView textView9;
    private Button btnBtnRegister;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        textView8 = (TextView) findViewById(R.id.textView8);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        textView = (TextView) findViewById(R.id.textView);
        textView3 = (TextView) findViewById(R.id.textView3);
        edtName = (EditText) findViewById(R.id.edt_name);
        btnStart = (Button) findViewById(R.id.btn_start);
        textView9 = (TextView) findViewById(R.id.textView9);
        btnBtnRegister = (Button) findViewById(R.id.btn_btnRegister);

        btnBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Main3Activity.this,RegisterActivity.class);
                startActivity(intent1);
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                /*info info = new info();
               String Name = edtName.getText().toString();
                db = dbHelper.getWritableDatabase();
                Cursor cursor = db.rawQuery("select * from information where name=?", new String[]{Name});
                if (cursor.moveToFirst()) {
                    info.setName(cursor.getString(cursor.getColumnIndex("name")));
                    info.setPassword(cursor.getString(cursor.getColumnIndex("password")));
                    //edtName.setText(info.getName());
                    //edtPassword.setText(info.getPassword());
                    Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    Log.i("Myinfo", info.toString());

                }
                cursor.close();
                /*if (edtName.getText().equals(info.getName())){
                    Intent intent=new Intent(MainActivity.this,EnterActivity.class);
                    startActivity(intent);
                }*/
                Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);


            }
        });
    }
}
