package androidx.room;

import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.i;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class EntityInsertAdapter<T> {
    protected abstract void bind(SQLiteStatement sQLiteStatement, T t);

    protected abstract String createQuery();

    public final void insert(SQLiteConnection sQLiteConnection, Iterable<? extends T> iterable) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (iterable == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : iterable) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                }
            }
            r.y(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long insertAndReturnId(SQLiteConnection sQLiteConnection, T t) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (t == null) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            bind(sQLiteStatement, t);
            sQLiteStatement.step();
            r.y(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] insertAndReturnIdsArray(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        x.f(sQLiteConnection, "connection");
        if (collection == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i2 = 0; i2 < size; i2++) {
                Object objN = i.N(collection, i2);
                if (objN != null) {
                    bind(sQLiteStatement, objN);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i2] = lastInsertedRowId;
            }
            r.y(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long lastInsertedRowId;
        x.f(sQLiteConnection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i2 = 0; i2 < size; i2++) {
                Object objN = i.N(collection, i2);
                if (objN != null) {
                    bind(sQLiteStatement, objN);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i2] = Long.valueOf(lastInsertedRowId);
            }
            r.y(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (collection == null) {
            return i.h();
        }
        List listB = i.b();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : collection) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    listB.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection)));
                } else {
                    listB.add(-1L);
                }
            }
            r.y(sQLiteStatementPrepare, null);
            return i.a(listB);
        } finally {
        }
    }

    public final void insert(SQLiteConnection sQLiteConnection, T t) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (t == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            bind(sQLiteStatement, t);
            sQLiteStatement.step();
            r.y(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (tArr == null) {
            return;
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
                }
            }
            r.y(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        x.f(sQLiteConnection, "connection");
        if (tArr == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int length = tArr.length;
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                T t = tArr[i2];
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i2] = lastInsertedRowId;
            }
            r.y(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long lastInsertedRowId;
        x.f(sQLiteConnection, "connection");
        if (tArr == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i2 = 0; i2 < length; i2++) {
                T t = tArr[i2];
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i2] = Long.valueOf(lastInsertedRowId);
            }
            r.y(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (tArr == null) {
            return i.h();
        }
        List listB = i.b();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(createQuery());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            for (T t : tArr) {
                if (t != null) {
                    bind(sQLiteStatement, t);
                    sQLiteStatement.step();
                    sQLiteStatement.reset();
                    listB.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(sQLiteConnection)));
                } else {
                    listB.add(-1L);
                }
            }
            r.y(sQLiteStatementPrepare, null);
            return i.a(listB);
        } finally {
        }
    }
}
