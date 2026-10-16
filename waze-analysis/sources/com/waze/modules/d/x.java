package com.waze.modules.d;

import com.google.v.fi;
import com.google.v.gc;
import com.waze.car_lib.r.ak;
import com.waze.car_lib.r.cr;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x implements com.waze.stats.r {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.g.d f30261a;

    /* renamed from: b, reason: collision with root package name */
    private final af f30262b;

    /* renamed from: c, reason: collision with root package name */
    private int f30263c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f30264d;

    public x(com.waze.g.d dVar, af afVar) {
        h.g.b.x.f(dVar, "applicationInfoRepository");
        h.g.b.x.f(afVar, "coroutineScope");
        this.f30261a = dVar;
        this.f30262b = afVar;
        this.f30263c = 1;
        w wVar = new w(new w(dVar.e(), 0), 1);
        int i2 = bz.f51630a;
        this.f30264d = ai.V(wVar, afVar, by.b(), null);
    }

    @Override // com.waze.stats.r
    public final /* synthetic */ fi a(com.waze.stats.x xVar) {
        h.g.b.x.f(xVar, "sharedEventMetadata");
        com.waze.n.a aVarNewBuilder = com.waze.n.b.newBuilder();
        h.g.b.x.f(aVarNewBuilder, "builder");
        gc gcVarA = xVar.a();
        h.g.b.x.f(gcVarA, "value");
        aVarNewBuilder.d(gcVarA);
        com.waze.n.t tVarD = xVar.d();
        h.g.b.x.f(tVarD, "value");
        aVarNewBuilder.e(tVarD);
        com.waze.n.p pVarC = xVar.c();
        h.g.b.x.f(pVarC, "value");
        aVarNewBuilder.c(pVarC);
        com.waze.n.m mVarB = xVar.b();
        h.g.b.x.f(mVarB, "value");
        aVarNewBuilder.b(mVarB);
        int i2 = this.f30263c;
        this.f30263c = i2 + 1;
        aVarNewBuilder.f(i2);
        ak akVarC = cr.c(com.waze.n.f.newBuilder());
        String str = (String) this.f30264d.d();
        if (str != null) {
            akVarC.d(str);
        }
        com.waze.g.d dVar = this.f30261a;
        akVarC.c(((com.waze.g.c) dVar.e().d()).a());
        akVarC.e(((com.waze.g.c) dVar.e().d()).c());
        com.waze.n.f fVarB = akVarC.b();
        h.g.b.x.f(fVarB, "value");
        aVarNewBuilder.g(fVarB);
        dVar.d();
        h.g.b.x.f("5.20.90.901", "value");
        aVarNewBuilder.a();
        com.waze.n.b bVarBuild = aVarNewBuilder.build();
        h.g.b.x.e(bVarBuild, "build(...)");
        return bVarBuild;
    }
}
