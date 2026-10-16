package com.waze.c.d;

import e.a.dw;
import l.a.abt;
import l.a.abu;
import l.a.abv;
import l.a.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay implements ax {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f18334a;

    public ay(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "statsReporter");
        this.f18334a = axVar;
    }

    @Override // com.waze.c.d.ax
    public final void a(av avVar) {
        abt abtVar;
        h.g.b.x.f(avVar, "actionSource");
        com.waze.sharedui.d.a.b bVarJ = dw.j(dh.newBuilder());
        abu abuVarNewBuilder = abv.newBuilder();
        h.g.b.x.f(abuVarNewBuilder, "builder");
        aw awVar = aw.f18330a;
        av avVar2 = av.f18327a;
        int iOrdinal = avVar.ordinal();
        if (iOrdinal == 0) {
            abtVar = abt.TOP_BAR;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            abtVar = abt.MAP;
        }
        com.waze.stats.ax axVar = this.f18334a;
        h.g.b.x.f(abtVar, "value");
        abuVarNewBuilder.a(abtVar);
        abv abvVarBuild = abuVarNewBuilder.build();
        h.g.b.x.e(abvVarBuild, "build(...)");
        bVarJ.A(abvVarBuild);
        com.waze.sharedui.utils.o.g(axVar, bVarJ.t());
    }
}
