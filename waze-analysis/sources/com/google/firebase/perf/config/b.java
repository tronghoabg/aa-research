package com.google.firebase.perf.config;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends w {

    /* renamed from: a, reason: collision with root package name */
    private static b f10305a;

    protected static synchronized b a() {
        b bVar;
        bVar = f10305a;
        if (bVar == null) {
            bVar = new b();
            f10305a = bVar;
        }
        return bVar;
    }

    @Override // com.google.firebase.perf.config.w
    protected final String b() {
        return "firebase_performance_collection_deactivated";
    }
}
