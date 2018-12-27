package com.example.lzd.officedutyinformationsystem;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MyActivity extends AppCompatActivity {
    private EditText edtSex;
    private EditText edtNumber;
    private EditText edtAge;
    private EditText edtGrade;
    private EditText edtName;
    private ImageView ivTouxiang;
    private Button button;
    private Uri imageUri;
    private final int CAMERA_REQUEST = 8888;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        edtSex = (EditText) findViewById(R.id.edt_sex);
        edtNumber = (EditText) findViewById(R.id.edt_number);
        edtAge = (EditText) findViewById(R.id.edt_age);
        edtGrade = (EditText) findViewById(R.id.edt_grade);
        edtName = (EditText) findViewById(R.id.edt_name);
        ivTouxiang = (ImageView) findViewById(R.id.iv_touxiang);



        ivTouxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent intent6 = new Intent();
                intent6.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent6, CAMERA_REQUEST);

            }
            protected void onActivityResult ( int requestCode, int resultCode, Intent data){
                if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
                    Bitmap photo = (Bitmap) data.getExtras().get("data");
                    ivTouxiang.setImageBitmap(photo);
                }
            }
        });

    }


}
