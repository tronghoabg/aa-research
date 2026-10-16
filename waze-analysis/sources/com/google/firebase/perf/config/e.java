package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends w {

    /* renamed from: a, reason: collision with root package name */
    private static e f10308a;

    protected static synchronized e a() {
        e eVar;
        eVar = f10308a;
        if (eVar == null) {
            eVar = new e();
            f10308a = eVar;
        }
        return eVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "fragment_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_vc_fragment_sampling_rate";
    }
}
