package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
final class vlu extends CursorWrapper {
    final /* synthetic */ SQLiteDatabase a;
    final /* synthetic */ vlv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlu(vlv vlvVar, Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        super(cursor);
        this.a = sQLiteDatabase;
        this.b = vlvVar;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        synchronized (this.b.k.b) {
            this.a.close();
        }
    }
}
