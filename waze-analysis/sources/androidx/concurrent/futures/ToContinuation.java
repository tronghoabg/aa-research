package androidx.concurrent.futures;

import com.google.d.m.a.bm;
import e.b.c;
import h.g.b.x;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ToContinuation<T> implements Runnable {
    private final k<T> continuation;
    private final bm<T> futureToObserve;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(bm<T> bmVar, k<? super T> kVar) {
        x.f(bmVar, "futureToObserve");
        x.f(kVar, "continuation");
        this.futureToObserve = bmVar;
        this.continuation = kVar;
    }

    public final k<T> getContinuation() {
        return this.continuation;
    }

    public final bm<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsCancelled = this.futureToObserve.isCancelled();
        k<T> kVar = this.continuation;
        if (zIsCancelled) {
            kVar.f(null);
            return;
        }
        try {
            kVar.resumeWith(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve));
        } catch (ExecutionException e2) {
            this.continuation.resumeWith(c.a(ListenableFutureKt.nonNullCause(e2)));
        }
    }
}
