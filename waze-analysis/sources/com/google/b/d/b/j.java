package com.google.b.d.b;

import android.os.Trace;
import com.google.d.d.ci;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7093a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ci f7094b = ci.u("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl", "com.google.apps.tiktok.tracing.contrib.mdd.MddTraceFlush", new String[0]);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference f7095c = new AtomicReference(ci.o());

    /* renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f7096d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final i f7097e = new i();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    public static w a() {
        return (w) f7097e.get();
    }

    public static x b() {
        w wVarA = a();
        x xVar = wVarA.f7137b;
        return (xVar == null || xVar == o.f7107a) ? l.i(wVarA) : xVar;
    }

    public static x c(w wVar, x xVar) {
        ai aiVar = wVar.f7138c;
        x xVar2 = wVar.f7137b;
        if (xVar2 != xVar) {
            if (xVar2 == null) {
                wVar.f7136a = Trace.isEnabled();
            }
            if (wVar.f7136a) {
                ai.c(xVar2, xVar);
            }
            if (xVar2 != xVar) {
                wVar.f7137b = xVar;
                return xVar2;
            }
        }
        return xVar;
    }

    static ci d() {
        return (ci) f7095c.get();
    }
}
