package com.google.firebase.messaging.a;

import com.google.android.datatransport.h;
import com.google.firebase.sessions.ai;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10114a;

    public g(com.google.firebase.g.c cVar) {
        x.f(cVar, "transportFactoryProvider");
        this.f10114a = cVar;
    }

    public static f b() {
        return new f();
    }

    public final e a() {
        return (e) this.f10114a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.g.c, java.lang.Object] */
    public final void c(ai aiVar) {
        x.f(aiVar, "sessionEvent");
        ((h) this.f10114a.a()).a("FIREBASE_APPQUALITY_SESSION", com.google.android.datatransport.a.a("json"), new com.google.firebase.crashlytics.a.g.a(3)).b(com.google.android.datatransport.b.a(aiVar));
    }

    g(e eVar) {
        this.f10114a = eVar;
    }
}
