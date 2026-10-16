package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s extends w {

    /* renamed from: a, reason: collision with root package name */
    private static s f10322a;

    public static synchronized s a() {
        s sVar;
        sVar = f10322a;
        if (sVar == null) {
            sVar = new s();
            f10322a = sVar;
        }
        return sVar;
    }

    protected static final Double e() {
        return Double.valueOf(0.01d);
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "sessions_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_vc_session_sampling_rate";
    }
}
