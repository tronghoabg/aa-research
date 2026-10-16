package com.waze.an.e;

import com.waze.ab.ab;
import com.waze.asks.at;
import com.waze.asks.av;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import l.a.avc;
import l.a.bcb;
import l.a.brz;
import l.a.ck;
import l.a.cs;
import l.a.ct;
import l.a.cu;
import l.a.cv;
import l.a.cw;
import l.a.cx;
import l.a.cy;
import l.a.cz;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14876a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14877b;

    public m(ax axVar, com.waze.reports_v2.d.j jVar) {
        x.f(axVar, "wazeStatsReporter");
        x.f(jVar, "reportingStatsSender");
        this.f14876a = axVar;
        this.f14877b = jVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.stats.ax, java.lang.Object] */
    public final void a(at atVar, l lVar) {
        cv cvVar;
        x.f(atVar, "question");
        x.f(lVar, "clickAction");
        com.waze.shared_infra.coordinators.c cVarK = h.g.k(bcb.newBuilder());
        cw cwVarNewBuilder = cx.newBuilder();
        x.f(cwVarNewBuilder, "builder");
        ck ckVarF = ab.f(atVar);
        x.f(ckVarF, "value");
        cwVarNewBuilder.b(ckVarF);
        l lVar2 = l.f14872a;
        int iOrdinal = lVar.ordinal();
        if (iOrdinal == 0) {
            cvVar = cv.DENIAL;
        } else if (iOrdinal == 1) {
            cvVar = cv.OPEN_SETTINGS;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            cvVar = cv.COLLAPSE;
        }
        ?? r3 = this.f14876a;
        x.f(cvVar, "value");
        cwVarNewBuilder.a(cvVar);
        cx cxVarBuild = cwVarNewBuilder.build();
        x.e(cxVarBuild, "build(...)");
        cVarK.Y(cxVarBuild);
        o.E(r3, cVarK.W());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.stats.ax, java.lang.Object] */
    public final void b(at atVar) {
        x.f(atVar, "question");
        com.waze.shared_infra.coordinators.c cVarK = h.g.k(bcb.newBuilder());
        cy cyVarNewBuilder = cz.newBuilder();
        x.f(cyVarNewBuilder, "builder");
        ck ckVarF = ab.f(atVar);
        x.f(ckVarF, "value");
        cyVarNewBuilder.a(ckVarF);
        cz czVarBuild = cyVarNewBuilder.build();
        x.e(czVarBuild, "build(...)");
        cVarK.Z(czVarBuild);
        o.E(this.f14876a, cVarK.W());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.stats.ax, java.lang.Object] */
    public final void c(at atVar, boolean z) {
        x.f(atVar, "question");
        e.a.f.a.e eVarZ = e.c.d.a.z(avc.newBuilder());
        cs csVarNewBuilder = cu.newBuilder();
        x.f(csVarNewBuilder, "builder");
        brz brzVarH = ab.h(atVar);
        x.f(brzVarH, "value");
        csVarNewBuilder.b(brzVarH);
        ct ctVar = z ? ct.THANKS_FOR_FEEDBACK : ct.HIDDEN_CURRENT_DRIVE;
        ?? r3 = this.f14876a;
        x.f(ctVar, "value");
        csVarNewBuilder.a(ctVar);
        cu cuVarBuild = csVarNewBuilder.build();
        x.e(cuVarBuild, "build(...)");
        eVarZ.E(cuVarBuild);
        o.C(r3, eVarZ.D());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.reports_v2.d.j, java.lang.Object] */
    public final void d(at atVar, com.waze.asks.f fVar) {
        x.f(atVar, "question");
        x.f(fVar, "answer");
        this.f14877b.H(atVar, fVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.reports_v2.d.j, java.lang.Object] */
    public final void e(av avVar, k kVar) {
        com.waze.reports_v2.d.i iVar;
        x.f(avVar, "question");
        x.f(kVar, "dismissReason");
        k kVar2 = k.f14869a;
        int iOrdinal = kVar.ordinal();
        if (iOrdinal == 0) {
            iVar = com.waze.reports_v2.d.i.f34593b;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            iVar = com.waze.reports_v2.d.i.f34592a;
        }
        this.f14877b.I(avVar, iVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.reports_v2.d.j, java.lang.Object] */
    public final void f(av avVar) {
        x.f(avVar, "question");
        this.f14877b.J(avVar, false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.reports_v2.d.j, java.lang.Object] */
    public final void g(av avVar) {
        x.f(avVar, "question");
        this.f14877b.J(avVar, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch h() {
        return this.f14876a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void i() {
        ?? r0;
        Object objD;
        do {
            r0 = this.f14877b;
            objD = r0.d();
        } while (!r0.f(objD, null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    public final void j(at atVar) {
        x.f(atVar, "question");
        this.f14877b.e(atVar);
    }

    public m() {
        bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.f14877b = bnVarB;
        this.f14876a = ai.U(bnVarB);
    }
}
