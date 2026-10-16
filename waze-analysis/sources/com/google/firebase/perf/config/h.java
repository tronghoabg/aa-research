package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends w {

    /* renamed from: a, reason: collision with root package name */
    private static h f10311a;

    public static synchronized h a() {
        h hVar;
        hVar = f10311a;
        if (hVar == null) {
            hVar = new h();
            f10311a = hVar;
        }
        return hVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_rl_network_event_count_bg";
    }
}
