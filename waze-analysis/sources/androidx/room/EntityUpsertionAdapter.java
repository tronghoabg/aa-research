package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EntityUpsertionAdapter<T> {
    private final EntityInsertionAdapter<T> insertionAdapter;
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(EntityInsertionAdapter<T> entityInsertionAdapter, EntityDeletionOrUpdateAdapter<T> entityDeletionOrUpdateAdapter) {
        x.f(entityInsertionAdapter, "insertionAdapter");
        x.f(entityDeletionOrUpdateAdapter, "updateAdapter");
        this.insertionAdapter = entityInsertionAdapter;
        this.updateAdapter = entityDeletionOrUpdateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        String str = message;
        if (!o.F(str, "unique", true) && !o.F(str, "2067", false) && !o.F(str, "1555", false)) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(Iterable<? extends T> iterable) {
        x.f(iterable, "entities");
        for (T t : iterable) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
            }
        }
    }

    public final long upsertAndReturnId(T t) {
        try {
            return this.insertionAdapter.insertAndReturnId(t);
        } catch (SQLiteConstraintException e2) {
            this.checkUniquenessException(e2);
            this.updateAdapter.handle(t);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(Collection<? extends T> collection) {
        long jInsertAndReturnId;
        x.f(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i2] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        long jInsertAndReturnId;
        x.f(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i2 = 0; i2 < size; i2++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i2] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(Collection<? extends T> collection) {
        x.f(collection, "entities");
        List listB = i.b();
        for (T t : collection) {
            try {
                listB.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
                listB.add(-1L);
            }
        }
        return i.a(listB);
    }

    public final void upsert(T t) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
        } catch (SQLiteConstraintException e2) {
            checkUniquenessException(e2);
            this.updateAdapter.handle(t);
        }
    }

    public final void upsert(T[] tArr) {
        x.f(tArr, "entities");
        for (T t : tArr) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
            }
        }
    }

    public final long[] upsertAndReturnIdsArray(T[] tArr) {
        long jInsertAndReturnId;
        x.f(tArr, "entities");
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(tArr[i2]);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(tArr[i2]);
                jInsertAndReturnId = -1;
            }
            jArr[i2] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(T[] tArr) {
        long jInsertAndReturnId;
        x.f(tArr, "entities");
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(tArr[i2]);
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(tArr[i2]);
                jInsertAndReturnId = -1;
            }
            lArr[i2] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(T[] tArr) {
        x.f(tArr, "entities");
        List listB = i.b();
        for (T t : tArr) {
            try {
                listB.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e2) {
                checkUniquenessException(e2);
                this.updateAdapter.handle(t);
                listB.add(-1L);
            }
        }
        return i.a(listB);
    }
}
