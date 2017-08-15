package com.maxibi.testing;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by User on 8/14/2017.
 */

public class DatabaseOpenHelper extends SQLiteAssetHelper{

    private static String DB_NAME = "quotes";
    private static final int DB_VERSION = 1;


    public DatabaseOpenHelper(Context context) {

        super(context, DB_NAME,null, DB_VERSION);

    }
}
