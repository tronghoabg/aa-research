package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ete {
    private static android.os.Handler a;
    public volatile int f = 1;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.FutureTask c = new defpackage.etc(this, new defpackage.fma(this, 1));

    public abstract java.lang.Object a();

    protected void b(java.lang.Object obj) {
        throw null;
    }

    protected void c(java.lang.Object obj) {
        throw null;
    }

    public final void d(java.lang.Object obj) {
        android.os.Handler handler;
        synchronized (defpackage.ete.class) {
            handler = a;
            if (handler == null) {
                handler = new android.os.Handler(android.os.Looper.getMainLooper());
                a = handler;
            }
        }
        handler.post(new defpackage.etd(this, obj, 0));
    }

    final void e(java.lang.Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
