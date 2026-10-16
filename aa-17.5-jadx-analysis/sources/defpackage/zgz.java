package defpackage;

/* loaded from: classes.dex */
final class zgz implements Runnable {
    final /* synthetic */ Runnable a;

    public zgz(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}
