package kotlinx.coroutines;

import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw implements ax {

    /* renamed from: a, reason: collision with root package name */
    private final Future f51373a;

    public aw(Future future) {
        this.f51373a = future;
    }

    @Override // kotlinx.coroutines.ax
    public final void dispose() {
        this.f51373a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f51373a + "]";
    }
}
