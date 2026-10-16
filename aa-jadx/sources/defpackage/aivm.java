package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aivm implements defpackage.aivn {
    private final java.util.concurrent.Future a;

    public aivm(java.util.concurrent.Future future) {
        this.a = future;
    }

    @Override // defpackage.aivn
    public final void gK() {
        this.a.cancel(false);
    }

    public final java.lang.String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}
