package androidx.sqlite;

import h.a.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class SQLite__SQLite_nonWebKt {
    public static final void execSQL(SQLiteConnection sQLiteConnection, String str) throws Exception {
        x.f(sQLiteConnection, "<this>");
        x.f(str, "sql");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            r.y(sQLiteStatementPrepare, null);
        } finally {
        }
    }
}
