package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adow implements java.lang.Runnable {
    final java.lang.Runnable a;
    public boolean b;
    public boolean c;

    public adow(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
