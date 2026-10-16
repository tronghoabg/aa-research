package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qln extends java.lang.Thread {
    public final java.util.concurrent.CountDownLatch a;
    private final java.lang.ref.WeakReference b;
    private final long c;

    public qln(defpackage.qlp qlpVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.b = new java.lang.ref.WeakReference(qlpVar);
        this.c = j;
        this.a = new java.util.concurrent.CountDownLatch(1);
        start();
    }

    private final void a() {
        defpackage.qlp qlpVar = (defpackage.qlp) this.b.get();
        if (qlpVar != null) {
            qlpVar.a();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.a.await(this.c, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (java.lang.InterruptedException unused) {
            a();
        }
    }
}
