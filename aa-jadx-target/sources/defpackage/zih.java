package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zih implements java.lang.Runnable {
    defpackage.zij a;

    public zih(defpackage.zij zijVar) {
        this.a = zijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.zhs zhsVar;
        defpackage.zij zijVar = this.a;
        if (zijVar == null || (zhsVar = zijVar.a) == null) {
            return;
        }
        this.a = null;
        if (zhsVar.isDone()) {
            zijVar.r(zhsVar);
            return;
        }
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = zijVar.b;
            zijVar.b = null;
            java.lang.String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (java.lang.Throwable th) {
                    zijVar.p(new zii(str));
                    throw th;
                }
            }
            zijVar.p(new zii(str + ": " + zhsVar.toString()));
            zhsVar.cancel(true);
        } catch (java.lang.Throwable th2) {
            zhsVar.cancel(true);
            throw th2;
        }
    }
}
