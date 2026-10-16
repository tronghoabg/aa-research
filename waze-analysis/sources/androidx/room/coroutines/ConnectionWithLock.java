package androidx.room.coroutines;

import androidx.collection.LruCache;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.i;
import h.ab;
import h.c.e;
import h.c.j;
import h.g.b.x;
import h.n.o;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.g.f;
import kotlinx.coroutines.h.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ConnectionWithLock implements SQLiteConnection, a {
    private j acquireCoroutineContext;
    private Throwable acquireThrowable;
    private final SQLiteConnection delegate;
    private final a lock;
    private final PreparedStatementCache preparedStatementCache;

    /* compiled from: WazeSource */
    final class CachedStatement implements SQLiteStatement {
        private final SQLiteStatement delegate;

        public CachedStatement(SQLiteStatement sQLiteStatement) {
            x.f(sQLiteStatement, "delegate");
            this.delegate = sQLiteStatement;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo13244bindBlob(int i2, byte[] bArr) {
            x.f(bArr, "value");
            this.delegate.mo13244bindBlob(i2, bArr);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void bindBoolean(int i2, boolean z) {
            this.delegate.bindBoolean(i2, z);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo13245bindDouble(int i2, double d2) {
            this.delegate.mo13245bindDouble(i2, d2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void bindFloat(int i2, float f2) {
            this.delegate.bindFloat(i2, f2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void bindInt(int i2, int i3) {
            this.delegate.bindInt(i2, i3);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo13246bindLong(int i2, long j2) {
            this.delegate.mo13246bindLong(i2, j2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo13247bindNull(int i2) {
            this.delegate.mo13247bindNull(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo13248bindText(int i2, String str) {
            x.f(str, "value");
            this.delegate.mo13248bindText(i2, str);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo13249clearBindings() {
            this.delegate.mo13249clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            this.delegate.reset();
            this.delegate.mo13249clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public byte[] getBlob(int i2) {
            return this.delegate.getBlob(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean getBoolean(int i2) {
            return this.delegate.getBoolean(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i2) {
            return this.delegate.getColumnName(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public List<String> getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i2) {
            return this.delegate.getColumnType(i2);
        }

        public final SQLiteStatement getDelegate() {
            return this.delegate;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i2) {
            return this.delegate.getDouble(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public float getFloat(int i2) {
            return this.delegate.getFloat(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getInt(int i2) {
            return this.delegate.getInt(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i2) {
            return this.delegate.getLong(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getText(int i2) {
            return this.delegate.getText(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i2) {
            return this.delegate.isNull(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            this.delegate.reset();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            return this.delegate.step();
        }
    }

    public ConnectionWithLock(SQLiteConnection sQLiteConnection, a aVar, int i2) {
        x.f(sQLiteConnection, "delegate");
        x.f(aVar, "lock");
        this.delegate = sQLiteConnection;
        this.lock = aVar;
        this.preparedStatementCache = i2 > 0 ? new PreparedStatementCache(i2) : null;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        PreparedStatementCache preparedStatementCache = this.preparedStatementCache;
        if (preparedStatementCache != null) {
            preparedStatementCache.evictAll();
        }
        this.delegate.close();
    }

    public final void dump(StringBuilder sb) {
        x.f(sb, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            sb.append("\t\tStatus: Free connection\n");
        } else {
            sb.append("\t\tStatus: Acquired connection\n");
            j jVar = this.acquireCoroutineContext;
            if (jVar != null) {
                Objects.toString(jVar);
                sb.append("\t\tCoroutine: ".concat(jVar.toString()));
                sb.append('\n');
            }
            Throwable th = this.acquireThrowable;
            if (th != null) {
                sb.append("\t\tAcquired:\n");
                x.f(th, "<this>");
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                x.e(string, "toString(...)");
                Iterator it = i.ab(o.D(string), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t".concat(String.valueOf((String) it.next())));
                    sb.append('\n');
                }
            }
        }
        if (this.preparedStatementCache != null) {
            sb.append("\t\tPrepared Statement Cache Size: " + this.preparedStatementCache.size());
            sb.append('\n');
        }
    }

    @Override // kotlinx.coroutines.h.a
    public f<Object, a> getOnLock() {
        return this.lock.getOnLock();
    }

    @Override // kotlinx.coroutines.h.a
    public boolean holdsLock(Object obj) {
        x.f(obj, "owner");
        return this.lock.holdsLock(obj);
    }

    @Override // androidx.sqlite.SQLiteConnection
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // kotlinx.coroutines.h.a
    public boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // kotlinx.coroutines.h.a
    public Object lock(Object obj, e<? super ab> eVar) {
        return this.lock.lock(obj, eVar);
    }

    public final ConnectionWithLock markAcquired(j jVar) {
        x.f(jVar, "context");
        this.acquireCoroutineContext = jVar;
        this.acquireThrowable = new Throwable();
        return this;
    }

    public final ConnectionWithLock markReleased() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SQLiteStatement prepare(String str) {
        x.f(str, "sql");
        PreparedStatementCache preparedStatementCache = this.preparedStatementCache;
        if (preparedStatementCache == null) {
            return this.delegate.prepare(str);
        }
        SQLiteStatement sQLiteStatement = preparedStatementCache.get(str);
        x.c(sQLiteStatement);
        return new CachedStatement(sQLiteStatement);
    }

    public String toString() {
        return this.delegate.toString();
    }

    @Override // kotlinx.coroutines.h.a
    public boolean tryLock(Object obj) {
        return this.lock.tryLock(obj);
    }

    @Override // kotlinx.coroutines.h.a
    public void unlock(Object obj) {
        this.lock.unlock(obj);
    }

    /* compiled from: WazeSource */
    final class PreparedStatementCache extends LruCache<String, SQLiteStatement> {
        public /* synthetic */ PreparedStatementCache(ConnectionWithLock connectionWithLock, int i2, int i3, h.g.b.o oVar) {
            this(1 == (i3 & 1) ? 25 : i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        public SQLiteStatement create(String str) {
            x.f(str, "key");
            return ConnectionWithLock.this.delegate.prepare(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        public void entryRemoved(boolean z, String str, SQLiteStatement sQLiteStatement, SQLiteStatement sQLiteStatement2) {
            x.f(str, "key");
            x.f(sQLiteStatement, "oldValue");
            sQLiteStatement.close();
            super.entryRemoved(z, (boolean) str, sQLiteStatement, sQLiteStatement2);
        }

        public PreparedStatementCache(int i2) {
            super(i2);
        }
    }

    public /* synthetic */ ConnectionWithLock(SQLiteConnection sQLiteConnection, a aVar, int i2, int i3, h.g.b.o oVar) {
        this(sQLiteConnection, (i3 & 2) != 0 ? kotlinx.coroutines.h.i.c() : aVar, i2);
    }
}
