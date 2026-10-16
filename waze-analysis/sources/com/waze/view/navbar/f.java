package com.waze.view.navbar;

import com.waze.stats.ax;
import h.a.r;
import h.g.b.x;
import java.util.List;
import l.a.afq;
import l.a.afr;
import l.a.bjn;
import l.a.bjt;
import l.a.bju;
import l.a.bjv;
import l.a.bjw;
import l.a.btg;
import l.a.bth;
import l.a.bti;
import l.a.gz;
import l.a.ha;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    private final ax f45077b;

    public f(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f45077b = axVar;
    }

    @Override // com.waze.view.navbar.e
    public final void a(long j2) {
        com.waze.shared_infra.s.c cVarC = r.C(bjn.newBuilder());
        gz gzVarNewBuilder = ha.newBuilder();
        x.f(gzVarNewBuilder, "builder");
        gzVarNewBuilder.a(j2);
        ha haVarBuild = gzVarNewBuilder.build();
        x.e(haVarBuild, "build(...)");
        cVarC.T(haVarBuild);
        com.waze.sharedui.utils.o.I(this.f45077b, cVarC.S());
    }

    @Override // com.waze.view.navbar.e
    public final void b(boolean z, long j2) {
        com.waze.shared_infra.s.c cVarC = r.C(bjn.newBuilder());
        btg btgVarNewBuilder = bti.newBuilder();
        x.f(btgVarNewBuilder, "builder");
        btgVarNewBuilder.b(z);
        btgVarNewBuilder.a(j2);
        bth bthVar = bth.AVERAGE_SPEED_CAMERA_ZONE;
        x.f(bthVar, "value");
        btgVarNewBuilder.c(bthVar);
        bti btiVarBuild = btgVarNewBuilder.build();
        x.e(btiVarBuild, "build(...)");
        cVarC.X(btiVarBuild);
        com.waze.sharedui.utils.o.I(this.f45077b, cVarC.S());
    }

    @Override // com.waze.view.navbar.e
    public final void c(long j2, long j3) {
        com.waze.shared_infra.s.c cVarC = r.C(bjn.newBuilder());
        afq afqVarNewBuilder = afr.newBuilder();
        x.f(afqVarNewBuilder, "builder");
        afqVarNewBuilder.b(j2);
        afqVarNewBuilder.a(j3);
        afr afrVarBuild = afqVarNewBuilder.build();
        x.e(afrVarBuild, "build(...)");
        cVarC.U(afrVarBuild);
        com.waze.sharedui.utils.o.I(this.f45077b, cVarC.S());
    }

    @Override // com.waze.view.navbar.e
    public final void d(int i2, List list) {
        x.f(list, "jams");
        bjt bjtVarNewBuilder = bju.newBuilder();
        bjtVarNewBuilder.a(com.waze.view.anim.c.b(list));
        bjtVarNewBuilder.b(i2);
        bju bjuVarBuild = bjtVarNewBuilder.build();
        x.e(bjuVarBuild, "build(...)");
        com.waze.shared_infra.s.c cVarC = r.C(bjn.newBuilder());
        cVarC.V(bjuVarBuild);
        com.waze.sharedui.utils.o.I(this.f45077b, cVarC.S());
    }

    @Override // com.waze.view.navbar.e
    public final void e(boolean z, int i2, List list) {
        x.f(list, "jams");
        bjv bjvVarNewBuilder = bjw.newBuilder();
        bjvVarNewBuilder.a(com.waze.view.anim.c.b(list));
        bjvVarNewBuilder.b(i2);
        bjvVarNewBuilder.c(z);
        bjw bjwVarBuild = bjvVarNewBuilder.build();
        x.e(bjwVarBuild, "build(...)");
        com.waze.shared_infra.s.c cVarC = r.C(bjn.newBuilder());
        cVarC.W(bjwVarBuild);
        com.waze.sharedui.utils.o.I(this.f45077b, cVarC.S());
    }
}
