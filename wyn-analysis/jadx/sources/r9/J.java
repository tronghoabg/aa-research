package r9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes4.dex */
public final class J extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final a2.v f44574a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44575b;

    public J(Context context, a2.v vVar, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 17);
        this.f44574a = vVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f44575b = true;
        sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f44575b) {
            onConfigure(sQLiteDatabase);
        }
        new N(sQLiteDatabase, this.f44574a).c(0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        if (this.f44575b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f44575b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        if (!this.f44575b) {
            onConfigure(sQLiteDatabase);
        }
        new N(sQLiteDatabase, this.f44574a).c(i5);
    }
}
