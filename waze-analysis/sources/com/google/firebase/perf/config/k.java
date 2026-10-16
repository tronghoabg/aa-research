package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends w {

    /* renamed from: a, reason: collision with root package name */
    private static k f10314a;

    public static synchronized k a() {
        k kVar;
        kVar = f10314a;
        if (kVar == null) {
            kVar = new k();
            f10314a = kVar;
        }
        return kVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_rl_time_limit_sec";
    }
}
