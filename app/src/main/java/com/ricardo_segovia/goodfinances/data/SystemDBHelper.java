package com.ricardo_segovia.goodfinances.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Ricardo Segovia on 10/29/2017
 */
public class
SystemDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "good_finances_beta.db";
    public static final int DATABASE_VERSION = 1;

    private final Context mContext;

    public SystemDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //To Create tables
        db.execSQL(CategoryDataSource.CREATE_SCRIPT);


        //To Insert default rows
        if (CategoryDataSource.INSERT_SCRIPT != null) {
            db.execSQL(CategoryDataSource.INSERT_SCRIPT);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}