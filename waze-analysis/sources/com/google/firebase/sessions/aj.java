package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    public static final aj f10806a = new aj();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.a f10807b;

    static {
        com.google.firebase.d.b.d dVar = new com.google.firebase.d.b.d();
        dVar.g(i.f10955a);
        dVar.h();
        com.google.firebase.d.a aVarB = dVar.b();
        h.g.b.x.e(aVarB, "build(...)");
        f10807b = aVarB;
    }

    private aj() {
    }

    public static final b b(com.google.firebase.e eVar) {
        Object next;
        h.g.b.x.f(eVar, "firebaseApp");
        Context contextA = eVar.a();
        h.g.b.x.e(contextA, "getApplicationContext(...)");
        String packageName = contextA.getPackageName();
        PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        String strC = eVar.d().c();
        h.g.b.x.e(strC, "getApplicationId(...)");
        String str = Build.MODEL;
        h.g.b.x.e(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        h.g.b.x.e(str2, "RELEASE");
        t tVar = t.f10989d;
        h.g.b.x.c(packageName);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = strValueOf;
        }
        String str4 = Build.MANUFACTURER;
        h.g.b.x.e(str4, "MANUFACTURER");
        Context contextA2 = eVar.a();
        h.g.b.x.e(contextA2, "getApplicationContext(...)");
        h.g.b.x.f(contextA2, "context");
        int iMyPid = Process.myPid();
        Iterator it = q.a(contextA2).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((u) next).b() == iMyPid) {
                break;
            }
        }
        u uVar = (u) next;
        if (uVar == null) {
            uVar = new u(q.b(), iMyPid, 0, false);
        }
        Context contextA3 = eVar.a();
        h.g.b.x.e(contextA3, "getApplicationContext(...)");
        return new b(strC, str, str2, tVar, new a(packageName, str3, strValueOf, str4, uVar, q.a(contextA3)));
    }

    public static final com.google.firebase.d.a c() {
        return f10807b;
    }

    private static final j d(com.google.firebase.crashlytics.a.c.j jVar) {
        return jVar == null ? j.f10957b : jVar.d() ? j.f10958c : j.f10959d;
    }

    public final ai a(com.google.firebase.e eVar, ah ahVar, com.google.firebase.sessions.b.k kVar, Map map, String str, String str2) {
        h.g.b.x.f(eVar, "firebaseApp");
        h.g.b.x.f(ahVar, "sessionDetails");
        h.g.b.x.f(kVar, "sessionsSettings");
        h.g.b.x.f(map, "subscribers");
        h.g.b.x.f(str, "firebaseInstallationId");
        h.g.b.x.f(str2, "firebaseAuthenticationToken");
        return new ai(l.f10968b, new aq(ahVar.d(), ahVar.c(), ahVar.a(), ahVar.b(), new k(d((com.google.firebase.crashlytics.a.c.j) map.get(com.google.firebase.sessions.a.d.f10777b)), d((com.google.firebase.crashlytics.a.c.j) map.get(com.google.firebase.sessions.a.d.f10776a)), kVar.a()), str, str2), b(eVar));
    }
}
