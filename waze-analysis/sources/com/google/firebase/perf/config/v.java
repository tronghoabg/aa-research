package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends w {

    /* renamed from: a, reason: collision with root package name */
    private static v f10325a;

    protected static synchronized v a() {
        v vVar;
        vVar = f10325a;
        if (vVar == null) {
            vVar = new v();
            f10325a = vVar;
        }
        return vVar;
    }

    protected static final Double e() {
        return Double.valueOf(1.0d);
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_vc_trace_sampling_rate";
    }
}
