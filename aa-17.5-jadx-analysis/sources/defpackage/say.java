package defpackage;

import android.os.SystemClock;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* loaded from: classes.dex */
public final class say {
    final /* synthetic */ CarSetupServiceImpl a;
    private int b;
    private long c;

    public say(CarSetupServiceImpl carSetupServiceImpl) {
        this.a = carSetupServiceImpl;
        b(0);
    }

    public final synchronized int a() {
        return this.b;
    }

    public final synchronized void b(int i) {
        this.b = i;
        if (i == 1) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public final synchronized boolean c() {
        if (this.b == 0) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        if (jElapsedRealtime < 10000) {
            return true;
        }
        sbp sbpVar = this.a.i;
        if (sbpVar != null) {
            if (sbpVar.k) {
                return jElapsedRealtime < 300000;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        if (this.b != 2) {
            return false;
        }
        this.b = 3;
        return true;
    }
}
