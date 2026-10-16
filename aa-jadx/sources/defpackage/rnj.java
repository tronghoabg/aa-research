package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnj implements java.util.concurrent.Callable {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.rng b;

    public rnj(defpackage.rng rngVar, boolean z) {
        this.a = z;
        this.b = rngVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        return java.lang.Boolean.valueOf(this.b.a.reportFullscreenMode(this.a));
    }
}
