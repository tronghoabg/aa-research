package androidx.room.guava;

import android.os.CancellationSignal;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.d.m.a.bm;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.k;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class GuavaRoom {
    private static final Executor directExecutor = new Executor() { // from class: androidx.room.guava.GuavaRoom$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.guava.GuavaRoom$createListenableFuture$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e, Object> {
        final /* synthetic */ l $block;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoomDatabase roomDatabase, boolean z, boolean z2, l lVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$db = roomDatabase;
            this.$isReadOnly = z;
            this.$inTransaction = z2;
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$db, this.$isReadOnly, this.$inTransaction, this.$block, eVar);
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
            Object objPerformSuspending = DBUtil.performSuspending(this.$db, this.$isReadOnly, this.$inTransaction, this.$block, this);
            return objPerformSuspending == aVar ? aVar : objPerformSuspending;
        }
    }

    public static final <T> bm<T> createListenableFuture(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends T> lVar) {
        x.f(roomDatabase, "db");
        x.f(lVar, "block");
        return d.a(roomDatabase.getCoroutineScope(), k.f48060a, ag.f51342a, new AnonymousClass1(roomDatabase, z, z2, lVar, null));
    }

    static final void createListenableFuture$lambda$0(bm bmVar, CancellationSignal cancellationSignal) {
        if (bmVar.isCancelled()) {
            cancellationSignal.cancel();
        }
    }

    static final void createListenableFuture$lambda$1(SupportSQLiteQuery supportSQLiteQuery) {
        if (supportSQLiteQuery instanceof RoomSQLiteQuery) {
            ((RoomSQLiteQuery) supportSQLiteQuery).release();
        }
    }

    static final void createListenableFuture$lambda$2(Callable callable, ResolvableFuture resolvableFuture) {
        try {
            resolvableFuture.set(callable.call());
        } catch (Throwable th) {
            resolvableFuture.setException(th);
        }
    }

    private static final Executor getExecutor(RoomDatabase roomDatabase, boolean z) {
        return z ? roomDatabase.getTransactionExecutor() : roomDatabase.getQueryExecutor();
    }

    public static final <T> bm<T> createListenableFuture(RoomDatabase roomDatabase, Callable<T> callable, RoomSQLiteQuery roomSQLiteQuery, boolean z) {
        x.f(roomDatabase, "roomDatabase");
        x.f(callable, "callable");
        x.f(roomSQLiteQuery, "query");
        return createListenableFuture(roomDatabase.getQueryExecutor(), callable, roomSQLiteQuery, z, (CancellationSignal) null);
    }

    public static final <T> bm<T> createListenableFuture(RoomDatabase roomDatabase, boolean z, Callable<T> callable) {
        x.f(roomDatabase, "roomDatabase");
        x.f(callable, "callable");
        return createListenableFuture(getExecutor(roomDatabase, z), callable);
    }

    public static final <T> bm<T> createListenableFuture(RoomDatabase roomDatabase, boolean z, Callable<T> callable, RoomSQLiteQuery roomSQLiteQuery, boolean z2) {
        x.f(roomDatabase, "roomDatabase");
        x.f(callable, "callable");
        x.f(roomSQLiteQuery, "query");
        return createListenableFuture(getExecutor(roomDatabase, z), callable, roomSQLiteQuery, z2, (CancellationSignal) null);
    }

    public static final <T> bm<T> createListenableFuture(RoomDatabase roomDatabase, boolean z, Callable<T> callable, RoomSQLiteQuery roomSQLiteQuery, boolean z2, CancellationSignal cancellationSignal) {
        x.f(roomDatabase, "roomDatabase");
        x.f(callable, "callable");
        x.f(roomSQLiteQuery, "query");
        return createListenableFuture(getExecutor(roomDatabase, z), callable, roomSQLiteQuery, z2, cancellationSignal);
    }

    public static final <T> bm<T> createListenableFuture(RoomDatabase roomDatabase, boolean z, Callable<T> callable, SupportSQLiteQuery supportSQLiteQuery, boolean z2, CancellationSignal cancellationSignal) {
        x.f(roomDatabase, "roomDatabase");
        x.f(callable, "callable");
        x.f(supportSQLiteQuery, "query");
        return createListenableFuture(getExecutor(roomDatabase, z), callable, supportSQLiteQuery, z2, cancellationSignal);
    }

    public static final <T> bm<T> createListenableFuture(RoomDatabase roomDatabase, Callable<T> callable) {
        x.f(roomDatabase, "roomDatabase");
        x.f(callable, "callable");
        return createListenableFuture(getExecutor(roomDatabase, false), callable);
    }

    public static final <T> bm<T> createListenableFuture(Callable<T> callable, RoomSQLiteQuery roomSQLiteQuery, boolean z) {
        x.f(callable, "callable");
        x.f(roomSQLiteQuery, "query");
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        x.e(iOThreadExecutor, "getIOThreadExecutor(...)");
        return createListenableFuture(iOThreadExecutor, callable, roomSQLiteQuery, z, (CancellationSignal) null);
    }

    private static final <T> bm<T> createListenableFuture(Executor executor, final Callable<T> callable) {
        final ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        executor.execute(new Runnable() { // from class: androidx.room.guava.GuavaRoom$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                GuavaRoom.createListenableFuture$lambda$2(callable, resolvableFutureCreate);
            }
        });
        return resolvableFutureCreate;
    }

    private static final <T> bm<T> createListenableFuture(Executor executor, Callable<T> callable, final SupportSQLiteQuery supportSQLiteQuery, boolean z, final CancellationSignal cancellationSignal) {
        final bm<T> bmVarCreateListenableFuture = createListenableFuture(executor, callable);
        if (cancellationSignal != null) {
            bmVarCreateListenableFuture.addListener(new Runnable() { // from class: androidx.room.guava.GuavaRoom$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GuavaRoom.createListenableFuture$lambda$0(bmVarCreateListenableFuture, cancellationSignal);
                }
            }, directExecutor);
        }
        if (z) {
            bmVarCreateListenableFuture.addListener(new Runnable() { // from class: androidx.room.guava.GuavaRoom$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    GuavaRoom.createListenableFuture$lambda$1(supportSQLiteQuery);
                }
            }, directExecutor);
        }
        return bmVarCreateListenableFuture;
    }
}
