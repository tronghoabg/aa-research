package com.waze.location;

import l.a.bpb;
import l.a.bpd;
import l.a.brd;
import l.a.brf;
import l.a.iw;
import l.a.ix;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bn implements bm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f25379a;

    public bn(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "statsReporter");
        this.f25379a = axVar;
    }

    @Override // com.waze.location.bm
    public final void a(double d2) {
        bpb bpbVarNewBuilder = bpd.newBuilder();
        h.g.b.x.f(bpbVarNewBuilder, "builder");
        iw iwVarNewBuilder = ix.newBuilder();
        h.g.b.x.f(iwVarNewBuilder, "builder");
        iwVarNewBuilder.a(d2);
        ix ixVarBuild = iwVarNewBuilder.build();
        h.g.b.x.e(ixVarBuild, "build(...)");
        ix ixVar = ixVarBuild;
        h.g.b.x.f(ixVar, "value");
        bpbVarNewBuilder.a(ixVar);
        bpd bpdVarBuild = bpbVarNewBuilder.build();
        h.g.b.x.e(bpdVarBuild, "build(...)");
        bpd bpdVar = bpdVarBuild;
        com.waze.stats.ax axVar = this.f25379a;
        h.g.b.x.f(axVar, "<this>");
        h.g.b.x.f(bpdVar, "wrapper");
        brd brdVarNewBuilder = brf.newBuilder();
        brdVarNewBuilder.X(bpdVar);
        brf brfVarBuild = brdVarNewBuilder.build();
        h.g.b.x.e(brfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.e(axVar, brfVarBuild);
    }
}
