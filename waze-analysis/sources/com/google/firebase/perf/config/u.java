package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u extends w {

    /* renamed from: a, reason: collision with root package name */
    private static u f10324a;

    public static synchronized u a() {
        u uVar;
        uVar = f10324a;
        if (uVar == null) {
            uVar = new u();
            f10324a = uVar;
        }
        return uVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_rl_trace_event_count_fg";
    }
}
