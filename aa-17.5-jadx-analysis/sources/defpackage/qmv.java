package defpackage;

import android.os.Handler;

/* loaded from: classes2.dex */
public abstract class qmv {
    private static volatile Handler a;
    public final qmh b;
    public final Runnable c = new qjv(this, 7, null);
    public volatile long d;

    public qmv(qmh qmhVar) {
        this.b = qmhVar;
    }

    public abstract void a();

    public final Handler b() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (qmv.class) {
            if (a == null) {
                a = new sss(this.b.b.getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    public final void c() {
        this.d = 0L;
        b().removeCallbacks(this.c);
    }

    public final void d(long j) {
        c();
        if (j >= 0) {
            this.d = System.currentTimeMillis();
            if (b().postDelayed(this.c, j)) {
                return;
            }
            this.b.e().p(6, "Failed to schedule delayed post. time", Long.valueOf(j), null, null);
        }
    }

    public final boolean e() {
        return this.d != 0;
    }
}
