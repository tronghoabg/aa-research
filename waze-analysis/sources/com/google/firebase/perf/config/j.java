package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends w {

    /* renamed from: a, reason: collision with root package name */
    private static j f10313a;

    protected static synchronized j a() {
        j jVar;
        jVar = f10313a;
        if (jVar == null) {
            jVar = new j();
            f10313a = jVar;
        }
        return jVar;
    }

    protected static final Double e() {
        return Double.valueOf(1.0d);
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_vc_network_request_sampling_rate";
    }
}
