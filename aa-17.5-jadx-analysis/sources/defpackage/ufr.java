package defpackage;

/* loaded from: classes3.dex */
final class ufr implements Runnable {
    public volatile Runnable a;
    public final Runnable b;

    public ufr(Runnable runnable) {
        this.a = runnable;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
