package com.example.lzd.officedutyinformationsystem;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyDbHelper extends SQLiteOpenHelper {
    private Context mcontext;
     public MyDbHelper( @Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version ) {
        super(context, name, factory, version);
        mcontext=context;
    }

    @Override
    public void onCreate( SQLiteDatabase db ) {
        db.execSQL("create table information(_id integer PRIMARY KEY AUTOINCREMENT, name varchar(20) , password integer);");
        Toast.makeText(mcontext,"创建成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade( SQLiteDatabase db, int oldVersion, int newVersion ) {

    }
}
