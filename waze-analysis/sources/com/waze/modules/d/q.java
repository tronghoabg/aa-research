package com.waze.modules.d;

import com.google.v.fi;
import com.google.v.gc;
import com.waze.car_lib.r.ak;
import com.waze.car_lib.r.cq;
import com.waze.car_lib.r.cr;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q implements com.waze.stats.w {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.g.d f30240a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30241b;

    public q(com.waze.g.d dVar, int i2) {
        this.f30241b = i2;
        h.g.b.x.f(dVar, "applicationInfoRepository");
        this.f30240a = dVar;
    }

    @Override // com.waze.stats.w
    public final /* synthetic */ fi a(com.waze.stats.y yVar) {
        if (this.f30241b == 0) {
            h.g.b.x.f(yVar, "sharedRequestMetadata");
            com.waze.n.w wVarNewBuilder = com.waze.n.x.newBuilder();
            h.g.b.x.f(wVarNewBuilder, "builder");
            com.waze.n.r rVarC = yVar.c();
            if (rVarC != null) {
                h.g.b.x.f(rVarC, "value");
                wVarNewBuilder.c(rVarC);
            }
            gc gcVarA = yVar.a();
            h.g.b.x.f(gcVarA, "value");
            wVarNewBuilder.e(gcVarA);
            String strD = yVar.d();
            h.g.b.x.f(strD, "value");
            wVarNewBuilder.d(strD);
            com.waze.n.i iVarB = yVar.b();
            h.g.b.x.f(iVarB, "value");
            wVarNewBuilder.a(iVarB);
            com.waze.car_lib.r.y yVarJ = cq.j(com.waze.n.k.newBuilder());
            yVarJ.f(com.waze.n.s.ANDROID);
            com.waze.g.d dVar = this.f30240a;
            String strC = dVar.c();
            if (strC != null) {
                yVarJ.h(strC);
            }
            yVarJ.d(dVar.a().b());
            yVarJ.c(dVar.a().a());
            yVarJ.e(dVar.b().b());
            String strC2 = com.waze.stats.storage.h.c();
            h.g.b.x.e(strC2, "getOsVersion(...)");
            yVarJ.g(strC2);
            com.waze.n.k kVarB = yVarJ.b();
            h.g.b.x.f(kVarB, "value");
            wVarNewBuilder.b(kVarB);
            com.waze.n.x xVarBuild = wVarNewBuilder.build();
            h.g.b.x.e(xVarBuild, "build(...)");
            return xVarBuild;
        }
        h.g.b.x.f(yVar, "sharedRequestMetadata");
        com.waze.n.c cVarNewBuilder = com.waze.n.d.newBuilder();
        h.g.b.x.f(cVarNewBuilder, "builder");
        com.waze.n.r rVarC2 = yVar.c();
        if (rVarC2 != null) {
            h.g.b.x.f(rVarC2, "value");
            cVarNewBuilder.c(rVarC2);
        }
        gc gcVarA2 = yVar.a();
        h.g.b.x.f(gcVarA2, "value");
        cVarNewBuilder.e(gcVarA2);
        String strD2 = yVar.d();
        h.g.b.x.f(strD2, "value");
        cVarNewBuilder.d(strD2);
        com.waze.n.i iVarB2 = yVar.b();
        h.g.b.x.f(iVarB2, "value");
        cVarNewBuilder.a(iVarB2);
        ak akVarC = cr.c(com.waze.n.f.newBuilder());
        com.waze.g.d dVar2 = this.f30240a;
        akVarC.c(((com.waze.g.c) dVar2.e().d()).a());
        com.waze.n.f fVarB = akVarC.b();
        h.g.b.x.f(fVarB, "value");
        cVarNewBuilder.f(fVarB);
        com.waze.car_lib.r.y yVarJ2 = cq.j(com.waze.n.k.newBuilder());
        yVarJ2.f(com.waze.n.s.ANDROID);
        String strC3 = dVar2.c();
        if (strC3 != null) {
            yVarJ2.h(strC3);
        }
        yVarJ2.d(dVar2.a().b());
        yVarJ2.c(dVar2.a().a());
        yVarJ2.e(dVar2.b().a());
        String strC4 = com.waze.stats.storage.h.c();
        h.g.b.x.e(strC4, "getOsVersion(...)");
        yVarJ2.g(strC4);
        com.waze.n.k kVarB2 = yVarJ2.b();
        h.g.b.x.f(kVarB2, "value");
        cVarNewBuilder.b(kVarB2);
        com.waze.n.d dVarBuild = cVarNewBuilder.build();
        h.g.b.x.e(dVarBuild, "build(...)");
        return dVarBuild;
    }

    public q(com.waze.g.d dVar, int i2, byte[] bArr) {
        this.f30241b = i2;
        h.g.b.x.f(dVar, "applicationInfoRepository");
        this.f30240a = dVar;
    }
}
