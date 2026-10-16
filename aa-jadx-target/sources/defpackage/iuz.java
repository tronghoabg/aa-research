package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iuz {
    private static final defpackage.yqm f = defpackage.yqm.c("GH.CriticalUiManager");
    public final defpackage.ivi a;
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Runnable c = new defpackage.ire(this, 6);
    public boolean d = false;
    public boolean e = false;
    private boolean g = false;

    public iuz(defpackage.ivi iviVar) {
        this.a = iviVar;
    }

    public final synchronized void a() {
        c();
    }

    public final synchronized void b(boolean z) {
        this.d = z;
        if (!z) {
            c();
        } else {
            if (this.g) {
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) f.f()).ai((char) 1356)).u("Starting critical UI heartbeat");
            this.g = true;
            this.b.post(this.c);
        }
    }

    public final void c() {
        if (this.g) {
            ((defpackage.yqj) ((defpackage.yqj) f.f()).ai((char) 1357)).u("Stopping critical UI heartbeat");
            this.b.removeCallbacks(this.c);
            this.g = false;
        }
    }

    public final synchronized void d(boolean z) {
        if (!this.d) {
            ((defpackage.yqj) f.l().ai((char) 1359)).u("Critical ui is not supported, not sending update");
            return;
        }
        if (z != this.e) {
            ((defpackage.yqj) f.l().ai((char) 1358)).y("CriticalUi state changed: isReady? %s", java.lang.Boolean.valueOf(z));
            this.e = z;
            this.a.n(z);
            if (this.g) {
                android.os.Handler handler = this.b;
                java.lang.Runnable runnable = this.c;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000L);
            }
        }
    }
}
