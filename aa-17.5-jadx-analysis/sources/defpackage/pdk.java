package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class pdk {
    public final Handler a;
    public final Object b = new Object();
    public boolean c;
    public final boolean d;

    static {
        yph.c("GH.HandlerWrapper");
    }

    public pdk(Handler handler, boolean z) {
        this.a = handler;
        this.d = z;
    }

    public final Looper a() {
        return this.a.getLooper();
    }

    public final void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public final void c(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    public final void d(Runnable runnable) {
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

    public final void e(Runnable runnable, long j) {
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

    public final void f(Runnable runnable, Object obj, long j) {
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
