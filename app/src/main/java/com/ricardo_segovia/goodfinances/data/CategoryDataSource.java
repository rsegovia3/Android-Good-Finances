package com.ricardo_segovia.goodfinances.data;

import android.content.Context;
import android.provider.BaseColumns;

/**
 * Created by Ricardo Segovia on 10/29/2017.
 */
public class CategoryDataSource {
    //Metainformación de la base de datos
    public static final String TABLE_NAME = "category";
    public static final String TABLE_LIST_CHILD_NAME = "category_child";

    //Campos de la tabla Quotes
    public static class Columns implements BaseColumns {
        public static final String ID = BaseColumns._ID;
        public static final String NAME = "name";
        public static final String COLOR = "color";
        public static final String ICON = "icon";
        public static final String ID_FATHER_CATEGORY = "id_father_category";
        public static final String ID_CHILD_CATEGORY = "id_child_category";
    }

    //Script create
    private static String CREATE_SCRIPT1 = String.format("CREATE TABLE %s"
                    +" (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT)",
            TABLE_NAME,
            Columns.ID,
            Columns.NAME,
            Columns.COLOR,
            Columns.ICON
    );
    private static String CREATE_SCRIPT2 = String.format("CREATE TABLE %s"
                    +" (%s INTEGER NOT NULL, %s INTEGER NOT NULL, PRIMARY KEY (%s, %s), FOREIGN KEY(%s) REFERENCES %s(%s))",
            TABLE_LIST_CHILD_NAME,
            Columns.ID_FATHER_CATEGORY,
            Columns.ID_CHILD_CATEGORY,
            Columns.ID_FATHER_CATEGORY,
            Columns.ID_CHILD_CATEGORY,
            Columns.ID_FATHER_CATEGORY,
            TABLE_NAME,
            Columns.ID,
            Columns.ID_CHILD_CATEGORY,
            TABLE_NAME,
            Columns.ID
    );
    public static final String CREATE_SCRIPT = CREATE_SCRIPT1 + ";" + CREATE_SCRIPT2;

    public static final String INSERT_SCRIPT = null;

    private SystemDBHelper systemDBHelper;

    public SystemDBHelper getSystemDBHelper() {
        return systemDBHelper;
    }

    public CategoryDataSource(Context context) {
        systemDBHelper = new SystemDBHelper(context);
    }
}