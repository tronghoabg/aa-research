package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xuy {
    public static final java.util.concurrent.atomic.AtomicReference a;
    public static final java.util.WeakHashMap b;
    public static final defpackage.xux c;
    static final defpackage.khb d;

    static {
        defpackage.yhx.t("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", "com.google.apps.tiktok.tracing.contrib.mdd.MddTraceFlush", new java.lang.String[0]);
        a = new java.util.concurrent.atomic.AtomicReference(defpackage.ynd.a);
        d = new defpackage.khb((char[]) null);
        b = new java.util.WeakHashMap();
        c = new defpackage.xux();
        new java.util.ArrayDeque();
        new java.util.ArrayDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static defpackage.xve a(defpackage.xve xveVar) {
        return c(xveVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xvq] */
    public static defpackage.xvq b() {
        return f().c;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static defpackage.xvq c(defpackage.xvq xvqVar) {
        return g(f(), xvqVar);
    }

    public static boolean d() {
        defpackage.xvq xvqVarB = b();
        return (xvqVarB == null || xvqVarB == defpackage.xvf.a) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xvq] */
    public static defpackage.xvq e() {
        defpackage.nrr nrrVar = (defpackage.nrr) c.get();
        ?? r1 = nrrVar.c;
        if (r1 != 0 && r1 != defpackage.xvf.a) {
            return r1;
        }
        defpackage.xuq xuqVar = defpackage.xva.a;
        java.util.UUID uuidB = defpackage.xuz.a.b();
        java.lang.String strGb = defpackage.xup.gb(uuidB);
        defpackage.yhx yhxVar = (defpackage.yhx) a.get();
        if (!yhxVar.isEmpty()) {
            j$.lang.Iterable.-EL.forEach(yhxVar, new defpackage.rdi(14));
        }
        return new defpackage.xva(uuidB, strGb, defpackage.xva.a, nrrVar);
    }

    public static defpackage.nrr f() {
        return (defpackage.nrr) c.get();
    }

    public static defpackage.xvq g(defpackage.nrr nrrVar, defpackage.xvq xvqVar) {
        java.lang.Object obj = nrrVar.b;
        return h(nrrVar, xvqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xvq] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static defpackage.xvq h(defpackage.nrr nrrVar, defpackage.xvq xvqVar) {
        defpackage.xvq xvqVar2;
        boolean zA;
        ?? r0 = nrrVar.c;
        if (r0 != xvqVar) {
            if (r0 == 0) {
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    zA = ep$.ExternalSyntheticApiModelOutline0.m();
                } else {
                    zA = wfl.a.a(d);
                }
                nrrVar.a = zA;
            }
            java.lang.Object obj = nrrVar.b;
            if (nrrVar.a) {
                if (r0 != 0) {
                    if (xvqVar == null) {
                        xvqVar2 = null;
                    } else if (r0.a() != xvqVar || defpackage.wpu.C(r0)) {
                        if (r0 != xvqVar.a() || defpackage.wpu.C(xvqVar)) {
                            xvqVar2 = xvqVar;
                        } else {
                            defpackage.wpu.z(xvqVar);
                        }
                    }
                    defpackage.wpu.B(r0);
                } else {
                    xvqVar2 = xvqVar;
                }
                if (xvqVar2 != null) {
                    defpackage.wpu.A(xvqVar2);
                }
            }
            if (r0 != xvqVar) {
                if (xvqVar == null) {
                    xvqVar = null;
                }
                nrrVar.c = xvqVar;
                return r0;
            }
        }
        return xvqVar;
    }
}
