package androidx.room.util;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SQLiteConnectionUtil {
    public static final long getLastInsertedRowId(SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (getTotalChangedRows(sQLiteConnection) == 0) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT last_insert_rowid()");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            long j2 = sQLiteStatement.getLong(0);
            r.y(sQLiteStatementPrepare, null);
            return j2;
        } finally {
        }
    }

    public static final int getTotalChangedRows(SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT changes()");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            int i2 = (int) sQLiteStatement.getLong(0);
            r.y(sQLiteStatementPrepare, null);
            return i2;
        } finally {
        }
    }
}
