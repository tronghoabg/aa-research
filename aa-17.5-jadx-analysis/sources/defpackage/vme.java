package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes3.dex */
public final class vme extends SQLiteOpenHelper {
    public vme(Context context) {
        super(context, "primes_events.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PRIMES_EVENTS(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,message TEXT NOT NULL,type INTEGER NOT NULL,data BLOB,clienttracing_data BLOB,created_at INTEGER NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("PRAGMA synchronous = 0");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS PRIMES_EVENTS");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PRIMES_EVENTS(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,message TEXT NOT NULL,type INTEGER NOT NULL,data BLOB,clienttracing_data BLOB,created_at INTEGER NOT NULL)");
    }
}
