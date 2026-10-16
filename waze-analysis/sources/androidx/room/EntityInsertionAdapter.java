package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
        x.f(roomDatabase, "database");
    }

    protected abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t);

    public final void insert(Iterable<? extends T> iterable) {
        x.f(iterable, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long insertAndReturnId(T t) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        x.f(collection, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i2 = 0;
            for (T t : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i.p();
                }
                bind(supportSQLiteStatementAcquire, t);
                jArr[i2] = supportSQLiteStatementAcquire.executeInsert();
                i2 = i3;
            }
            return jArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        x.f(collection, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator<? extends T> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i2 = 0; i2 < size; i2++) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i2] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        x.f(collection, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            List listB = i.b();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                listB.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            return i.a(listB);
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(T t) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(T[] tArr) {
        x.f(tArr, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t : tArr) {
                bind(supportSQLiteStatementAcquire, t);
                supportSQLiteStatementAcquire.executeInsert();
            }
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        x.f(tArr, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        Iterator itV = o.v(tArr);
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i2 = 0; i2 < length; i2++) {
                bind(supportSQLiteStatementAcquire, itV.next());
                lArr[i2] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        x.f(tArr, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            List listB = i.b();
            for (T t : tArr) {
                bind(supportSQLiteStatementAcquire, t);
                listB.add(Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
            }
            return i.a(listB);
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        x.f(tArr, "entities");
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            int length = tArr.length;
            long[] jArr = new long[length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                bind(supportSQLiteStatementAcquire, tArr[i2]);
                jArr[i3] = supportSQLiteStatementAcquire.executeInsert();
                i2++;
                i3 = i4;
            }
            return jArr;
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }
}
