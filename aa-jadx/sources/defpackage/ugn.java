package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ugn implements java.lang.Runnable {
    public volatile java.lang.Runnable a;
    public final java.lang.Runnable b;

    public ugn(java.lang.Runnable runnable) {
        this.a = runnable;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
