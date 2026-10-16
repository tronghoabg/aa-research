package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.x;
import h.o.d;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ConnectionPoolImpl implements ConnectionPool {
    private final ConnectionElementKey connectionElementKey;
    private final ThreadLocal<PooledConnectionImpl> connectionThreadLocal;
    private final SQLiteDriver driver;
    private volatile boolean isClosed;
    private int onTimeout;
    private final Pool readers;
    private long timeout;
    private final Pool writers;

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1, reason: invalid class name */
    final class AnonymousClass1<R> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ p<Transactor, e, Object> $block;
        final /* synthetic */ PooledConnectionImpl $confinedConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super Transactor, ? super e, ? extends Object> pVar, PooledConnectionImpl pooledConnectionImpl, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$block = pVar;
            this.$confinedConnection = pooledConnectionImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$block, this.$confinedConnection, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            p<Transactor, e, Object> pVar = this.$block;
            PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
            this.label = 1;
            Object objInvoke = pVar.invoke(pooledConnectionImpl, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements p<af, e, Object> {
        final /* synthetic */ p<Transactor, e, Object> $block;
        final /* synthetic */ aq<PooledConnectionImpl> $connection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(p<? super Transactor, ? super e, ? extends Object> pVar, aq<PooledConnectionImpl> aqVar, e<? super AnonymousClass4> eVar) {
            super(2, eVar);
            this.$block = pVar;
            this.$connection = aqVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass4(this.$block, this.$connection, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            p<Transactor, e, Object> pVar = this.$block;
            Object obj2 = this.$connection.f48105a;
            this.label = 1;
            Object objInvoke = pVar.invoke(obj2, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    public ConnectionPoolImpl(final SQLiteDriver sQLiteDriver, final String str, int i2, int i3, int i4) {
        x.f(sQLiteDriver, "driver");
        x.f(str, "fileName");
        this.connectionElementKey = new ConnectionElementKey();
        this.connectionThreadLocal = new ThreadLocal<>();
        h.o.c cVar = h.o.a.f48264a;
        this.timeout = h.o.c.i(30, d.f48273d);
        this.onTimeout = 2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
        }
        this.driver = sQLiteDriver;
        this.readers = new Pool(i2, new h.g.a.a() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ConnectionPoolImpl._init_$lambda$4(sQLiteDriver, str);
            }
        }, i4);
        this.writers = new Pool(i3, new h.g.a.a() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return sQLiteDriver.open(str);
            }
        }, i4);
    }

    static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) throws Exception {
        SQLiteConnection sQLiteConnectionOpen = sQLiteDriver.open(str);
        SQLite.execSQL(sQLiteConnectionOpen, "PRAGMA query_only = 1");
        return sQLiteConnectionOpen;
    }

    private final j createConnectionContext(PooledConnectionImpl pooledConnectionImpl) {
        return new ConnectionElement(this.connectionElementKey, pooledConnectionImpl).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.connectionThreadLocal, pooledConnectionImpl));
    }

    private final void onTimeout(boolean z) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Timed out attempting to acquire a ");
        sb2.append(true != z ? "writer" : "reader");
        sb2.append(" connection.");
        sb.append(sb2.toString());
        sb.append("\n\nWriter pool:\n");
        this.writers.dump(sb);
        sb.append("Reader pool:\n");
        this.readers.dump(sb);
        try {
            SQLite.throwSQLiteException(5, sb.toString());
            throw new h.e();
        } catch (SQLException e2) {
            int i2 = this.onTimeout;
            if (i2 == 1) {
                throw e2;
            }
            if (i2 != 2) {
                return;
            }
            e2.printStackTrace();
        }
    }

    static final ab useConnection$lambda$6(ConnectionPoolImpl connectionPoolImpl, boolean z) {
        connectionPoolImpl.onTimeout(z);
        return ab.f48028a;
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.readers.close();
        this.writers.close();
    }

    public final int getOnTimeout$room_runtime() {
        return this.onTimeout;
    }

    /* renamed from: getTimeout-UwyO8pc$room_runtime, reason: not valid java name */
    public final long m13235getTimeoutUwyO8pc$room_runtime() {
        return this.timeout;
    }

    public final void setOnTimeout$room_runtime(int i2) {
        this.onTimeout = i2;
    }

    /* renamed from: setTimeout-LRDsOJo$room_runtime, reason: not valid java name */
    public final void m13236setTimeoutLRDsOJo$room_runtime(long j2) {
        this.timeout = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0140 A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #0 {all -> 0x0183, blocks: (B:63:0x0124, B:68:0x0135, B:70:0x0140, B:77:0x017b, B:78:0x0182), top: B:96:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #0 {all -> 0x0183, blocks: (B:63:0x0124, B:68:0x0135, B:70:0x0140, B:77:0x017b, B:78:0x0182), top: B:96:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // androidx.room.coroutines.ConnectionPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object useConnection(boolean r18, h.g.a.p<? super androidx.room.Transactor, ? super h.c.e<? super R>, ? extends java.lang.Object> r19, h.c.e<? super R> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.useConnection(boolean, h.g.a.p, h.c.e):java.lang.Object");
    }

    public ConnectionPoolImpl(final SQLiteDriver sQLiteDriver, final String str, int i2) {
        x.f(sQLiteDriver, "driver");
        x.f(str, "fileName");
        this.connectionElementKey = new ConnectionElementKey();
        this.connectionThreadLocal = new ThreadLocal<>();
        h.o.c cVar = h.o.a.f48264a;
        this.timeout = h.o.c.i(30, d.f48273d);
        this.onTimeout = 2;
        this.driver = sQLiteDriver;
        Pool pool = new Pool(1, new h.g.a.a() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return sQLiteDriver.open(str);
            }
        }, i2);
        this.readers = pool;
        this.writers = pool;
    }
}
