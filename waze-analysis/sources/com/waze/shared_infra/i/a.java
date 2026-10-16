package com.waze.shared_infra.i;

import com.waze.settings.ao;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37879a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.d.c.b f37880b;

    /* renamed from: c, reason: collision with root package name */
    private static final h.f f37881c;

    /* renamed from: d, reason: collision with root package name */
    private static final h.f f37882d;

    static {
        com.google.d.c.h hVarB = com.google.d.c.h.b();
        hVarB.f(100L);
        hVarB.e();
        com.google.d.c.b bVarA = hVarB.a();
        x.e(bVarA, "build(...)");
        f37880b = bVarA;
        f37881c = h.g.a(new ao(5));
        f37882d = h.g.a(new ao(6));
    }

    public static final e a() {
        return (e) f37881c.getValue();
    }

    public static final e b() {
        return (e) f37882d.getValue();
    }

    public static final e c(c cVar) {
        e eVarA = e().a(cVar);
        x.e(eVarA, "provide(...)");
        return eVarA;
    }

    public static final e d(String str) {
        if (str == null) {
            str = "";
        }
        Object objA = f37880b.a(str, new com.google.firebase.appcheck.playintegrity.a.c(str, 7));
        x.e(objA, "get(...)");
        return (e) objA;
    }

    public static final g e() {
        org.a.d.k.b bVarC;
        m mVar;
        org.a.d.a.a aVar = f37879a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new m(g.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(g.class);
        }
        return (g) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
