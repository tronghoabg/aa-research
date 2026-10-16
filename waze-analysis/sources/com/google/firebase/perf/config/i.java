package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends w {

    /* renamed from: a, reason: collision with root package name */
    private static i f10312a;

    public static synchronized i a() {
        i iVar;
        iVar = f10312a;
        if (iVar == null) {
            iVar = new i();
            f10312a = iVar;
        }
        return iVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_rl_network_event_count_fg";
    }
}
