package defpackage;

/* loaded from: classes2.dex */
public final class prc implements Runnable {
    private volatile Runnable a;

    public prc(Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }
}
