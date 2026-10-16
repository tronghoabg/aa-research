package defpackage;

/* loaded from: classes.dex */
public final class adnv implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public adnv(Runnable runnable) {
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
