package androidx.compose.ui.tooling;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ThreadSafeException {
    public static final int $stable = 8;
    private Throwable exception;
    private final Object lock = new Object();

    public final void set(Throwable th) {
        synchronized (this.lock) {
            this.exception = th;
        }
    }

    public final void throwIfPresent() {
        synchronized (this.lock) {
            Throwable th = this.exception;
            if (th != null) {
                this.exception = null;
                throw th;
            }
        }
    }
}
