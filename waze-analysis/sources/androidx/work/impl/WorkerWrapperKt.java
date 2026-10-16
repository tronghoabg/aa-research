package androidx.work.impl;

import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import com.google.d.m.a.bm;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.b.x;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkerWrapperKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkerWrapper");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    public static final <T> Object awaitWithin(final bm<T> bmVar, final ListenableWorker listenableWorker, e<? super T> eVar) throws Throwable {
        try {
            if (bmVar.isDone()) {
                return getUninterruptibly(bmVar);
            }
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            l lVar2 = lVar;
            bmVar.addListener(new ToContinuation(bmVar, lVar2), DirectExecutor.INSTANCE);
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    if (th instanceof WorkerStoppedException) {
                        listenableWorker.stop(((WorkerStoppedException) th).getReason());
                    }
                    bmVar.cancel(false);
                }

                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }
            });
            Object objJ = lVar.j();
            if (objJ == a.f48038a) {
                b.c(eVar);
            }
            return objJ;
        } catch (ExecutionException e2) {
            throw nonNullCause(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        x.c(cause);
        return cause;
    }
}
