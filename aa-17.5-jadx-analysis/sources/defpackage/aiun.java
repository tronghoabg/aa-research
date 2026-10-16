package defpackage;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
final class aiun implements aiuo {
    private final Future a;

    public aiun(Future future) {
        this.a = future;
    }

    @Override // defpackage.aiuo
    public final void hy() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}
