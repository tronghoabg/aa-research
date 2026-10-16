package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10330a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private final Map f10331b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f10332c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.perf.e.e f10333d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f10334e;

    d(com.google.firebase.e eVar, com.google.firebase.g.c cVar, com.google.firebase.installations.d dVar, com.google.firebase.g.c cVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        Bundle bundle = null;
        this.f10334e = null;
        com.google.firebase.perf.d.f.a().h(eVar, dVar, cVar2);
        Context contextA = eVar.a();
        try {
            bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            Log.d("isEnabled", "No perf enable meta data found ".concat(String.valueOf(e2.getMessage())));
        }
        com.google.firebase.perf.e.e eVar2 = bundle != null ? new com.google.firebase.perf.e.e(bundle) : new com.google.firebase.perf.e.e();
        this.f10333d = eVar2;
        remoteConfigManager.setFirebaseRemoteConfigProvider(cVar);
        this.f10332c = aVar;
        aVar.s(eVar2);
        aVar.r(contextA);
        sessionManager.setApplicationContext(contextA);
        this.f10334e = aVar.p();
        com.google.firebase.perf.c.a aVar2 = f10330a;
        if (aVar2.k()) {
            Boolean bool = this.f10334e;
            if (bool != null ? bool.booleanValue() : com.google.firebase.e.b().m()) {
                aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", com.google.firebase.f.f.c(eVar.d().e(), contextA.getPackageName())));
            }
        }
    }

    public static d a() {
        return (d) com.google.firebase.e.b().f(d.class);
    }

    public final Map b() {
        return new HashMap(this.f10331b);
    }
}
