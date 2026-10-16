package com.bytedance.sdk.component.ivm.uef.uef.uef;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.ivm.uef.uef.uef.uef.ivm;
import com.bytedance.sdk.component.ivm.uef.xs;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class moa extends SQLiteOpenHelper {
    final Context uef;

    public moa(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.uef = context;
    }

    private void oa(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListYo = yo(sQLiteDatabase);
        if (arrayListYo == null || arrayListYo.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListYo.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }

    private void uef(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef.oa(xs.ivm().yo().oa()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ivm.uef.uef.uef.uef.moa.yo(xs.ivm().yo().uef()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ivm.uef.uef.uef.uef.xs.yo(xs.ivm().yo().moa()));
        sQLiteDatabase.execSQL(ivm.uef(xs.ivm().yo().lw()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ivm.uef.ivm.ivm.oa());
    }

    private ArrayList<String> yo(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            uef(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        try {
            if (i5 <= i10) {
                uef(sQLiteDatabase);
            } else {
                oa(sQLiteDatabase);
                uef(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
