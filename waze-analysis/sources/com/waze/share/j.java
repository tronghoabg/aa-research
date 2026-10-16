package com.waze.share;

import com.waze.stats.ax;
import l.a.bce;
import l.a.bcj;
import l.a.bck;
import l.a.bcl;
import l.a.bcm;
import l.a.bdg;
import l.a.bdh;
import l.a.bdi;
import l.a.bdj;
import l.a.bdk;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    private final ax f37715b;

    public j(ax axVar) {
        h.g.b.x.f(axVar, "statsReporter");
        this.f37715b = axVar;
    }

    @Override // com.waze.share.i
    public final void a(h hVar, String str) {
        h.g.b.x.f(hVar, "action");
        com.waze.shared_infra.coordinators.c cVarAS = h.a.c.aS(bdg.newBuilder());
        bcj bcjVarNewBuilder = bck.newBuilder();
        h.g.b.x.f(bcjVarNewBuilder, "builder");
        com.waze.shared_infra.coordinators.c cVarAT = h.a.c.aT(bce.newBuilder());
        cVarAT.U(com.waze.settings.tree.a.d.e(hVar));
        if (str != null) {
            cVarAT.V(str);
        }
        ax axVar = this.f37715b;
        bce bceVarT = cVarAT.T();
        h.g.b.x.f(bceVarT, "value");
        bcjVarNewBuilder.a(bceVarT);
        bck bckVarBuild = bcjVarNewBuilder.build();
        h.g.b.x.e(bckVarBuild, "build(...)");
        cVarAS.P(bckVarBuild);
        com.waze.sharedui.utils.o.F(axVar, cVarAS.O());
    }

    @Override // com.waze.share.i
    public final void b() {
        com.waze.shared_infra.coordinators.c cVarAS = h.a.c.aS(bdg.newBuilder());
        bcl bclVarNewBuilder = bcm.newBuilder();
        h.g.b.x.f(bclVarNewBuilder, "builder");
        bcm bcmVarBuild = bclVarNewBuilder.build();
        h.g.b.x.e(bcmVarBuild, "build(...)");
        cVarAS.Q(bcmVarBuild);
        com.waze.sharedui.utils.o.F(this.f37715b, cVarAS.O());
    }

    @Override // com.waze.share.i
    public final void c(h hVar, String str) {
        h.g.b.x.f(hVar, "action");
        com.waze.shared_infra.coordinators.c cVarAS = h.a.c.aS(bdg.newBuilder());
        bdh bdhVarNewBuilder = bdi.newBuilder();
        h.g.b.x.f(bdhVarNewBuilder, "builder");
        com.waze.shared_infra.coordinators.c cVarAT = h.a.c.aT(bce.newBuilder());
        cVarAT.U(com.waze.settings.tree.a.d.e(hVar));
        if (str != null) {
            cVarAT.V(str);
        }
        ax axVar = this.f37715b;
        bce bceVarT = cVarAT.T();
        h.g.b.x.f(bceVarT, "value");
        bdhVarNewBuilder.a(bceVarT);
        bdi bdiVarBuild = bdhVarNewBuilder.build();
        h.g.b.x.e(bdiVarBuild, "build(...)");
        cVarAS.R(bdiVarBuild);
        com.waze.sharedui.utils.o.F(axVar, cVarAS.O());
    }

    @Override // com.waze.share.i
    public final void d() {
        com.waze.shared_infra.coordinators.c cVarAS = h.a.c.aS(bdg.newBuilder());
        bdj bdjVarNewBuilder = bdk.newBuilder();
        h.g.b.x.f(bdjVarNewBuilder, "builder");
        bdk bdkVarBuild = bdjVarNewBuilder.build();
        h.g.b.x.e(bdkVarBuild, "build(...)");
        cVarAS.S(bdkVarBuild);
        com.waze.sharedui.utils.o.F(this.f37715b, cVarAS.O());
    }
}
