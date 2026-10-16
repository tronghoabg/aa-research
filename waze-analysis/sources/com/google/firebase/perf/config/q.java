package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q extends w {

    /* renamed from: a, reason: collision with root package name */
    private static q f10320a;

    public static synchronized q a() {
        q qVar;
        qVar = f10320a;
        if (qVar == null) {
            qVar = new q();
            f10320a = qVar;
        }
        return qVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }
}
