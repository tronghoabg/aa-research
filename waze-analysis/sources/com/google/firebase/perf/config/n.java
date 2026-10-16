package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends w {

    /* renamed from: a, reason: collision with root package name */
    private static n f10317a;

    public static synchronized n a() {
        n nVar;
        nVar = f10317a;
        if (nVar == null) {
            nVar = new n();
            f10317a = nVar;
        }
        return nVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }
}
