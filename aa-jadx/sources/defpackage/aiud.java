package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiud implements defpackage.aiue {
    private final java.util.concurrent.Future a;

    public aiud(java.util.concurrent.Future future) {
        this.a = future;
    }

    @Override // defpackage.aiue
    public final void a(java.lang.Throwable th) {
        this.a.cancel(false);
    }

    public final java.lang.String toString() {
        return "CancelFutureOnCancel[" + this.a + "]";
    }
}
