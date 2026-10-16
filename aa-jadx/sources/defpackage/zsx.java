package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsx {
    public static final defpackage.zsx a = new defpackage.zsx(android.os.Looper.getMainLooper().getThread());
    private final java.lang.Thread b;

    public zsx(java.lang.Thread thread) {
        defpackage.zlv.n(thread, "expectedThread");
        this.b = thread;
    }

    public final void a() {
        defpackage.zlv.K(java.lang.Thread.currentThread() == this.b, "Not on the main thread");
    }

    public final void b() {
        defpackage.zlv.K(java.lang.Thread.currentThread() != this.b, "Should not be on the main thread");
    }
}
