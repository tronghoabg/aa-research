package com.waze.map.main;

import l.a.aja;
import l.a.ajc;
import l.a.aqk;
import l.a.aql;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as implements ar {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f29351a;

    public as(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "statsReporter");
        this.f29351a = axVar;
    }

    @Override // com.waze.map.main.ar
    public final void a(aq aqVar) {
        h.g.b.x.f(aqVar, "pinType");
        aja ajaVarNewBuilder = ajc.newBuilder();
        aqk aqkVarNewBuilder = aql.newBuilder();
        aqkVarNewBuilder.a(aqVar.a());
        aqkVarNewBuilder.b();
        ajaVarNewBuilder.g(aqkVarNewBuilder.build());
        ajc ajcVarBuild = ajaVarNewBuilder.build();
        h.g.b.x.e(ajcVarBuild, "build(...)");
        com.waze.sharedui.utils.o.w(this.f29351a, ajcVarBuild);
    }
}
