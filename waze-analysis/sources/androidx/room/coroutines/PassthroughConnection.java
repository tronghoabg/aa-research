package androidx.room.coroutines;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class PassthroughConnection implements Transactor, RawConnectionAccessor {
    private Transactor.SQLiteTransactionType currentTransactionType;
    private final SQLiteConnection delegate;
    private AtomicInteger nestedTransactionCount;
    private final p<l<? super e<Object>, ? extends Object>, e<Object>, Object> transactionWrapper;

    /* compiled from: WazeSource */
    final class PassthroughTransactor<T> implements TransactionScope<T>, RawConnectionAccessor {
        public PassthroughTransactor() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public SQLiteConnection getRawConnection() {
            return PassthroughConnection.this.getRawConnection();
        }

        @Override // androidx.room.TransactionScope
        public Object rollback(T t, e<?> eVar) throws ConnectionPool.RollbackException {
            throw new ConnectionPool.RollbackException(t);
        }

        @Override // androidx.room.PooledConnection
        public <R> Object usePrepared(String str, l<? super SQLiteStatement, ? extends R> lVar, e<? super R> eVar) {
            return PassthroughConnection.this.usePrepared(str, lVar, eVar);
        }

        @Override // androidx.room.TransactionScope
        public <R> Object withNestedTransaction(p<? super TransactionScope<R>, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
            Transactor.SQLiteTransactionType sQLiteTransactionType = PassthroughConnection.this.currentTransactionType;
            if (sQLiteTransactionType != null) {
                return PassthroughConnection.this.transaction(sQLiteTransactionType, pVar, eVar);
            }
            throw new IllegalStateException("Required value was null.");
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
    /* renamed from: androidx.room.coroutines.PassthroughConnection$transaction$1, reason: invalid class name */
    final class AnonymousClass1<R> extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PassthroughConnection.this.transaction(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PassthroughConnection$usePrepared$1, reason: invalid class name and case insensitive filesystem */
    final class C04561<R> extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04561(e<? super C04561> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PassthroughConnection.this.usePrepared(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassthroughConnection(p<? super l<? super e<Object>, ? extends Object>, ? super e<Object>, ? extends Object> pVar, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "delegate");
        this.transactionWrapper = pVar;
        this.delegate = sQLiteConnection;
        this.nestedTransactionCount = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r7, h.g.a.p<? super androidx.room.TransactionScope<R>, ? super h.c.e<? super R>, ? extends java.lang.Object> r8, h.c.e<? super R> r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PassthroughConnection.transaction(androidx.room.Transactor$SQLiteTransactionType, h.g.a.p, h.c.e):java.lang.Object");
    }

    public final SQLiteConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    public final p<l<? super e<Object>, ? extends Object>, e<Object>, Object> getTransactionWrapper() {
        return this.transactionWrapper;
    }

    @Override // androidx.room.Transactor
    public Object inTransaction(e<? super Boolean> eVar) {
        boolean z = true;
        if (this.currentTransactionType == null && !this.delegate.inTransaction()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.room.PooledConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object usePrepared(java.lang.String r6, h.g.a.l<? super androidx.sqlite.SQLiteStatement, ? extends R> r7, h.c.e<? super R> r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.coroutines.PassthroughConnection.C04561
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.coroutines.PassthroughConnection$usePrepared$1 r0 = (androidx.room.coroutines.PassthroughConnection.C04561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PassthroughConnection$usePrepared$1 r0 = new androidx.room.coroutines.PassthroughConnection$usePrepared$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            h.g.a.l r7 = (h.g.a.l) r7
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            e.b.c.b(r8)
            goto L4e
        L3f:
            e.b.c.b(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r5.inTransaction(r0)
            if (r8 == r1) goto L88
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L6e
            h.g.a.p<h.g.a.l<? super h.c.e<java.lang.Object>, ? extends java.lang.Object>, h.c.e<java.lang.Object>, java.lang.Object> r8 = r5.transactionWrapper
            if (r8 == 0) goto L6e
            androidx.room.coroutines.PassthroughConnection$usePrepared$2 r4 = new androidx.room.coroutines.PassthroughConnection$usePrepared$2
            r4.<init>(r6, r7, r2)
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r5 = r8.invoke(r4, r0)
            if (r5 != r1) goto L6d
            goto L88
        L6d:
            return r5
        L6e:
            androidx.sqlite.SQLiteConnection r5 = r5.delegate
            androidx.sqlite.SQLiteStatement r5 = r5.prepare(r6)
            java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5
            r6 = r5
            androidx.sqlite.SQLiteStatement r6 = (androidx.sqlite.SQLiteStatement) r6     // Catch: java.lang.Throwable -> L81
            java.lang.Object r6 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L81
            h.a.r.y(r5, r2)
            return r6
        L81:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r7 = move-exception
            h.a.r.y(r5, r6)
            throw r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PassthroughConnection.usePrepared(java.lang.String, h.g.a.l, h.c.e):java.lang.Object");
    }

    @Override // androidx.room.Transactor
    public <R> Object withTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, p<? super TransactionScope<R>, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        p<l<? super e<Object>, ? extends Object>, e<Object>, Object> pVar2 = this.transactionWrapper;
        if (pVar2 == null) {
            return transaction(sQLiteTransactionType, pVar, eVar);
        }
        Object objInvoke = pVar2.invoke(new C04572(sQLiteTransactionType, pVar, null), eVar);
        a aVar = a.f48038a;
        return objInvoke;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PassthroughConnection$usePrepared$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super Object>, Object> {
        final /* synthetic */ l $block;
        final /* synthetic */ String $sql;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, l lVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$sql = str;
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return PassthroughConnection.this.new AnonymousClass2(this.$sql, this.$block, eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(e<Object> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            PassthroughConnection passthroughConnection = PassthroughConnection.this;
            SQLiteStatement sQLiteStatementPrepare = passthroughConnection.getDelegate().prepare(this.$sql);
            try {
                Object objInvoke = this.$block.invoke(sQLiteStatementPrepare);
                r.y(sQLiteStatementPrepare, null);
                return objInvoke;
            } finally {
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(e<? super Object> eVar) {
            return invoke2((e<Object>) eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PassthroughConnection$withTransaction$2, reason: invalid class name and case insensitive filesystem */
    final class C04572 extends g implements l<e<? super Object>, Object> {
        final /* synthetic */ p<TransactionScope, e, Object> $block;
        final /* synthetic */ Transactor.SQLiteTransactionType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04572(Transactor.SQLiteTransactionType sQLiteTransactionType, p<? super TransactionScope, ? super e, ? extends Object> pVar, e<? super C04572> eVar) {
            super(1, eVar);
            this.$type = sQLiteTransactionType;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return PassthroughConnection.this.new C04572(this.$type, this.$block, eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(e<Object> eVar) {
            return ((C04572) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
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
            this.label = 1;
            Object objTransaction = PassthroughConnection.this.transaction(this.$type, this.$block, this);
            return objTransaction == aVar ? aVar : objTransaction;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(e<? super Object> eVar) {
            return invoke2((e<Object>) eVar);
        }
    }
}
