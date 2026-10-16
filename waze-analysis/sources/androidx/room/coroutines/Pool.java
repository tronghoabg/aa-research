package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import h.a.i;
import h.a.u;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.h.j;
import kotlinx.coroutines.h.m;
import kotlinx.coroutines.h.n;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class Pool {
    private final u<ConnectionWithLock> availableConnections;
    private final int capacity;
    private final a<SQLiteConnection> connectionFactory;
    private final j connectionPermits;
    private final ConnectionWithLock[] connections;
    private boolean isClosed;
    private final ReentrantLock lock;
    private final int preparedStatementCacheSize;
    private int size;

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.Pool$acquire$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Pool.this.acquire(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pool(int i2, a<? extends SQLiteConnection> aVar, int i3) {
        x.f(aVar, "connectionFactory");
        this.capacity = i2;
        this.connectionFactory = aVar;
        this.preparedStatementCacheSize = i3;
        this.lock = new ReentrantLock();
        this.connections = new ConnectionWithLock[i2];
        int i4 = n.f52041a;
        this.connectionPermits = new m(i2, 0);
        this.availableConnections = new u<>(i2);
    }

    private final void tryOpenNewConnectionLocked() {
        if (this.size >= this.capacity) {
            return;
        }
        ConnectionWithLock connectionWithLock = new ConnectionWithLock(this.connectionFactory.invoke(), null, this.preparedStatementCacheSize, 2, null);
        ConnectionWithLock[] connectionWithLockArr = this.connections;
        int i2 = this.size;
        this.size = i2 + 1;
        connectionWithLockArr[i2] = connectionWithLock;
        this.availableConnections.addLast(connectionWithLock);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquire(h.c.e<? super androidx.room.coroutines.ConnectionWithLock> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.room.coroutines.Pool.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.room.coroutines.Pool$acquire$1 r0 = (androidx.room.coroutines.Pool.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquire$1 r0 = new androidx.room.coroutines.Pool$acquire$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            kotlinx.coroutines.h.j r5 = r4.connectionPermits
            r0.label = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L75
        L3c:
            java.util.concurrent.locks.ReentrantLock r5 = r4.lock     // Catch: java.lang.Throwable -> L6e
            r5.lock()     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r4.isClosed     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L5c
            h.a.u<androidx.room.coroutines.ConnectionWithLock> r0 = r4.availableConnections     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L50
            r4.tryOpenNewConnectionLocked()     // Catch: java.lang.Throwable -> L69
        L50:
            h.a.u<androidx.room.coroutines.ConnectionWithLock> r0 = r4.availableConnections     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L69
            androidx.room.coroutines.ConnectionWithLock r0 = (androidx.room.coroutines.ConnectionWithLock) r0     // Catch: java.lang.Throwable -> L69
            r5.unlock()     // Catch: java.lang.Throwable -> L6e
            return r0
        L5c:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            androidx.sqlite.SQLite.throwSQLiteException(r1, r0)     // Catch: java.lang.Throwable -> L69
            h.e r0 = new h.e     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            throw r0     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            r5.unlock()     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6e:
            r5 = move-exception
            kotlinx.coroutines.h.j r4 = r4.connectionPermits
            r4.d()
            throw r5
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.acquire(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:46|28|(1:(1:36)(2:32|(1:35)))(1:30)|34|19|42|20|(10:22|23|46|28|(0)(0)|34|19|42|20|(1:24)(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r11 = r11;
        r10 = r10;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:28:0x006b, B:30:0x006f, B:32:0x0075, B:36:0x007c), top: B:46:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:23:0x005b). Please report as a decompilation issue!!! */
    /* renamed from: acquireWithTimeout-KLykuaI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13237acquireWithTimeoutKLykuaI(long r8, h.g.a.a<h.ab> r10, h.c.e<? super androidx.room.coroutines.ConnectionWithLock> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof androidx.room.coroutines.Pool$acquireWithTimeout$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = (androidx.room.coroutines.Pool$acquireWithTimeout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = new androidx.room.coroutines.Pool$acquireWithTimeout$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$1
            h.g.b.aq r10 = (h.g.b.aq) r10
            java.lang.Object r2 = r0.L$0
            h.g.a.a r2 = (h.g.a.a) r2
            e.b.c.b(r11)     // Catch: java.lang.Throwable -> L32
            goto L5b
        L32:
            r11 = move-exception
            goto L66
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            e.b.c.b(r11)
        L3f:
            h.g.b.aq r11 = new h.g.b.aq
            r11.<init>()
            androidx.room.coroutines.Pool$acquireWithTimeout$2 r2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2     // Catch: java.lang.Throwable -> L61
            r2.<init>(r11, r7, r3)     // Catch: java.lang.Throwable -> L61
            h.g.a.p r2 = (h.g.a.p) r2     // Catch: java.lang.Throwable -> L61
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L61
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L61
            r0.J$0 = r8     // Catch: java.lang.Throwable -> L61
            r0.label = r4     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = kotlinx.coroutines.aj.H(r8, r2, r0)     // Catch: java.lang.Throwable -> L61
            if (r2 == r1) goto L60
            r2 = r10
            r10 = r11
        L5b:
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r3
            goto L6b
        L60:
            return r1
        L61:
            r2 = move-exception
            r6 = r2
            r2 = r10
            r10 = r11
            r11 = r6
        L66:
            r6 = r11
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r6
        L6b:
            boolean r5 = r0 instanceof kotlinx.coroutines.df     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L73
            r10.invoke()     // Catch: java.lang.Throwable -> L7d
            goto L79
        L73:
            if (r0 != 0) goto L7c
            java.lang.Object r11 = r11.f48105a     // Catch: java.lang.Throwable -> L7d
            if (r11 != 0) goto L7b
        L79:
            r0 = r2
            goto L3f
        L7b:
            return r11
        L7c:
            throw r0     // Catch: java.lang.Throwable -> L7d
        L7d:
            r8 = move-exception
            java.lang.Object r9 = r11.f48105a
            androidx.room.coroutines.ConnectionWithLock r9 = (androidx.room.coroutines.ConnectionWithLock) r9
            if (r9 == 0) goto L87
            r7.recycle(r9)
        L87:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.m13237acquireWithTimeoutKLykuaI(long, h.g.a.a, h.c.e):java.lang.Object");
    }

    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (ConnectionWithLock connectionWithLock : this.connections) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void dump(StringBuilder sb) {
        x.f(sb, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listB = i.b();
            int size = this.availableConnections.size();
            for (int i2 = 0; i2 < size; i2++) {
                listB.add(this.availableConnections.get(i2));
            }
            List listA = i.a(listB);
            sb.append('\t' + super.toString() + " (");
            sb.append("capacity=" + this.capacity + ", ");
            sb.append("permits=" + this.connectionPermits.b() + ", ");
            sb.append("queue=(size=" + listA.size() + ")[" + i.aM(listA, null, null, null, 0, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            ConnectionWithLock[] connectionWithLockArr = this.connections;
            int length = connectionWithLockArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                ConnectionWithLock connectionWithLock = connectionWithLockArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(connectionWithLock != null ? connectionWithLock.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (connectionWithLock != null) {
                    connectionWithLock.dump(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final a<SQLiteConnection> getConnectionFactory() {
        return this.connectionFactory;
    }

    public final int getPreparedStatementCacheSize() {
        return this.preparedStatementCacheSize;
    }

    public final void recycle(ConnectionWithLock connectionWithLock) {
        x.f(connectionWithLock, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connectionWithLock);
            reentrantLock.unlock();
            this.connectionPermits.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
