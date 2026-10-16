package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends w {

    /* renamed from: a, reason: collision with root package name */
    private static c f10306a;

    protected static synchronized c a() {
        c cVar;
        cVar = f10306a;
        if (cVar == null) {
            cVar = new c();
            f10306a = cVar;
        }
        return cVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "firebase_performance_collection_enabled";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "isEnabled";
    }
}
