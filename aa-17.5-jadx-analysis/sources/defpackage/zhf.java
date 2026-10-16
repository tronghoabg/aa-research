package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zhf implements Runnable {
    zhh a;

    public zhf(zhh zhhVar) {
        this.a = zhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zgp zgpVar;
        zhh zhhVar = this.a;
        if (zhhVar == null || (zgpVar = zhhVar.a) == null) {
            return;
        }
        this.a = null;
        if (zgpVar.isDone()) {
            zhhVar.r(zgpVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zhhVar.b;
            zhhVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zhhVar.p(new zhg(str));
                    throw th;
                }
            }
            zhhVar.p(new zhg(str + ": " + zgpVar.toString()));
        } finally {
            zgpVar.cancel(true);
        }
    }
}
