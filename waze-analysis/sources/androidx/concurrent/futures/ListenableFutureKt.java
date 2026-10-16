package androidx.concurrent.futures;

import com.google.d.m.a.bm;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.b.x;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ListenableFutureKt {
    public static final <T> Object await(final bm<T> bmVar, e<? super T> eVar) throws Throwable {
        try {
            if (bmVar.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(bmVar);
            }
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            l lVar2 = lVar;
            bmVar.addListener(new ToContinuation(bmVar, lVar2), DirectExecutor.INSTANCE);
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$2$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    bmVar.cancel(false);
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

    public static final Throwable nonNullCause(ExecutionException executionException) {
        x.f(executionException, "<this>");
        Throwable cause = executionException.getCause();
        x.c(cause);
        return cause;
    }
}
