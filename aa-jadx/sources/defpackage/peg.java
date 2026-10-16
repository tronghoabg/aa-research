package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class peg {
    public final android.os.Handler a;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c;
    public final boolean d;

    static {
        defpackage.yqm.c("GH.HandlerWrapper");
    }

    public peg(android.os.Handler handler, boolean z) {
        this.a = handler;
        this.d = z;
    }

    public final android.os.Looper a() {
        return this.a.getLooper();
    }

    public final void b(java.lang.Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public final void c(java.lang.Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    public final void d(java.lang.Runnable runnable) {
        if (!this.d) {
            this.a.post(runnable);
            return;
        }
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.a.post(runnable);
        }
    }

    public final void e(java.lang.Runnable runnable, long j) {
        if (!this.d) {
            this.a.postDelayed(runnable, j);
            return;
        }
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f(java.lang.Runnable runnable, java.lang.Object obj, long j) {
        if (!this.d) {
            this.a.postDelayed(runnable, obj, j);
            return;
        }
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.a.postDelayed(runnable, obj, j);
        }
    }
}
