package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t extends w {

    /* renamed from: a, reason: collision with root package name */
    private static t f10323a;

    public static synchronized t a() {
        t tVar;
        tVar = f10323a;
        if (tVar == null) {
            tVar = new t();
            f10323a = tVar;
        }
        return tVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_rl_trace_event_count_bg";
    }
}
