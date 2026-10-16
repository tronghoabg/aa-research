package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends w {

    /* renamed from: a, reason: collision with root package name */
    private static d f10307a;

    protected static synchronized d a() {
        d dVar;
        dVar = f10307a;
        if (dVar == null) {
            dVar = new d();
            f10307a = dVar;
        }
        return dVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "experiment_app_start_ttid";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_experiment_app_start_ttid";
    }
}
