package com.google.firebase.perf.e;

import com.google.firebase.perf.metrics.Trace;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10405a = com.google.firebase.perf.c.a.a();

    public static void a(Trace trace, com.google.firebase.perf.metrics.e eVar) {
        if (eVar.c() > 0) {
            trace.putMetric(a.FRAMES_TOTAL.toString(), eVar.c());
        }
        if (eVar.b() > 0) {
            trace.putMetric(a.FRAMES_SLOW.toString(), eVar.b());
        }
        if (eVar.a() > 0) {
            trace.putMetric(a.FRAMES_FROZEN.toString(), eVar.a());
        }
        f10405a.b("Screen trace: " + trace.d() + " _fr_tot:" + eVar.c() + " _fr_slo:" + eVar.b() + " _fr_fzn:" + eVar.a());
    }
}
