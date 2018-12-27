package com.example.lzd.officedutyinformationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textView4;
    private LinearLayout ChatlinearLayout;
    private ImageView imageView2;
    private TextView textView7;
    private LinearLayout MianlinearLayout;
    private ImageView imageView3;
    private TextView textView6;
    private LinearLayout mylinearLayout;
    private ImageView imageView;
    private TextView textView5;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        textView4 = (TextView) findViewById(R.id.textView4);
        ChatlinearLayout = (LinearLayout) findViewById(R.id.ChatlinearLayout);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        textView7 = (TextView) findViewById(R.id.textView7);
        MianlinearLayout = (LinearLayout) findViewById(R.id.MianlinearLayout);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        textView6 = (TextView) findViewById(R.id.textView6);
        mylinearLayout = (LinearLayout) findViewById(R.id.mylinearLayout);
        imageView = (ImageView) findViewById(R.id.imageView);
        textView5 = (TextView) findViewById(R.id.textView5);
        mylinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent7=new Intent(Main2Activity.this,MyActivity.class);
                startActivity(intent7);
            }
        });


    }
}
