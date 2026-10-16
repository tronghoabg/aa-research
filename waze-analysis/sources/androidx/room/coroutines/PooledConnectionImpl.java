package androidx.room.coroutines;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.u;
import h.c.b.a.c;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class PooledConnectionImpl implements Transactor, RawConnectionAccessor {
    private final ConnectionElementKey connectionElementKey;
    private final ConnectionWithLock delegate;
    private final boolean isReadOnly;
    private volatile boolean isRecycled;
    private final u<TransactionItem> transactionStack;

    /* compiled from: WazeSource */
    final class StatementWrapper implements SQLiteStatement {
        private final SQLiteStatement delegate;
        final /* synthetic */ PooledConnectionImpl this$0;
        private final long threadId;

        public StatementWrapper(PooledConnectionImpl pooledConnectionImpl, SQLiteStatement sQLiteStatement) {
            x.f(sQLiteStatement, "delegate");
            this.this$0 = pooledConnectionImpl;
            this.delegate = sQLiteStatement;
            this.threadId = ThreadLocal_jvmAndroidKt.currentThreadId();
        }

        private final <R> R withStateCheck(a<? extends R> aVar) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return aVar.invoke();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo13244bindBlob(int i2, byte[] bArr) {
            x.f(bArr, "value");
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo13244bindBlob(i2, bArr);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindBoolean(int i2, boolean z) {
            mo13246bindLong(i2, true != this ? 0L : 1L);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo13245bindDouble(int i2, double d2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo13245bindDouble(i2, d2);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindFloat(int i2, float f2) {
            mo13245bindDouble(i2, f2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindInt(int i2, int i3) {
            mo13246bindLong(i2, i3);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo13246bindLong(int i2, long j2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo13246bindLong(i2, j2);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo13247bindNull(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo13247bindNull(i2);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo13248bindText(int i2, String str) {
            x.f(str, "value");
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo13248bindText(i2, str);
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo13249clearBindings() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.mo13249clearBindings();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.close();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public byte[] getBlob(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getBlob(i2);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ boolean getBoolean(int i2) {
            return SQLiteStatement.CC.$default$getBoolean(this, i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnCount();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnName(i2);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ List getColumnNames() {
            return SQLiteStatement.CC.$default$getColumnNames(this);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnType(i2);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getDouble(i2);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ float getFloat(int i2) {
            return SQLiteStatement.CC.$default$getFloat(this, i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ int getInt(int i2) {
            return SQLiteStatement.CC.$default$getInt(this, i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getLong(i2);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getText(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getText(i2);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i2) {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.isNull(i2);
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.reset();
            } else {
                SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw new e();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            if (this.this$0.isRecycled) {
                SQLite.throwSQLiteException(21, "Statement is recycled");
                throw new e();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.step();
            }
            SQLite.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw new e();
        }
    }

    /* compiled from: WazeSource */
    final class TransactionImpl<T> implements TransactionScope<T>, RawConnectionAccessor {
        public TransactionImpl() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public SQLiteConnection getRawConnection() {
            return PooledConnectionImpl.this.getRawConnection();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.room.TransactionScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object rollback(T r7, h.c.e<?> r8) throws androidx.room.coroutines.ConnectionPool.RollbackException {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L2c
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2c:
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.h.a r6 = (kotlinx.coroutines.h.a) r6
                java.lang.Object r7 = r0.L$1
                androidx.room.coroutines.PooledConnectionImpl r7 = (androidx.room.coroutines.PooledConnectionImpl) r7
                java.lang.Object r0 = r0.L$0
                e.b.c.b(r8)
                goto L81
            L3a:
                e.b.c.b(r8)
                androidx.room.coroutines.PooledConnectionImpl r6 = androidx.room.coroutines.PooledConnectionImpl.this
                boolean r8 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled$p(r6)
                r2 = 21
                if (r8 != 0) goto Laf
                h.c.j r8 = r0.getContext()
                androidx.room.coroutines.ConnectionElementKey r5 = r6.getConnectionElementKey()
                h.c.i r5 = (h.c.i) r5
                h.c.h r8 = r8.get(r5)
                androidx.room.coroutines.ConnectionElement r8 = (androidx.room.coroutines.ConnectionElement) r8
                if (r8 == 0) goto La4
                androidx.room.coroutines.PooledConnectionImpl r8 = r8.getConnectionWrapper()
                if (r8 != r6) goto La4
                h.a.u r8 = androidx.room.coroutines.PooledConnectionImpl.access$getTransactionStack$p(r6)
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L9c
                androidx.room.coroutines.ConnectionWithLock r8 = r6.getDelegate()
                kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
                r0.L$0 = r7
                r0.L$1 = r6
                r0.L$2 = r8
                r0.label = r4
                java.lang.Object r0 = r8.lock(r3, r0)
                if (r0 != r1) goto L7e
                return r1
            L7e:
                r0 = r7
                r7 = r6
                r6 = r8
            L81:
                h.a.u r7 = androidx.room.coroutines.PooledConnectionImpl.access$getTransactionStack$p(r7)     // Catch: java.lang.Throwable -> L97
                java.lang.Object r7 = r7.c()     // Catch: java.lang.Throwable -> L97
                androidx.room.coroutines.PooledConnectionImpl$TransactionItem r7 = (androidx.room.coroutines.PooledConnectionImpl.TransactionItem) r7     // Catch: java.lang.Throwable -> L97
                r7.setShouldRollback(r4)     // Catch: java.lang.Throwable -> L97
                r6.unlock(r3)
                androidx.room.coroutines.ConnectionPool$RollbackException r6 = new androidx.room.coroutines.ConnectionPool$RollbackException
                r6.<init>(r0)
                throw r6
            L97:
                r7 = move-exception
                r6.unlock(r3)
                throw r7
            L9c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Not in a transaction"
                r6.<init>(r7)
                throw r6
            La4:
                java.lang.String r6 = "Attempted to use connection on a different coroutine"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r6)
                h.e r6 = new h.e
                r6.<init>()
                throw r6
            Laf:
                java.lang.String r6 = "Connection is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r6)
                h.e r6 = new h.e
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.TransactionImpl.rollback(java.lang.Object, h.c.e):java.lang.Object");
        }

        @Override // androidx.room.PooledConnection
        public <R> Object usePrepared(String str, l<? super SQLiteStatement, ? extends R> lVar, h.c.e<? super R> eVar) {
            return PooledConnectionImpl.this.usePrepared(str, lVar, eVar);
        }

        @Override // androidx.room.TransactionScope
        public <R> Object withNestedTransaction(p<? super TransactionScope<R>, ? super h.c.e<? super R>, ? extends Object> pVar, h.c.e<? super R> eVar) {
            PooledConnectionImpl pooledConnectionImpl = PooledConnectionImpl.this;
            if (pooledConnectionImpl.isRecycled) {
                SQLite.throwSQLiteException(21, "Connection is recycled");
                throw new e();
            }
            ConnectionElement connectionElement = (ConnectionElement) eVar.getContext().get(pooledConnectionImpl.getConnectionElementKey());
            if (connectionElement != null && connectionElement.getConnectionWrapper() == pooledConnectionImpl) {
                return PooledConnectionImpl.this.transaction(null, pVar, eVar);
            }
            SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
            throw new e();
        }
    }

    /* compiled from: WazeSource */
    final class TransactionItem {
        private final int id;
        private boolean shouldRollback;

        public TransactionItem(int i2, boolean z) {
            this.id = i2;
            this.shouldRollback = z;
        }

        public final int getId() {
            return this.id;
        }

        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }

        public final void setShouldRollback(boolean z) {
            this.shouldRollback = z;
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.beginTransaction(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PooledConnectionImpl$endTransaction$1, reason: invalid class name and case insensitive filesystem */
    final class C04581 extends c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C04581(h.c.e<? super C04581> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.endTransaction(false, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PooledConnectionImpl$transaction$1, reason: invalid class name and case insensitive filesystem */
    final class C04591<R> extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04591(h.c.e<? super C04591> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.transaction(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PooledConnectionImpl$usePrepared$1, reason: invalid class name and case insensitive filesystem */
    final class C04601<R> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04601(h.c.e<? super C04601> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PooledConnectionImpl.this.usePrepared(null, null, this);
        }
    }

    public PooledConnectionImpl(ConnectionElementKey connectionElementKey, ConnectionWithLock connectionWithLock, boolean z) {
        x.f(connectionElementKey, "connectionElementKey");
        x.f(connectionWithLock, "delegate");
        this.connectionElementKey = connectionElementKey;
        this.delegate = connectionWithLock;
        this.isReadOnly = z;
        this.transactionStack = new u<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r7v14, types: [kotlinx.coroutines.h.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object beginTransaction(androidx.room.Transactor.SQLiteTransactionType r7, h.c.e<? super h.ab> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r8 instanceof androidx.room.coroutines.PooledConnectionImpl.AnonymousClass1
            if (r1 == 0) goto L15
            r1 = r8
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r1 = (androidx.room.coroutines.PooledConnectionImpl.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r1 = new androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r1.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 != r5) goto L34
            java.lang.Object r7 = r1.L$1
            kotlinx.coroutines.h.a r7 = (kotlinx.coroutines.h.a) r7
            java.lang.Object r1 = r1.L$0
            androidx.room.Transactor$SQLiteTransactionType r1 = (androidx.room.Transactor.SQLiteTransactionType) r1
            e.b.c.b(r8)
            r8 = r7
            r7 = r1
            goto L4f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            e.b.c.b(r8)
            androidx.room.coroutines.ConnectionWithLock r8 = r6.delegate
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            r1.L$0 = r7
            r1.L$1 = r8
            r1.label = r5
            java.lang.Object r1 = r8.lock(r4, r1)
            if (r1 == r2) goto Lbc
        L4f:
            h.a.u<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r1 = r6.transactionStack     // Catch: java.lang.Throwable -> Lb7
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lb7
            h.a.u<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r2 = r6.transactionStack     // Catch: java.lang.Throwable -> Lb7
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto L8e
            androidx.room.Transactor$SQLiteTransactionType r0 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED     // Catch: java.lang.Throwable -> Lb7
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto L84
            if (r7 == r5) goto L7a
            r0 = 2
            if (r7 != r0) goto L74
            androidx.room.coroutines.ConnectionWithLock r7 = r6.delegate     // Catch: java.lang.Throwable -> Lb7
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "BEGIN EXCLUSIVE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r7, r0)     // Catch: java.lang.Throwable -> Lb7
            goto La6
        L74:
            h.i r6 = new h.i     // Catch: java.lang.Throwable -> Lb7
            r6.<init>()     // Catch: java.lang.Throwable -> Lb7
            throw r6     // Catch: java.lang.Throwable -> Lb7
        L7a:
            androidx.room.coroutines.ConnectionWithLock r7 = r6.delegate     // Catch: java.lang.Throwable -> Lb7
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "BEGIN IMMEDIATE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r7, r0)     // Catch: java.lang.Throwable -> Lb7
            goto La6
        L84:
            androidx.room.coroutines.ConnectionWithLock r7 = r6.delegate     // Catch: java.lang.Throwable -> Lb7
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "BEGIN DEFERRED TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r7, r0)     // Catch: java.lang.Throwable -> Lb7
            goto La6
        L8e:
            androidx.room.coroutines.ConnectionWithLock r7 = r6.delegate     // Catch: java.lang.Throwable -> Lb7
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb7
            r0 = 39
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb7
            androidx.sqlite.SQLite.execSQL(r7, r0)     // Catch: java.lang.Throwable -> Lb7
        La6:
            h.a.u<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r6 = r6.transactionStack     // Catch: java.lang.Throwable -> Lb7
            androidx.room.coroutines.PooledConnectionImpl$TransactionItem r7 = new androidx.room.coroutines.PooledConnectionImpl$TransactionItem     // Catch: java.lang.Throwable -> Lb7
            r0 = 0
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lb7
            r6.addLast(r7)     // Catch: java.lang.Throwable -> Lb7
            h.ab r6 = h.ab.f48028a     // Catch: java.lang.Throwable -> Lb7
            r8.unlock(r4)
            return r6
        Lb7:
            r6 = move-exception
            r8.unlock(r4)
            throw r6
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.beginTransaction(androidx.room.Transactor$SQLiteTransactionType, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object endTransaction(boolean r8, h.c.e<? super h.ab> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "RELEASE SAVEPOINT '"
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            boolean r2 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl.C04581
            if (r2 == 0) goto L17
            r2 = r9
            androidx.room.coroutines.PooledConnectionImpl$endTransaction$1 r2 = (androidx.room.coroutines.PooledConnectionImpl.C04581) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            androidx.room.coroutines.PooledConnectionImpl$endTransaction$1 r2 = new androidx.room.coroutines.PooledConnectionImpl$endTransaction$1
            r2.<init>(r9)
        L1c:
            java.lang.Object r9 = r2.result
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r2.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            boolean r8 = r2.Z$0
            java.lang.Object r2 = r2.L$0
            kotlinx.coroutines.h.a r2 = (kotlinx.coroutines.h.a) r2
            e.b.c.b(r9)
            goto L4e
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            e.b.c.b(r9)
            androidx.room.coroutines.ConnectionWithLock r9 = r7.delegate
            kotlinx.coroutines.h.a r9 = (kotlinx.coroutines.h.a) r9
            r2.L$0 = r9
            r2.Z$0 = r8
            r2.label = r5
            java.lang.Object r2 = r9.lock(r6, r2)
            if (r2 == r3) goto Ld2
            r2 = r9
        L4e:
            h.a.u<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r9 = r7.transactionStack     // Catch: java.lang.Throwable -> Lcd
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> Lcd
            if (r9 != 0) goto Lc5
            h.a.u<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r9 = r7.transactionStack     // Catch: java.lang.Throwable -> Lcd
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r9 = h.a.i.w(r9)     // Catch: java.lang.Throwable -> Lcd
            androidx.room.coroutines.PooledConnectionImpl$TransactionItem r9 = (androidx.room.coroutines.PooledConnectionImpl.TransactionItem) r9     // Catch: java.lang.Throwable -> Lcd
            r3 = 39
            if (r8 == 0) goto L95
            boolean r8 = r9.getShouldRollback()     // Catch: java.lang.Throwable -> Lcd
            if (r8 != 0) goto L95
            h.a.u<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r8 = r7.transactionStack     // Catch: java.lang.Throwable -> Lcd
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lcd
            androidx.room.coroutines.ConnectionWithLock r7 = r7.delegate
            if (r8 == 0) goto L7c
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = "END TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r7, r8)     // Catch: java.lang.Throwable -> Lcd
            goto Lbf
        L7c:
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            int r9 = r9.getId()     // Catch: java.lang.Throwable -> Lcd
            r8.append(r9)     // Catch: java.lang.Throwable -> Lcd
            r8.append(r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lcd
            androidx.sqlite.SQLite.execSQL(r7, r8)     // Catch: java.lang.Throwable -> Lcd
            goto Lbf
        L95:
            h.a.u<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r8 = r7.transactionStack     // Catch: java.lang.Throwable -> Lcd
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lcd
            androidx.room.coroutines.ConnectionWithLock r7 = r7.delegate
            if (r8 == 0) goto La7
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r7, r8)     // Catch: java.lang.Throwable -> Lcd
            goto Lbf
        La7:
            androidx.sqlite.SQLiteConnection r7 = (androidx.sqlite.SQLiteConnection) r7     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lcd
            int r9 = r9.getId()     // Catch: java.lang.Throwable -> Lcd
            r8.append(r9)     // Catch: java.lang.Throwable -> Lcd
            r8.append(r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lcd
            androidx.sqlite.SQLite.execSQL(r7, r8)     // Catch: java.lang.Throwable -> Lcd
        Lbf:
            h.ab r7 = h.ab.f48028a     // Catch: java.lang.Throwable -> Lcd
            r2.unlock(r6)
            return r7
        Lc5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = "Not in a transaction"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lcd
            throw r7     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            r7 = move-exception
            r2.unlock(r6)
            throw r7
        Ld2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.endTransaction(boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r11, h.g.a.p<? super androidx.room.TransactionScope<R>, ? super h.c.e<? super R>, ? extends java.lang.Object> r12, h.c.e<? super R> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.transaction(androidx.room.Transactor$SQLiteTransactionType, h.g.a.p, h.c.e):java.lang.Object");
    }

    private final <R> Object withStateCheck(a<? extends R> aVar, h.c.e<? super R> eVar) {
        if (!this.isRecycled) {
            throw null;
        }
        SQLite.throwSQLiteException(21, "Connection is recycled");
        throw new e();
    }

    public final ConnectionElementKey getConnectionElementKey() {
        return this.connectionElementKey;
    }

    public final ConnectionWithLock getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    public Object inTransaction(h.c.e<? super Boolean> eVar) {
        if (this.isRecycled) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new e();
        }
        ConnectionElement connectionElement = (ConnectionElement) eVar.getContext().get(getConnectionElementKey());
        if (connectionElement == null || connectionElement.getConnectionWrapper() != this) {
            SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
            throw new e();
        }
        boolean z = true;
        if (this.transactionStack.isEmpty() && !this.delegate.inTransaction()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public final void markRecycled() throws Exception {
        if (this.isRecycled) {
            return;
        }
        this.isRecycled = true;
        if (this.delegate.inTransaction()) {
            SQLite.execSQL(this.delegate, "ROLLBACK TRANSACTION");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [kotlinx.coroutines.h.a] */
    @Override // androidx.room.PooledConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object usePrepared(java.lang.String r7, h.g.a.l<? super androidx.sqlite.SQLiteStatement, ? extends R> r8, h.c.e<? super R> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl.C04601
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = (androidx.room.coroutines.PooledConnectionImpl.C04601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$usePrepared$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.h.a r7 = (kotlinx.coroutines.h.a) r7
            java.lang.Object r8 = r0.L$1
            h.g.a.l r8 = (h.g.a.l) r8
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r9)
            r9 = r7
            r7 = r0
            goto L73
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            e.b.c.b(r9)
            boolean r9 = access$isRecycled$p(r6)
            r2 = 21
            if (r9 != 0) goto La6
            h.c.j r9 = r0.getContext()
            androidx.room.coroutines.ConnectionElementKey r5 = r6.getConnectionElementKey()
            h.c.i r5 = (h.c.i) r5
            h.c.h r9 = r9.get(r5)
            androidx.room.coroutines.ConnectionElement r9 = (androidx.room.coroutines.ConnectionElement) r9
            if (r9 == 0) goto L9b
            androidx.room.coroutines.PooledConnectionImpl r9 = r9.getConnectionWrapper()
            if (r9 != r6) goto L9b
            androidx.room.coroutines.ConnectionWithLock r9 = r6.delegate
            kotlinx.coroutines.h.a r9 = (kotlinx.coroutines.h.a) r9
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 == r1) goto L9a
        L73:
            androidx.room.coroutines.PooledConnectionImpl$StatementWrapper r0 = new androidx.room.coroutines.PooledConnectionImpl$StatementWrapper     // Catch: java.lang.Throwable -> L95
            androidx.room.coroutines.ConnectionWithLock r1 = r6.delegate     // Catch: java.lang.Throwable -> L95
            androidx.sqlite.SQLiteStatement r7 = r1.prepare(r7)     // Catch: java.lang.Throwable -> L95
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L95
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0     // Catch: java.lang.Throwable -> L95
            r6 = r0
            androidx.room.coroutines.PooledConnectionImpl$StatementWrapper r6 = (androidx.room.coroutines.PooledConnectionImpl.StatementWrapper) r6     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r8.invoke(r6)     // Catch: java.lang.Throwable -> L8e
            h.a.r.y(r0, r4)     // Catch: java.lang.Throwable -> L95
            r9.unlock(r4)
            return r6
        L8e:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r7 = move-exception
            h.a.r.y(r0, r6)     // Catch: java.lang.Throwable -> L95
            throw r7     // Catch: java.lang.Throwable -> L95
        L95:
            r6 = move-exception
            r9.unlock(r4)
            throw r6
        L9a:
            return r1
        L9b:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            androidx.sqlite.SQLite.throwSQLiteException(r2, r6)
            h.e r6 = new h.e
            r6.<init>()
            throw r6
        La6:
            java.lang.String r6 = "Connection is recycled"
            androidx.sqlite.SQLite.throwSQLiteException(r2, r6)
            h.e r6 = new h.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.usePrepared(java.lang.String, h.g.a.l, h.c.e):java.lang.Object");
    }

    @Override // androidx.room.Transactor
    public <R> Object withTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, p<? super TransactionScope<R>, ? super h.c.e<? super R>, ? extends Object> pVar, h.c.e<? super R> eVar) {
        if (this.isRecycled) {
            SQLite.throwSQLiteException(21, "Connection is recycled");
            throw new e();
        }
        ConnectionElement connectionElement = (ConnectionElement) eVar.getContext().get(getConnectionElementKey());
        if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
            return transaction(sQLiteTransactionType, pVar, eVar);
        }
        SQLite.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw new e();
    }
}
