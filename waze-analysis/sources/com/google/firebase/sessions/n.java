package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10975a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f10976b;

    public n(com.google.firebase.e eVar, com.google.firebase.sessions.b.k kVar, h.c.j jVar, ax axVar) {
        h.g.b.x.f(eVar, "firebaseApp");
        h.g.b.x.f(kVar, "settings");
        h.g.b.x.f(jVar, "backgroundDispatcher");
        h.g.b.x.f(axVar, "lifecycleServiceBinder");
        this.f10975a = eVar;
        this.f10976b = kVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = eVar.a().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(az.f10855a);
            kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(jVar), null, null, new m(this, jVar, axVar, null), 3);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + ".");
    }

    public static final /* synthetic */ com.google.firebase.e a(n nVar) {
        return (com.google.firebase.e) nVar.f10975a;
    }

    public static final /* synthetic */ com.google.firebase.sessions.b.k b(n nVar) {
        return (com.google.firebase.sessions.b.k) nVar.f10976b;
    }

    public final com.google.y.a.a.a.j c() {
        return (com.google.y.a.a.a.j) this.f10975a;
    }

    public final com.google.y.a.a.a.j d() {
        return (com.google.y.a.a.a.j) this.f10976b;
    }

    public n(com.google.y.a.a.a.j jVar, com.google.y.a.a.a.j jVar2) {
        this.f10975a = jVar;
        this.f10976b = jVar2;
    }
}
