package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kjk implements java.lang.Thread.UncaughtExceptionHandler {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.UncaughtICSEHandler");
    private final defpackage.kjj b;
    private final java.lang.Thread.UncaughtExceptionHandler c;

    public kjk(defpackage.kjj kjjVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = kjjVar;
        this.c = uncaughtExceptionHandler;
    }

    private final int a(java.lang.Throwable th) {
        if (th instanceof kiw) {
            return b((kiw) th);
        }
        if (th instanceof kix) {
            int iB = b((kix) th);
            if (defpackage.actq.e()) {
                return iB;
            }
        }
        if (th.getCause() != null) {
            return a(th.getCause());
        }
        return 5;
    }

    private final int b(kiy kiyVar) {
        defpackage.zbf zbfVar;
        com.google.android.gms.car.diagnostics.CriticalError criticalErrorA;
        kiyVar.getClass();
        j$.util.Objects.checkIndex(0, 3);
        if (kiyVar instanceof kiw) {
            zbfVar = defpackage.zbf.CAR_API_OUT_OF_CAR_LIFECYCLE_EXCEPTION;
        } else if (kiyVar instanceof kix) {
            zbfVar = ((kiy) ((kix) kiyVar)).c ? defpackage.zbf.CAR_API_CAR_SERVICE_GONE_EXCEPTION : defpackage.zbf.CAR_API_CAR_SERVICE_GONE_TELEMETRY_ONLY;
        } else {
            zbfVar = defpackage.zbf.ERROR_UNSPECIFIED;
        }
        java.lang.String strA = kiyVar.a();
        if (defpackage.mkp.a == null || !defpackage.jrj.a()) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kjj.a.f()).p(kiyVar)).ai((char) 3178)).y("%s only handled in projected. Forwarding to crash handler.", strA);
            return 2;
        }
        if (kiyVar.c && !defpackage.kit.b().p() && (!(kiyVar instanceof kix) || defpackage.actq.e())) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kjj.a.g()).p(kiyVar)).ai((char) 3177)).u("Attempt to access car while not connected on client side. Forwarding to crash handler.");
            return 3;
        }
        if ((kiyVar instanceof kix) && !defpackage.actq.f()) {
            return 1;
        }
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kjj.a.f()).p(kiyVar)).ai((char) 3183)).y("Logging telemetry for %s.", strA);
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, kiyVar.a, kiyVar.b);
        rrvVarH.v(zbfVar);
        if (rrvVarH.z == null) {
            rrvVarH.z = new txf();
        }
        txf txfVar = rrvVarH.z;
        try {
            criticalErrorA = defpackage.kjj.a();
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kjj.a.g()).p(e)).ai((char) 3182)).u("Unable to fetch reason for last disconnect.");
            criticalErrorA = null;
        }
        if (criticalErrorA != null) {
            txfVar.b(defpackage.zaj.b(criticalErrorA.a));
            txfVar.c(defpackage.zak.b(criticalErrorA.b));
        } else {
            txfVar.b(defpackage.zaj.UNKNOWN_CODE);
            txfVar.c(defpackage.zak.UNKNOWN_DETAIL);
        }
        defpackage.kit kitVarB = defpackage.kit.b();
        txfVar.b = defpackage.xyn.h(java.lang.Long.valueOf(kitVarB.a() != defpackage.kis.d ? -1L : kitVarB.c.a()));
        try {
            if (((java.lang.Boolean) ((defpackage.zga) defpackage.omf.u().a(rrvVarH.l())).s()).booleanValue()) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kjj.a.f()).ai((char) 3184)).y("Telemetry guaranteed for %s.", strA);
                return 1;
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kjj.a.h()).p(e2)).ai((char) 3180)).u("Failed to log telemetry");
        }
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kjj.a.g()).p(kiyVar)).ai((char) 3185)).y("Unable to guarantee telemetry for %s. Forwarding to crash handler.", strA);
        return 4;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            int iA = a(th);
            if (iA == 1 || iA == 4) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.f()).p(th)).ai(3186)).u("Exception handled, killing process.");
                android.os.Process.killProcess(android.os.Process.myPid());
                java.lang.System.exit(10);
                return;
            }
        } catch (java.lang.Throwable th2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(th2)).ai((char) 3187)).u("Error occurred when handling exception.");
        }
        this.c.uncaughtException(thread, th);
    }
}
