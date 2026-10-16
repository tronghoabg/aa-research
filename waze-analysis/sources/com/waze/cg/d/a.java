package com.waze.cg.d;

import com.waze.gas.GasNativeManager;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.agb;
import l.a.agc;
import l.a.agd;
import l.a.age;
import l.a.agf;
import l.a.agg;
import l.a.atn;
import l.a.atp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ax f22346a;

    public a(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f22346a = axVar;
    }

    public final void a(String str) {
        x.f(str, "content");
        agc agcVarNewBuilder = agd.newBuilder();
        agcVarNewBuilder.a(agb.CLICKED_LEADING_BUTTON);
        agcVarNewBuilder.b(str);
        x.e(agcVarNewBuilder, "apply(...)");
        atn atnVarNewBuilder = atp.newBuilder();
        atnVarNewBuilder.b(agcVarNewBuilder);
        atp atpVarBuild = atnVarNewBuilder.build();
        x.e(atpVarBuild, "build(...)");
        o.B(this.f22346a, atpVarBuild);
    }

    public final void b(String str) {
        x.f(str, "content");
        agc agcVarNewBuilder = agd.newBuilder();
        agcVarNewBuilder.a(agb.CLICKED_TRAILING_BUTTON);
        agcVarNewBuilder.b(str);
        x.e(agcVarNewBuilder, "apply(...)");
        atn atnVarNewBuilder = atp.newBuilder();
        atnVarNewBuilder.b(agcVarNewBuilder);
        atp atpVarBuild = atnVarNewBuilder.build();
        x.e(atpVarBuild, "build(...)");
        o.B(this.f22346a, atpVarBuild);
    }

    public final void c(String str) {
        x.f(str, "content");
        agc agcVarNewBuilder = agd.newBuilder();
        agcVarNewBuilder.a(agb.CLOSE);
        agcVarNewBuilder.b(str);
        x.e(agcVarNewBuilder, "apply(...)");
        atn atnVarNewBuilder = atp.newBuilder();
        atnVarNewBuilder.b(agcVarNewBuilder);
        atp atpVarBuild = atnVarNewBuilder.build();
        x.e(atpVarBuild, "build(...)");
        o.B(this.f22346a, atpVarBuild);
    }

    public final void d(String str) {
        x.f(str, "content");
        agc agcVarNewBuilder = agd.newBuilder();
        agcVarNewBuilder.a(agb.TIMEOUT);
        agcVarNewBuilder.b(str);
        x.e(agcVarNewBuilder, "apply(...)");
        atn atnVarNewBuilder = atp.newBuilder();
        atnVarNewBuilder.b(agcVarNewBuilder);
        atp atpVarBuild = atnVarNewBuilder.build();
        x.e(atpVarBuild, "build(...)");
        o.B(this.f22346a, atpVarBuild);
    }

    public final void e(String str, String str2, boolean z, Long l2, boolean z2) {
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(str2, "subtitle");
        age ageVarNewBuilder = agg.newBuilder();
        ageVarNewBuilder.g(str);
        ageVarNewBuilder.e(str2);
        ageVarNewBuilder.c(str);
        ageVarNewBuilder.b(str2);
        ageVarNewBuilder.f(l2.longValue());
        ageVarNewBuilder.d(z2);
        if (z) {
            ageVarNewBuilder.a(agf.HIDE_UPDATES);
            ageVarNewBuilder.a(agf.SHOW_UPDATES);
        } else {
            ageVarNewBuilder.a(agf.CLOSE);
        }
        x.e(ageVarNewBuilder, "apply(...)");
        atn atnVarNewBuilder = atp.newBuilder();
        atnVarNewBuilder.c(ageVarNewBuilder);
        atp atpVarBuild = atnVarNewBuilder.build();
        x.e(atpVarBuild, "build(...)");
        o.B(this.f22346a, atpVarBuild);
    }
}
