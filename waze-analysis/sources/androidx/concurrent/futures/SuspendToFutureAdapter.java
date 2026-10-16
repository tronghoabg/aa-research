package androidx.concurrent.futures;

import com.google.d.m.a.bm;
import h.c.a.c;
import h.c.a.h;
import h.c.b.a.a;
import h.c.e;
import h.c.j;
import h.c.k;
import h.c.l;
import h.d.b;
import h.g.a.p;
import h.g.b.x;
import h.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SuspendToFutureAdapter {
    public static final SuspendToFutureAdapter INSTANCE = new SuspendToFutureAdapter();
    private static final SuspendToFutureAdapter$GlobalListenableFutureScope$1 GlobalListenableFutureScope = new af() { // from class: androidx.concurrent.futures.SuspendToFutureAdapter$GlobalListenableFutureScope$1
        private final j coroutineContext;

        {
            int i2 = av.f51370a;
            this.coroutineContext = ac.f51860a;
        }

        @Override // kotlinx.coroutines.af
        public j getCoroutineContext() {
            return this.coroutineContext;
        }
    };
    private static final ab GlobalListenableFutureAwaitContext = av.c();

    private SuspendToFutureAdapter() {
    }

    public static /* synthetic */ bm launchFuture$default(SuspendToFutureAdapter suspendToFutureAdapter, j jVar, boolean z, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = k.f48060a;
        }
        return suspendToFutureAdapter.launchFuture(jVar, z | (!((i2 & 2) == 0)), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> bm<T> launchFuture(j jVar, boolean z, p<? super af, ? super e<? super T>, ? extends Object> pVar) {
        c bVar;
        x.f(jVar, "context");
        x.f(pVar, "block");
        am amVarW = aj.w(GlobalListenableFutureScope, jVar, z ? ag.f51345d : ag.f51342a, pVar);
        DeferredFuture deferredFuture = new DeferredFuture(amVarW);
        SuspendToFutureAdapter$launchFuture$1$1 suspendToFutureAdapter$launchFuture$1$1 = new SuspendToFutureAdapter$launchFuture$1$1(amVarW);
        DeferredFuture deferredFuture2 = deferredFuture;
        x.f(suspendToFutureAdapter$launchFuture$1$1, "<this>");
        x.f(deferredFuture2, "completion");
        x.f(suspendToFutureAdapter$launchFuture$1$1, "<this>");
        x.f(deferredFuture2, "completion");
        b.d(deferredFuture2);
        if (suspendToFutureAdapter$launchFuture$1$1 instanceof a) {
            bVar = ((a) suspendToFutureAdapter$launchFuture$1$1).create(deferredFuture2);
        } else {
            j context = deferredFuture2.getContext();
            bVar = context == k.f48060a ? new h.c.a.b(deferredFuture2, suspendToFutureAdapter$launchFuture$1$1) : new c(deferredFuture2, context, suspendToFutureAdapter$launchFuture$1$1);
        }
        new l(h.d(bVar), h.c.a.a.f48038a).resumeWith(h.ab.f48028a);
        return deferredFuture;
    }

    /* compiled from: WazeSource */
    final class DeferredFuture<T> implements bm, e {
        private final ResolvableFuture<T> delegateFuture;
        private final am<T> resultDeferred;

        /* JADX WARN: Multi-variable type inference failed */
        public DeferredFuture(am<? extends T> amVar) {
            x.f(amVar, "resultDeferred");
            this.resultDeferred = amVar;
            ResolvableFuture<T> resolvableFutureCreate = ResolvableFuture.create();
            x.e(resolvableFutureCreate, "create(...)");
            this.delegateFuture = resolvableFutureCreate;
        }

        @Override // com.google.d.m.a.bm
        public void addListener(Runnable runnable, Executor executor) {
            x.f(runnable, "listener");
            x.f(executor, "executor");
            this.delegateFuture.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            boolean zCancel = this.delegateFuture.cancel(z);
            if (zCancel) {
                this.resultDeferred.s(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get(long j2, TimeUnit timeUnit) {
            x.f(timeUnit, "unit");
            return this.delegateFuture.get(j2, timeUnit);
        }

        @Override // h.c.e
        public j getContext() {
            return SuspendToFutureAdapter.GlobalListenableFutureAwaitContext;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegateFuture.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegateFuture.isDone();
        }

        @Override // h.c.e
        public void resumeWith(Object obj) {
            Throwable thC = m.c(obj);
            if (thC == null) {
                this.delegateFuture.set(obj);
                return;
            }
            boolean z = thC instanceof CancellationException;
            ResolvableFuture<T> resolvableFuture = this.delegateFuture;
            if (z) {
                resolvableFuture.cancel(false);
            } else {
                resolvableFuture.setException(thC);
            }
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegateFuture.get();
        }
    }
}
