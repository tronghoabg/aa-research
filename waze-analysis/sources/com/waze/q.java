package com.waze;

import l.a.abm;
import l.a.abn;
import l.a.abo;
import l.a.abp;
import l.a.axq;
import l.a.axr;
import l.a.axs;
import l.a.th;
import l.a.ti;
import l.a.tj;
import l.a.tk;
import l.a.tl;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f33451a;

    public q(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f33451a = axVar;
    }

    @Override // com.waze.p
    public final void a() {
        l.a.el elVarBuild = l.a.el.newBuilder().build();
        h.g.b.x.e(elVarBuild, "build(...)");
        l.a.ez ezVarNewBuilder = l.a.fb.newBuilder();
        ezVarNewBuilder.a(elVarBuild);
        l.a.fb fbVarBuild = ezVarNewBuilder.build();
        h.g.b.x.e(fbVarBuild, "build(...)");
        com.waze.sharedui.utils.o.h(this.f33451a, fbVarBuild);
    }

    @Override // com.waze.p
    public final void b() {
        l.a.en enVarBuild = l.a.en.newBuilder().build();
        h.g.b.x.e(enVarBuild, "build(...)");
        l.a.ez ezVarNewBuilder = l.a.fb.newBuilder();
        ezVarNewBuilder.b(enVarBuild);
        l.a.fb fbVarBuild = ezVarNewBuilder.build();
        h.g.b.x.e(fbVarBuild, "build(...)");
        com.waze.sharedui.utils.o.h(this.f33451a, fbVarBuild);
    }

    @Override // com.waze.p
    public final void c() {
        com.waze.sharedui.web.as asVarQ = e.a.d.jm.q(l.a.fb.newBuilder());
        th thVarNewBuilder = ti.newBuilder();
        h.g.b.x.f(thVarNewBuilder, "builder");
        ti tiVarBuild = thVarNewBuilder.build();
        h.g.b.x.e(tiVarBuild, "build(...)");
        asVarQ.l(tiVarBuild);
        com.waze.sharedui.utils.o.h(this.f33451a, asVarQ.k());
    }

    @Override // com.waze.p
    public final void d(o oVar) {
        tk tkVar;
        com.waze.sharedui.web.as asVarQ = e.a.d.jm.q(l.a.fb.newBuilder());
        tj tjVarNewBuilder = tl.newBuilder();
        h.g.b.x.f(tjVarNewBuilder, "builder");
        if (oVar != null) {
            int iOrdinal = oVar.ordinal();
            if (iOrdinal == 0) {
                tkVar = tk.EVERY_COLD_START;
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                tkVar = tk.DAILY;
            }
            h.g.b.x.f(tkVar, "value");
            tjVarNewBuilder.a(tkVar);
        }
        com.waze.stats.ax axVar = this.f33451a;
        tl tlVarBuild = tjVarNewBuilder.build();
        h.g.b.x.e(tlVarBuild, "build(...)");
        asVarQ.m(tlVarBuild);
        com.waze.sharedui.utils.o.h(axVar, asVarQ.k());
    }

    @Override // com.waze.p
    public final void e() {
        com.waze.sharedui.web.as asVarQ = e.a.d.jm.q(l.a.fb.newBuilder());
        abm abmVarNewBuilder = abn.newBuilder();
        h.g.b.x.f(abmVarNewBuilder, "builder");
        abn abnVarBuild = abmVarNewBuilder.build();
        h.g.b.x.e(abnVarBuild, "build(...)");
        asVarQ.n(abnVarBuild);
        com.waze.sharedui.utils.o.h(this.f33451a, asVarQ.k());
    }

    @Override // com.waze.p
    public final void f() {
        com.waze.sharedui.web.as asVarQ = e.a.d.jm.q(l.a.fb.newBuilder());
        abo aboVarNewBuilder = abp.newBuilder();
        h.g.b.x.f(aboVarNewBuilder, "builder");
        abp abpVarBuild = aboVarNewBuilder.build();
        h.g.b.x.e(abpVarBuild, "build(...)");
        asVarQ.o(abpVarBuild);
        com.waze.sharedui.utils.o.h(this.f33451a, asVarQ.k());
    }

    @Override // com.waze.p
    public final void g(int i2) {
        com.waze.sharedui.web.as asVarQ = e.a.d.jm.q(l.a.fb.newBuilder());
        axq axqVarNewBuilder = axs.newBuilder();
        h.g.b.x.f(axqVarNewBuilder, "builder");
        axr axrVar = i2 == 1 ? axr.PORTRAIT : axr.LANDSCAPE;
        com.waze.stats.ax axVar = this.f33451a;
        h.g.b.x.f(axrVar, "value");
        axqVarNewBuilder.a(axrVar);
        axs axsVarBuild = axqVarNewBuilder.build();
        h.g.b.x.e(axsVarBuild, "build(...)");
        asVarQ.p(axsVarBuild);
        com.waze.sharedui.utils.o.h(axVar, asVarQ.k());
    }
}
