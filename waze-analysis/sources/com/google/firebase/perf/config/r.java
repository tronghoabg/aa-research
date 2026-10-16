package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r extends w {

    /* renamed from: a, reason: collision with root package name */
    private static r f10321a;

    public static synchronized r a() {
        r rVar;
        rVar = f10321a;
        if (rVar == null) {
            rVar = new r();
            f10321a = rVar;
        }
        return rVar;
    }

    protected static final Long e() {
        return 100L;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }
}
