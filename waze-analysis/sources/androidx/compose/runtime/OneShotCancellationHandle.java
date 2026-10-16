package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicBoolean;
import androidx.compose.runtime.internal.AtomicInt;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OneShotCancellationHandle implements CancellationHandle {
    public static final int $stable = 8;
    private final a<ab> action;
    private final AtomicInt didFireCancellation = AtomicBoolean.m7580constructorimpl(false);

    public OneShotCancellationHandle(a<ab> aVar) {
        this.action = aVar;
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        if (AtomicBoolean.m7585getAndSetimpl(this.didFireCancellation, true)) {
            return;
        }
        this.action.invoke();
    }
}
