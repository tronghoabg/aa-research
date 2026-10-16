package Ef;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes5.dex */
public final class T implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f3701a;

    public T(ScheduledFuture scheduledFuture) {
        this.f3701a = scheduledFuture;
    }

    @Override // Ef.U
    public final void dispose() {
        this.f3701a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f3701a + ']';
    }
}
