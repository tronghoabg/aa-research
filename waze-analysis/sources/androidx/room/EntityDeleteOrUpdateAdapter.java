package androidx.room;

import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class EntityDeleteOrUpdateAdapter<T> {
    protected abstract void bind(SQLiteStatement sQLiteStatement, T t);

    protected abstract String createQuery();

    public final int handle(SQLiteConnection sQLiteConnection, T t) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (t == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            bind(sQLiteStatement, t);
            sQLiteStatement.step();
            r.y(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
        }
    }

    public final int handleMultiple(SQLiteConnection sQLiteConnection, Iterable<? extends T> iterable) throws Exception {
        x.f(sQLiteConnection, "connection");
        int totalChangedRows = 0;
        if (iterable == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : iterable) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
                }
            }
            r.y(sQLiteStatementPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int handleMultiple(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        x.f(sQLiteConnection, "connection");
        int totalChangedRows = 0;
        if (tArr == null) {
            return 0;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            Iterator itV = o.v(tArr);
            while (itV.hasNext()) {
                Object next = itV.next();
                if (next != null) {
                    bind(sQLiteStatement, next);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    totalChangedRows += SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
                }
            }
            r.y(sQLiteStatementPrepare, null);
            return totalChangedRows;
        } finally {
        }
    }
}
