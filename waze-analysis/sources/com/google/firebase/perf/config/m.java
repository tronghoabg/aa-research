package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    private static m f10316a;

    protected static synchronized m a() {
        m mVar;
        mVar = f10316a;
        if (mVar == null) {
            mVar = new m();
            f10316a = mVar;
        }
        return mVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_enabled";
    }
}
