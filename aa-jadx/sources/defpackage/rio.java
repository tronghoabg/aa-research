package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rio extends android.database.sqlite.SQLiteOpenHelper {
    public rio(android.content.Context context, int i) {
        super(context, "carservicedata.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i);
    }

    protected abstract void g(android.database.sqlite.SQLiteDatabase sQLiteDatabase);

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        g(sQLiteDatabase);
    }
}
