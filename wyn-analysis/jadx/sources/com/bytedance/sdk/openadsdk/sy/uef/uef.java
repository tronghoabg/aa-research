package com.bytedance.sdk.openadsdk.sy.uef;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.tpx;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class uef extends SQLiteOpenHelper {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile uef f26096oa;
    final Context uef;

    private uef(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.uef = context;
    }

    public static SQLiteDatabase oa() {
        try {
            uef uefVarYo = yo();
            if (uefVarYo == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = uefVarYo.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase uef() {
        try {
            uef uefVarYo = yo();
            if (uefVarYo == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = uefVarYo.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    private static uef yo() {
        if (f26096oa == null) {
            synchronized (uef.class) {
                try {
                    if (f26096oa == null) {
                        if (tpx.uef(com.bytedance.sdk.openadsdk.sy.uef.uef())) {
                            f26096oa = new uef(com.bytedance.sdk.openadsdk.sy.uef.uef(), "pag_monitor.db");
                        } else {
                            f26096oa = new uef(com.bytedance.sdk.openadsdk.sy.uef.uef(), "pag_monitor_" + tpx.yo(com.bytedance.sdk.openadsdk.sy.uef.uef()) + ".db");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f26096oa;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        try {
            if (i5 <= i10) {
                onCreate(sQLiteDatabase);
            } else {
                uef(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
    }

    private ArrayList<String> oa(SQLiteDatabase sQLiteDatabase) {
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
                return arrayList;
            }
        } catch (Exception e7) {
            dhk.yo("MonitorSQLiteOpenHelper", e7.getMessage());
        }
        return arrayList;
    }

    private void uef(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListOa = oa(sQLiteDatabase);
        if (arrayListOa == null || arrayListOa.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListOa.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }
}
