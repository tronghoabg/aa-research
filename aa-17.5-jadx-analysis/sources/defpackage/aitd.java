package defpackage;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
final class aitd implements aite {
    private final Future a;

    public aitd(Future future) {
        this.a = future;
    }

    @Override // defpackage.aite
    public final void a(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + "]";
    }
}
