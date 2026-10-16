package com.waze.sharedui.web;

import l.a.abr;
import l.a.abs;
import l.a.brd;
import l.a.brf;
import l.a.bsn;
import l.a.bsp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw implements av {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.stats.ax f39341b;

    public aw(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f39341b = axVar;
    }

    @Override // com.waze.sharedui.web.av
    public final void a(String str, String str2, long j2, String str3) {
        h.g.b.x.f(str, "pageUrl");
        h.g.b.x.f(str2, "host");
        h.g.b.x.f(str3, "usage");
        bsn bsnVarNewBuilder = bsp.newBuilder();
        abr abrVarNewBuilder = abs.newBuilder();
        abrVarNewBuilder.a(str);
        abrVarNewBuilder.c(str2);
        abrVarNewBuilder.b(j2);
        abrVarNewBuilder.d(str3);
        bsnVarNewBuilder.a(abrVarNewBuilder);
        h.g.b.x.e(bsnVarNewBuilder, "setInAppWebPageLoad(...)");
        brd brdVarNewBuilder = brf.newBuilder();
        brdVarNewBuilder.ab(bsnVarNewBuilder);
        brf brfVarBuild = brdVarNewBuilder.build();
        h.g.b.x.e(brfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.e(this.f39341b, brfVarBuild);
    }
}
