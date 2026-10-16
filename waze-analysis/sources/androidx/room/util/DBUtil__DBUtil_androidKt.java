package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.TransactionElement;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.driver.SupportSQLiteConnection;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.c.k;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class DBUtil__DBUtil_androidKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e, Object> {
        final /* synthetic */ l $block;
        final /* synthetic */ j $context;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1, reason: invalid class name and collision with other inner class name */
        final class C01071 extends g implements p<af, e, Object> {
            final /* synthetic */ l $block;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ boolean $inTransaction;
            final /* synthetic */ boolean $isReadOnly;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01071(RoomDatabase roomDatabase, boolean z, boolean z2, l lVar, e<? super C01071> eVar) {
                super(2, eVar);
                this.$db = roomDatabase;
                this.$inTransaction = z;
                this.$isReadOnly = z2;
                this.$block = lVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C01071(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e eVar) {
                return ((C01071) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                    return obj;
                }
                c.b(obj);
                boolean z = !(this.$db.inCompatibilityMode() && this.$db.inTransaction()) && this.$inTransaction;
                RoomDatabase roomDatabase = this.$db;
                boolean z2 = this.$isReadOnly;
                this.label = 1;
                Object objUseConnection = roomDatabase.useConnection(z2, new DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1(z, z2, roomDatabase, null, this.$block), this);
                return objUseConnection == aVar ? aVar : objUseConnection;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(j jVar, RoomDatabase roomDatabase, boolean z, boolean z2, l lVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$context = jVar;
            this.$db = roomDatabase;
            this.$inTransaction = z;
            this.$isReadOnly = z2;
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$context, this.$db, this.$inTransaction, this.$isReadOnly, this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object objV = aj.v(this.$context, new C01071(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, null), this);
            return objV == aVar ? aVar : objV;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1, reason: invalid class name and case insensitive filesystem */
    final class C04731<R> extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04731(e<? super C04731> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DBUtil.performInTransactionSuspending(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e, Object> {
        final /* synthetic */ l<e, Object> $block;
        final /* synthetic */ RoomDatabase $db;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(RoomDatabase roomDatabase, l<? super e, ? extends Object> lVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$db = roomDatabase;
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.$db, this.$block, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            RoomDatabase roomDatabase = this.$db;
            this.label = 1;
            Object objUseConnection = roomDatabase.useConnection(false, new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(true, false, roomDatabase, null, this.$block), this);
            return objUseConnection == aVar ? aVar : objUseConnection;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1, reason: invalid class name and case insensitive filesystem */
    final class C04741<R> extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C04741(e<? super C04741> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DBUtil.performSuspending(null, false, false, null, this);
        }
    }

    private static final <R> Object compatCoroutineExecute$DBUtil__DBUtil_androidKt(RoomDatabase roomDatabase, boolean z, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return (roomDatabase.inCompatibilityMode() && roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) ? lVar.invoke(eVar) : aj.v((j) DBUtil.getCoroutineContext(roomDatabase, z, eVar), new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(lVar, null), eVar);
    }

    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        x.f(supportSQLiteDatabase, "db");
        DBUtil.dropFtsSyncTriggers(new SupportSQLiteConnection(supportSQLiteDatabase));
    }

    public static final void foreignKeyCheck(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        x.f(supportSQLiteDatabase, "db");
        x.f(str, "tableName");
        DBUtil.foreignKeyCheck(new SupportSQLiteConnection(supportSQLiteDatabase), str);
    }

    public static final Object getCoroutineContext(RoomDatabase roomDatabase, boolean z, e<? super j> eVar) {
        TransactionElement transactionElement = (TransactionElement) eVar.getContext().get(TransactionElement.Key);
        h.c.g transactionDispatcher$room_runtime = transactionElement != null ? transactionElement.getTransactionDispatcher$room_runtime() : null;
        if (roomDatabase.inCompatibilityMode()) {
            return transactionDispatcher$room_runtime != null ? roomDatabase.getQueryContext().plus(transactionDispatcher$room_runtime) : z ? roomDatabase.getTransactionContext$room_runtime() : roomDatabase.getQueryContext();
        }
        return roomDatabase.getQueryContext().plus(transactionDispatcher$room_runtime != null ? transactionDispatcher$room_runtime : k.f48060a);
    }

    public static final <R> R performBlocking(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends R> lVar) {
        x.f(roomDatabase, "db");
        x.f(lVar, "block");
        roomDatabase.assertNotMainThread();
        roomDatabase.assertNotSuspendingTransaction();
        k kVar = roomDatabase.getSuspendingTransactionContext().get();
        if (kVar == null) {
            kVar = k.f48060a;
        }
        return (R) RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(kVar, roomDatabase, z2, z, lVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object performInTransactionSuspending(androidx.room.RoomDatabase r12, h.g.a.l<? super h.c.e<? super R>, ? extends java.lang.Object> r13, h.c.e<? super R> r14) {
        /*
            boolean r0 = r14 instanceof androidx.room.util.DBUtil__DBUtil_androidKt.C04731
            if (r0 == 0) goto L13
            r0 = r14
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1 r0 = (androidx.room.util.DBUtil__DBUtil_androidKt.C04731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            e.b.c.b(r14)
            return r14
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            java.lang.Object r12 = r0.L$1
            r13 = r12
            h.g.a.l r13 = (h.g.a.l) r13
            java.lang.Object r12 = r0.L$0
            androidx.room.RoomDatabase r12 = (androidx.room.RoomDatabase) r12
            e.b.c.b(r14)
            goto La5
        L46:
            e.b.c.b(r14)
            return r14
        L4a:
            e.b.c.b(r14)
            return r14
        L4e:
            e.b.c.b(r14)
            boolean r14 = r12.inCompatibilityMode()
            if (r14 == 0) goto L68
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r14 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r14.<init>(r12, r13, r7)
            h.g.a.l r14 = (h.g.a.l) r14
            r0.label = r6
            java.lang.Object r12 = androidx.room.RoomDatabaseKt.withTransactionContext(r12, r14, r0)
            if (r12 != r1) goto L67
            goto Lba
        L67:
            return r12
        L68:
            boolean r14 = r12.inCompatibilityMode()
            if (r14 == 0) goto L94
            boolean r14 = r12.isOpenInternal$room_runtime()
            if (r14 == 0) goto L94
            boolean r14 = r12.inTransaction()
            if (r14 == 0) goto L94
            r14 = r0
            h.c.e r14 = (h.c.e) r14
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 r6 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1
            r8 = 0
            r10 = 0
            r7 = 1
            r9 = r12
            r11 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.label = r5
            r12 = 0
            java.lang.Object r12 = r9.useConnection(r12, r6, r0)
            if (r12 != r1) goto L93
            goto Lba
        L93:
            return r12
        L94:
            r9 = r12
            r11 = r13
            r0.L$0 = r9
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r14 = androidx.room.util.DBUtil.getCoroutineContext(r9, r6, r0)
            if (r14 != r1) goto La3
            goto Lba
        La3:
            r12 = r9
            r13 = r11
        La5:
            h.c.j r14 = (h.c.j) r14
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r2 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r2.<init>(r7, r12, r13)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r12 = kotlinx.coroutines.aj.v(r14, r2, r0)
            if (r12 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.performInTransactionSuspending(androidx.room.RoomDatabase, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object performSuspending(androidx.room.RoomDatabase r14, boolean r15, boolean r16, h.g.a.l<? super androidx.sqlite.SQLiteConnection, ? extends R> r17, h.c.e<? super R> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.room.util.DBUtil__DBUtil_androidKt.C04741
            if (r1 == 0) goto L15
            r1 = r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt.C04741) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            r1.<init>(r0)
        L1a:
            r6 = r1
            java.lang.Object r0 = r6.result
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L50
            if (r1 == r8) goto L4c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            e.b.c.b(r0)
            return r0
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            boolean r14 = r6.Z$1
            boolean r15 = r6.Z$0
            java.lang.Object r1 = r6.L$1
            h.g.a.l r1 = (h.g.a.l) r1
            java.lang.Object r3 = r6.L$0
            androidx.room.RoomDatabase r3 = (androidx.room.RoomDatabase) r3
            e.b.c.b(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4a:
            r11 = r15
            goto L9b
        L4c:
            e.b.c.b(r0)
            return r0
        L50:
            e.b.c.b(r0)
            boolean r0 = r14.inCompatibilityMode()
            if (r0 == 0) goto L81
            boolean r0 = r14.isOpenInternal$room_runtime()
            if (r0 == 0) goto L81
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L81
            r0 = r6
            h.c.e r0 = (h.c.e) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            h.g.a.p r2 = (h.g.a.p) r2
            r6.label = r8
            java.lang.Object r14 = r14.useConnection(r15, r2, r6)
            if (r14 != r7) goto L80
            goto Lb2
        L80:
            return r14
        L81:
            r4 = r16
            r6.L$0 = r14
            r5 = r17
            r6.L$1 = r5
            r6.Z$0 = r15
            r6.Z$1 = r4
            r6.label = r3
            java.lang.Object r3 = androidx.room.util.DBUtil.getCoroutineContext(r14, r4, r6)
            if (r3 != r7) goto L96
            goto Lb2
        L96:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4a
        L9b:
            h.c.j r0 = (h.c.j) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r8 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            h.g.a.p r8 = (h.g.a.p) r8
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            java.lang.Object r14 = kotlinx.coroutines.aj.v(r0, r8, r6)
            if (r14 != r7) goto Lb3
        Lb2:
            return r7
        Lb3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.performSuspending(androidx.room.RoomDatabase, boolean, boolean, h.g.a.l, h.c.e):java.lang.Object");
    }

    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        x.f(roomDatabase, "db");
        x.f(supportSQLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        if (!z || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }

    public static final int readVersion(File file) throws IOException {
        x.f(file, "databaseFile");
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(file).getChannel());
        try {
            FileChannel fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            fileChannel.tryLock(60L, 4L, true);
            fileChannel.position(60L);
            if (fileChannel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i2 = byteBufferAllocate.getInt();
            i.aW(fileChannelConvertMaybeLegacyFileChannelFromLibrary, null);
            return i2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i.aW(fileChannelConvertMaybeLegacyFileChannelFromLibrary, th);
                throw th2;
            }
        }
    }

    public static final SQLiteConnection toSQLiteConnection(SupportSQLiteDatabase supportSQLiteDatabase) {
        x.f(supportSQLiteDatabase, "db");
        return new SupportSQLiteConnection(supportSQLiteDatabase);
    }

    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z) {
        x.f(roomDatabase, "db");
        x.f(supportSQLiteQuery, "sqLiteQuery");
        return DBUtil.query(roomDatabase, supportSQLiteQuery, z, null);
    }
}
