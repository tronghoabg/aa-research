package androidx.core.util;

import h.ab;
import h.c.e;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final e<ab> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(e<? super ab> eVar) {
        super(false);
        x.f(eVar, "continuation");
        this.continuation = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(ab.f48028a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ")";
    }
}
