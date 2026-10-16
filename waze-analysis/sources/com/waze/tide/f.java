package com.waze.tide;

import i.b.l.cc;
import i.b.l.cd;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.f.k f40934a;

    public f(com.waze.sharedui.f.k kVar) {
        h.g.b.x.f(kVar, "networkGateway");
        this.f40934a = kVar;
    }

    public final void a(e eVar) {
        h.g.b.x.f(eVar, "report");
        i.b.b.a.l lVarNewBuilder = i.b.b.a.m.newBuilder();
        if (eVar.a() != null) {
            i.b.b.a.d dVarNewBuilder = i.b.b.a.e.newBuilder();
            i.b.p pVarNewBuilder = i.b.s.newBuilder();
            pVarNewBuilder.b(eVar.a().f().d());
            pVarNewBuilder.a(eVar.a().f().c());
            dVarNewBuilder.b(pVarNewBuilder.build());
            dVarNewBuilder.a(eVar.a().c());
            lVarNewBuilder.b(dVarNewBuilder.build());
        }
        i.b.b.a.a aVarNewBuilder = i.b.b.a.b.newBuilder();
        com.waze.bz.a aVarB = eVar.b();
        if (aVarB instanceof a) {
            aVarNewBuilder.a(((a) eVar.b()).a());
        } else if (aVarB instanceof c) {
            aVarNewBuilder.b(((c) eVar.b()).a());
        } else {
            if (!(aVarB instanceof b)) {
                throw new h.i();
            }
            aVarNewBuilder.a(((b) eVar.b()).a());
            aVarNewBuilder.b(((b) eVar.b()).b());
        }
        lVarNewBuilder.a(aVarNewBuilder);
        i.b.b.a.m mVarBuild = lVarNewBuilder.build();
        h.g.b.x.e(mVarBuild, "build(...)");
        com.waze.sharedui.f.k kVar = this.f40934a;
        int i2 = com.waze.sharedui.api.a.f38785a;
        com.waze.sharedui.f.d dVarZ = com.waze.sharedui.api.a.z();
        cc ccVarNewBuilder = cd.newBuilder();
        ccVarNewBuilder.J(mVarBuild);
        cd cdVarBuild = ccVarNewBuilder.build();
        h.g.b.x.e(cdVarBuild, "build(...)");
        kVar.g(dVarZ, cdVarBuild, new d(0));
    }
}
