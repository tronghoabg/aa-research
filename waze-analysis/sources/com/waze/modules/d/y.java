package com.waze.modules.d;

import com.google.v.fi;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y implements com.waze.stats.r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.g.d f30265a;

    /* renamed from: b, reason: collision with root package name */
    private int f30266b;

    public y(com.waze.g.d dVar) {
        h.g.b.x.f(dVar, "applicationInfoRepository");
        this.f30265a = dVar;
        this.f30266b = 1;
    }

    @Override // com.waze.stats.r
    public final /* synthetic */ fi a(com.waze.stats.x xVar) {
        h.g.b.x.f(xVar, "sharedEventMetadata");
        com.waze.n.u uVarNewBuilder = com.waze.n.v.newBuilder();
        h.g.b.x.f(uVarNewBuilder, "builder");
        gc gcVarA = xVar.a();
        h.g.b.x.f(gcVarA, "value");
        uVarNewBuilder.d(gcVarA);
        com.waze.n.t tVarD = xVar.d();
        h.g.b.x.f(tVarD, "value");
        uVarNewBuilder.e(tVarD);
        com.waze.n.p pVarC = xVar.c();
        h.g.b.x.f(pVarC, "value");
        uVarNewBuilder.c(pVarC);
        com.waze.n.m mVarB = xVar.b();
        h.g.b.x.f(mVarB, "value");
        uVarNewBuilder.b(mVarB);
        int i2 = this.f30266b;
        this.f30266b = i2 + 1;
        uVarNewBuilder.f(i2);
        this.f30265a.d();
        h.g.b.x.f("5.20.90.901", "value");
        uVarNewBuilder.a();
        com.waze.n.v vVarBuild = uVarNewBuilder.build();
        h.g.b.x.e(vVarBuild, "build(...)");
        return vVarBuild;
    }
}
