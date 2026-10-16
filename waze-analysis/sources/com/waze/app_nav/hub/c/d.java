package com.waze.app_nav.hub.c;

import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ d f15297a = new d();

    public static final e a(final e eVar, final f fVar) {
        x.f(eVar, "<this>");
        x.f(fVar, "priority");
        return new e() { // from class: com.waze.app_nav.hub.c.c
            @Override // com.waze.app_nav.hub.c.e
            public final b a(Object obj) {
                org.a.d.k.b bVarC;
                h.g.b.m mVar;
                org.a.d.a.a aVar = d.f15297a;
                if (aVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i2 = ar.f48106a;
                    mVar = new h.g.b.m(g.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i3 = ar.f48106a;
                    mVar = new h.g.b.m(g.class);
                }
                Object objA = bVarC.a(mVar, null, null);
                return new s((g) objA, eVar.a(obj), fVar);
            }
        };
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
