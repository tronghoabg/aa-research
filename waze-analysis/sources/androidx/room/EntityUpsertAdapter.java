package androidx.room;

import android.database.SQLException;
import androidx.sqlite.SQLiteConnection;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EntityUpsertAdapter<T> {
    public static final Companion Companion = new Companion(null);
    private static final String ErrorMsg = "unique";
    private static final String SQLITE_CONSTRAINT_PRIMARYKEY = "1555";
    private static final String SQLITE_CONSTRAINT_UNIQUE = "2067";
    private final EntityInsertAdapter<T> entityInsertAdapter;
    private final EntityDeleteOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertAdapter(EntityInsertAdapter<T> entityInsertAdapter, EntityDeleteOrUpdateAdapter<T> entityDeleteOrUpdateAdapter) {
        x.f(entityInsertAdapter, "entityInsertAdapter");
        x.f(entityDeleteOrUpdateAdapter, "updateAdapter");
        this.entityInsertAdapter = entityInsertAdapter;
        this.updateAdapter = entityDeleteOrUpdateAdapter;
    }

    private final void checkUniquenessException(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        String str = message;
        if (!o.F(str, ErrorMsg, true) && !o.F(str, SQLITE_CONSTRAINT_UNIQUE, false) && !o.F(str, SQLITE_CONSTRAINT_PRIMARYKEY, false)) {
            throw sQLException;
        }
    }

    public final void upsert(SQLiteConnection sQLiteConnection, Iterable<? extends T> iterable) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (iterable == null) {
            return;
        }
        for (T t : iterable) {
            try {
                this.entityInsertAdapter.insert(sQLiteConnection, (SQLiteConnection) t);
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(sQLiteConnection, t);
            }
        }
    }

    public final long upsertAndReturnId(SQLiteConnection sQLiteConnection, T t) throws Exception {
        x.f(sQLiteConnection, "connection");
        try {
            return this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, t);
        } catch (SQLException e2) {
            this.checkUniquenessException(e2);
            this.updateAdapter.handle(sQLiteConnection, t);
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long[] upsertAndReturnIdsArray(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long jInsertAndReturnId;
        x.f(sQLiteConnection, "connection");
        if (collection == null) {
            return new long[0];
        }
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, i.N(collection, i2));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(sQLiteConnection, i.N(collection, i2));
                jInsertAndReturnId = -1;
            }
            jArr[i2] = jInsertAndReturnId;
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        long jInsertAndReturnId;
        x.f(sQLiteConnection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i2 = 0; i2 < size; i2++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, i.N(collection, i2));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(sQLiteConnection, i.N(collection, i2));
                jInsertAndReturnId = -1;
            }
            lArr[i2] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection sQLiteConnection, Collection<? extends T> collection) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (collection == null) {
            return i.h();
        }
        List listB = i.b();
        for (T t : collection) {
            try {
                listB.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, t)));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(sQLiteConnection, t);
                listB.add(-1L);
            }
        }
        return i.a(listB);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public final void upsert(SQLiteConnection sQLiteConnection, T t) throws Exception {
        x.f(sQLiteConnection, "connection");
        try {
            this.entityInsertAdapter.insert(sQLiteConnection, (SQLiteConnection) t);
        } catch (SQLException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(sQLiteConnection, t);
        }
    }

    public final void upsert(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (tArr != null) {
            for (T t : tArr) {
                try {
                    this.entityInsertAdapter.insert(sQLiteConnection, (SQLiteConnection) t);
                } catch (SQLException e2) {
                    checkUniquenessException(e2);
                    this.updateAdapter.handle(sQLiteConnection, t);
                }
            }
        }
    }

    public final long[] upsertAndReturnIdsArray(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long jInsertAndReturnId;
        x.f(sQLiteConnection, "connection");
        if (tArr == null) {
            return new long[0];
        }
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, tArr[i2]);
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(sQLiteConnection, tArr[i2]);
                jInsertAndReturnId = -1;
            }
            jArr[i2] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        long jInsertAndReturnId;
        x.f(sQLiteConnection, "connection");
        if (tArr == null) {
            return new Long[0];
        }
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jInsertAndReturnId = this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, tArr[i2]);
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(sQLiteConnection, tArr[i2]);
                jInsertAndReturnId = -1;
            }
            lArr[i2] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(SQLiteConnection sQLiteConnection, T[] tArr) throws Exception {
        x.f(sQLiteConnection, "connection");
        if (tArr == null) {
            return i.h();
        }
        List listB = i.b();
        for (T t : tArr) {
            try {
                listB.add(Long.valueOf(this.entityInsertAdapter.insertAndReturnId(sQLiteConnection, t)));
            } catch (SQLException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(sQLiteConnection, t);
                listB.add(-1L);
            }
        }
        return i.a(listB);
    }
}
