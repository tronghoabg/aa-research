package androidx.core.os;

import android.os.OutcomeReceiver;
import e.b.c;
import h.c.e;
import h.g.b.x;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final e<R> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(e<? super R> eVar) {
        super(false);
        x.f(eVar, "continuation");
        this.continuation = eVar;
    }

    public void onError(E e2) {
        x.f(e2, "error");
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(c.a(e2));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(r);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ")";
    }
}
