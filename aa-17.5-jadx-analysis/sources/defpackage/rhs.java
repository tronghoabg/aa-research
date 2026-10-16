package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public abstract class rhs extends SQLiteOpenHelper {
    public rhs(Context context, int i) {
        super(context, "carservicedata.db", (SQLiteDatabase.CursorFactory) null, i);
    }

    protected abstract void g(SQLiteDatabase sQLiteDatabase);

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        g(sQLiteDatabase);
    }
}
