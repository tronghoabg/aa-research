package defpackage;

import android.os.Handler;
import j$.time.Duration;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class lia implements lhg {
    private static final Duration b = Duration.ofMinutes(1);
    public final Handler a = new Handler();
    private boolean c = false;
    private final Runnable d;

    public lia(Supplier supplier) {
        this.d = new lhz(this, supplier);
    }

    public static long a() {
        return b.toMillis();
    }

    @Override // defpackage.lhg
    public final void c() {
        if (this.c) {
            ((ype) lig.a.l().ai((char) 3931)).u("HeartbeatHelper already started!");
            return;
        }
        this.c = true;
        long jA = a();
        if (jA <= 0) {
            yph yphVar = lig.a;
        } else {
            this.a.postDelayed(this.d, jA);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        if (!this.c) {
            ((ype) lig.a.l().ai((char) 3932)).u("HeartbeatHelper not started!");
        } else {
            this.a.removeCallbacks(this.d);
            this.c = false;
        }
    }
}
