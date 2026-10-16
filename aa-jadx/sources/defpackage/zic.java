package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class zic implements java.lang.Runnable {
    final /* synthetic */ java.lang.Runnable a;

    public zic(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
