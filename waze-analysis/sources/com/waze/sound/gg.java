package com.waze.sound;

import l.a.bfi;
import l.a.bfk;
import l.a.bqs;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gg implements gf {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f40082a;

    public gg(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f40082a = axVar;
    }

    @Override // com.waze.sound.gf
    public final void a(boolean z, String str) {
        com.waze.sharedui.d.a.b bVarR = h.c.a.h.r(bqs.newBuilder());
        bfi bfiVarNewBuilder = bfk.newBuilder();
        h.g.b.x.f(bfiVarNewBuilder, "builder");
        bfiVarNewBuilder.b(z);
        if (str != null) {
            h.g.b.x.f(str, "value");
            bfiVarNewBuilder.a(str);
        }
        com.waze.stats.ax axVar = this.f40082a;
        bfk bfkVarBuild = bfiVarNewBuilder.build();
        h.g.b.x.e(bfkVarBuild, "build(...)");
        bVarR.ar(bfkVarBuild);
        com.waze.sharedui.utils.o.O(axVar, bVarR.aq());
    }
}
