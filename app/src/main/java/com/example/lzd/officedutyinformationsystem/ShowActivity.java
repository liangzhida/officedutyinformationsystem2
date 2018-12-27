package com.example.lzd.officedutyinformationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    private TextView tv_show;
    private Button btn_retuarn;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        tv_show=findViewById(R.id.tv_show);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String password=intent.getStringExtra("password");
        tv_show.setText("用户名："+name);
        tv_show.append("\n"+"密  码："+password);
        btn_retuarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent7=new Intent(ShowActivity.this,MainActivity.class);

                startActivity(intent7);
            }
        });


    }
}
