package com.waze.network.b;

import e.a.d.ka;
import l.a.afx;
import l.a.ank;
import l.a.anq;
import l.a.anr;
import l.a.ans;
import l.a.atp;
import l.a.ke;
import l.a.kf;
import l.a.kg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f32111a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.e.g f32112b;

    public y(com.waze.stats.ax axVar, com.waze.sharedui.e.g gVar) {
        h.g.b.x.f(axVar, "statsReporter");
        h.g.b.x.f(gVar, "locationService");
        this.f32111a = axVar;
        this.f32112b = gVar;
    }

    public final void a(int i2) {
        e.a.f.a.e eVarA = e.c.d.a.A(atp.newBuilder());
        kf kfVarNewBuilder = kg.newBuilder();
        h.g.b.x.f(kfVarNewBuilder, "builder");
        ke keVar = ke.NO_NETWORK;
        h.g.b.x.f(keVar, "value");
        kfVarNewBuilder.a(keVar);
        kfVarNewBuilder.b(i2);
        kg kgVarBuild = kfVarNewBuilder.build();
        h.g.b.x.e(kgVarBuild, "build(...)");
        eVarA.ad(kgVarBuild);
        com.waze.sharedui.utils.o.B(this.f32111a, eVarA.ac());
    }

    public final void b(ay ayVar) {
        anr anrVar;
        com.waze.shared_infra.h.c cVarF;
        h.g.b.x.f(ayVar, "networkStatus");
        if (h.g.b.x.n(ayVar, aj.f31940a)) {
            anrVar = anr.NO_NETWORK;
        } else {
            if (!h.g.b.x.n(ayVar, ak.f31941a)) {
                if (!h.g.b.x.n(ayVar, ai.f31939a)) {
                    throw new h.i();
                }
                return;
            }
            anrVar = anr.NO_SERVER_CONNECTIVITY;
        }
        com.waze.stats.ax axVar = this.f32111a;
        ka kaVarD = e.c.a.d.d(ank.newBuilder());
        anq anqVarNewBuilder = ans.newBuilder();
        h.g.b.x.f(anqVarNewBuilder, "builder");
        h.g.b.x.f(anrVar, "value");
        anqVarNewBuilder.b(anrVar);
        com.waze.sharedui.e.c cVarA = this.f32112b.a();
        if (cVarA != null && (cVarF = cVarA.f()) != null) {
            com.waze.sharedui.web.as asVarC = e.c.h.c(afx.newBuilder());
            asVarC.w(cVarF.b());
            asVarC.v(cVarF.a());
            afx afxVarU = asVarC.u();
            h.g.b.x.f(afxVarU, "value");
            anqVarNewBuilder.a(afxVarU);
        }
        ans ansVarBuild = anqVarNewBuilder.build();
        h.g.b.x.e(ansVarBuild, "build(...)");
        kaVarD.r(ansVarBuild);
        com.waze.sharedui.utils.o.z(axVar, kaVarD.p());
    }
}
