package defpackage;

import android.os.Build;
import android.os.Trace;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.lang.Iterable$EL;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xts {
    public static final AtomicReference a;
    public static final WeakHashMap b;
    public static final xtr c;
    static final kwp d;

    static {
        ygr.t("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", "com.google.apps.tiktok.tracing.contrib.mdd.MddTraceFlush", new String[0]);
        a = new AtomicReference(yly.a);
        d = new kwp((char[]) null);
        b = new WeakHashMap();
        c = new xtr();
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    public static xty a(xty xtyVar) {
        return c(xtyVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xuk] */
    public static xuk b() {
        return f().c;
    }

    @ResultIgnorabilityUnspecified
    public static xuk c(xuk xukVar) {
        return g(f(), xukVar);
    }

    public static boolean d() {
        xuk xukVarB = b();
        return (xukVarB == null || xukVarB == xtz.a) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xuk] */
    public static xuk e() {
        nrd nrdVar = (nrd) c.get();
        ?? r1 = nrdVar.c;
        if (r1 != 0 && r1 != xtz.a) {
            return r1;
        }
        xtk xtkVar = xtu.a;
        UUID uuidB = xtt.a.b();
        String strGQ = xtj.gQ(uuidB);
        ygr ygrVar = (ygr) a.get();
        if (!ygrVar.isEmpty()) {
            Iterable$EL.forEach(ygrVar, new rcn(14));
        }
        return new xtu(uuidB, strGQ, xtu.a, nrdVar);
    }

    public static nrd f() {
        return (nrd) c.get();
    }

    public static xuk g(nrd nrdVar, xuk xukVar) {
        Object obj = nrdVar.b;
        return h(nrdVar, xukVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xuk] */
    @ResultIgnorabilityUnspecified
    public static xuk h(nrd nrdVar, xuk xukVar) {
        xuk xukVar2;
        boolean zA;
        ?? r0 = nrdVar.c;
        if (r0 != xukVar) {
            if (r0 == 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zA = Trace.isEnabled();
                } else {
                    zA = wen.a.a(d);
                }
                nrdVar.a = zA;
            }
            Object obj = nrdVar.b;
            if (nrdVar.a) {
                if (r0 != 0) {
                    if (xukVar == null) {
                        xukVar2 = null;
                    } else if (r0.a() != xukVar || ysi.s(r0)) {
                        if (r0 != xukVar.a() || ysi.s(xukVar)) {
                            xukVar2 = xukVar;
                        } else {
                            ysi.p(xukVar);
                        }
                    }
                    ysi.r(r0);
                } else {
                    xukVar2 = xukVar;
                }
                if (xukVar2 != null) {
                    ysi.q(xukVar2);
                }
            }
            if (r0 != xukVar) {
                if (xukVar == null) {
                    xukVar = null;
                }
                nrdVar.c = xukVar;
                return r0;
            }
        }
        return xukVar;
    }
}
