package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class iur {
    private static final yph f = yph.c("GH.CriticalUiManager");
    public final iva a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Runnable c = new imt(this, 12, null);
    public boolean d = false;
    public boolean e = false;
    private boolean g = false;

    public iur(iva ivaVar) {
        this.a = ivaVar;
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
            ((ype) ((ype) f.f()).ai((char) 1356)).u("Starting critical UI heartbeat");
            this.g = true;
            this.b.post(this.c);
        }
    }

    public final void c() {
        if (this.g) {
            ((ype) ((ype) f.f()).ai((char) 1357)).u("Stopping critical UI heartbeat");
            this.b.removeCallbacks(this.c);
            this.g = false;
        }
    }

    public final synchronized void d(boolean z) {
        if (!this.d) {
            ((ype) f.l().ai((char) 1359)).u("Critical ui is not supported, not sending update");
            return;
        }
        if (z != this.e) {
            ((ype) f.l().ai((char) 1358)).y("CriticalUi state changed: isReady? %s", Boolean.valueOf(z));
            this.e = z;
            this.a.n(z);
            if (this.g) {
                Handler handler = this.b;
                Runnable runnable = this.c;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000L);
            }
        }
    }
}
