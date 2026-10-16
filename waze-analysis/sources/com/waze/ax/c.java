package com.waze.ax;

import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.c.a.h;
import h.g.b.x;
import l.a.ako;
import l.a.akq;
import l.a.brf;
import l.a.ga;
import l.a.gb;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    private final ax f16124b;

    public c(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f16124b = axVar;
    }

    @Override // com.waze.ax.b
    public final void a(String str) {
        x.f(str, "currentAppPackage");
        com.waze.sharedui.d.a.b bVarQ = h.q(brf.newBuilder());
        ako akoVarNewBuilder = akq.newBuilder();
        x.f(akoVarNewBuilder, "builder");
        ga gaVarNewBuilder = gb.newBuilder();
        x.f(gaVarNewBuilder, "builder");
        x.f(str, "value");
        gaVarNewBuilder.a(str);
        gb gbVarBuild = gaVarNewBuilder.build();
        x.e(gbVarBuild, "build(...)");
        gb gbVar = gbVarBuild;
        x.f(gbVar, "value");
        akoVarNewBuilder.a(gbVar);
        akq akqVarBuild = akoVarNewBuilder.build();
        x.e(akqVarBuild, "build(...)");
        bVarQ.ai(akqVarBuild);
        o.e(this.f16124b, bVarQ.ad());
    }
}
