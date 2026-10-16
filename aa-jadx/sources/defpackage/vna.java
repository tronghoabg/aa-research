package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vna extends android.database.sqlite.SQLiteOpenHelper {
    public vna(android.content.Context context) {
        super(context, "primes_events.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PRIMES_EVENTS(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,message TEXT NOT NULL,type INTEGER NOT NULL,data BLOB,clienttracing_data BLOB,created_at INTEGER NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("PRAGMA synchronous = 0");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS PRIMES_EVENTS");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PRIMES_EVENTS(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,message TEXT NOT NULL,type INTEGER NOT NULL,data BLOB,clienttracing_data BLOB,created_at INTEGER NOT NULL)");
    }
}
