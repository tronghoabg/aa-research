package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p extends w {

    /* renamed from: a, reason: collision with root package name */
    private static p f10319a;

    public static synchronized p a() {
        p pVar;
        pVar = f10319a;
        if (pVar == null) {
            pVar = new p();
            f10319a = pVar;
        }
        return pVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "sessions_max_length_minutes";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_session_max_duration_min";
    }
}
