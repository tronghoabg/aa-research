package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends w {

    /* renamed from: a, reason: collision with root package name */
    private static o f10318a;

    public static synchronized o a() {
        o oVar;
        oVar = f10318a;
        if (oVar == null) {
            oVar = new o();
            f10318a = oVar;
        }
        return oVar;
    }

    protected static final Long e() {
        return 100L;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }
}
