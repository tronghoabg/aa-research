package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pry implements java.lang.Runnable {
    private volatile java.lang.Runnable a;

    public pry(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.a;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }
}
