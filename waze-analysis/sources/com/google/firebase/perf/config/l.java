package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l extends w {

    /* renamed from: a, reason: collision with root package name */
    private static l f10315a;

    protected static synchronized l a() {
        l lVar;
        lVar = f10315a;
        if (lVar == null) {
            lVar = new l();
            f10315a = lVar;
        }
        return lVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_disabled_android_versions";
    }
}
